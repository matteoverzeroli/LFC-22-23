#include "mainwindow.h"
#include "ui_mainwindow.h"

#include <QMessageBox>
#include <QCoreApplication>
#include <QDesktopServices>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
    , runningProcessTimer(new QTimer(this))
    , ascFileHandler(new FileHandler(this))
    , errorFileHandler(new FileHandler(this))
    , latexFileHandler(new FileHandler(this))
    , formattedFileHandler(new FileHandler(this))
    , processHandler(new ProcessHandler(this))

{
    ui->setupUi(this);

    setWindowTitle("Ltspice2circuitikz");

    createActions();
    createDockWidgets();

    runningProcessTimer->setSingleShot(false);

    connect(processHandler, &ProcessHandler::processTerminatedCorrectly, this, &MainWindow::processTerminated);
    connect(processHandler, &ProcessHandler::processTerminatedWithErrors, this, &MainWindow::processEncounteredErrors);
    connect(runningProcessTimer, &QTimer::timeout, [this](){
        if (ui->statusbar->currentMessage() == "Running") ui->statusbar->showMessage("Running.");
        else if (ui->statusbar->currentMessage() == "Running.") ui->statusbar->showMessage("Running..");
        else if (ui->statusbar->currentMessage() == "Running..") ui->statusbar->showMessage("Running...");
        else ui->statusbar->showMessage("Running");
    });

}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::createActions()
{

    QMenu *fileMenu = menuBar()->addMenu(tr("&File"));
    QToolBar *fileToolBar = addToolBar(tr("File"));

    const QIcon openIcon = QIcon::fromTheme("document-new", QIcon(":/images/open-folder.png"));
    QAction *openFile = new QAction(openIcon, tr("&Open File"), this);
    openFile->setShortcuts(QKeySequence::New);
    openFile->setStatusTip(tr("Open a .ASC file"));
    connect(openFile, &QAction::triggered, this, &MainWindow::openAscFile);
    fileMenu->addAction(openFile);
    fileToolBar->addAction(openFile);

    const QIcon reload = QIcon::fromTheme("document-new", QIcon(":/images/refresh.png"));
    QAction *refreshFile = new QAction(reload, tr("&Refresh"), this);
    refreshFile->setShortcuts(QKeySequence::New);
    refreshFile->setStatusTip(tr("Refresh .ASC file"));
    connect(refreshFile, &QAction::triggered, this, &MainWindow::refreshASCFile);
    fileMenu->addAction(refreshFile);
    fileToolBar->addAction(refreshFile);

    const QIcon newIcon = QIcon::fromTheme("document-new", QIcon(":/images/play-button.png"));
    QAction *runProgram = new QAction(newIcon, tr("&Run"), this);
    runProgram->setShortcuts(QKeySequence::New);
    runProgram->setStatusTip(tr("Run"));
    connect(runProgram, &QAction::triggered, this, &MainWindow::runAntlrCompiler);
    fileMenu->addAction(runProgram);
    fileToolBar->addAction(runProgram);

    viewMenu = menuBar()->addMenu(tr("&View"));

    menuBar()->addSeparator();

    QMenu *helpMenu = menuBar()->addMenu(tr("&Help"));

    QAction *aboutAct = helpMenu->addAction(tr("&About"), this, &MainWindow::about);
    aboutAct->setStatusTip(tr("Show the application's About box"));

    QAction *aboutQtAct = helpMenu->addAction(tr("About &Qt"), qApp, &QApplication::aboutQt);
    aboutQtAct->setStatusTip(tr("Show the Qt library's About box"));
}

void MainWindow::createDockWidgets()
{
    ui->centralwidget->hide();

    QDockWidget *dock = new QDockWidget(tr("ASC File"), this);
    ascTextEdit = new QPlainTextEdit(dock);
    ascTextEdit->setReadOnly(true);
    dock->setWidget(ascTextEdit);
    addDockWidget(Qt::LeftDockWidgetArea, dock);
    viewMenu->addAction(dock->toggleViewAction());

    connect(ascFileHandler, &FileHandler::contentChanged, ascTextEdit, &QPlainTextEdit::setPlainText);

    dock = new QDockWidget(tr("Application Output"), this);
    errorListTextEdit = new QPlainTextEdit(dock);
    errorListTextEdit->setReadOnly(true);
    dock->setWidget(errorListTextEdit);
    dock->setMaximumHeight(400);
    addDockWidget(Qt::LeftDockWidgetArea, dock);
    viewMenu->addAction(dock->toggleViewAction());

    connect(errorFileHandler, &FileHandler::contentChanged, errorListTextEdit, &QPlainTextEdit::setPlainText);

    dock = new QDockWidget(tr("Latex Output"), this);
    latexTextEdit = new QPlainTextEdit(dock);
    latexTextEdit->setReadOnly(true);
    dock->setWidget(latexTextEdit);
    addDockWidget(Qt::RightDockWidgetArea, dock);
    viewMenu->addAction(dock->toggleViewAction());

    connect(latexFileHandler, &FileHandler::contentChanged, latexTextEdit, &QPlainTextEdit::setPlainText);

    dock = new QDockWidget(tr("Formatted ASC File"), this);
    formattedAscTextEdit = new QPlainTextEdit(dock);
    formattedAscTextEdit->setReadOnly(true);
    dock->setWidget(formattedAscTextEdit);
    dock->setVisible(false);
    addDockWidget(Qt::RightDockWidgetArea, dock);
    viewMenu->addAction(dock->toggleViewAction());

    connect(formattedFileHandler, &FileHandler::contentChanged, formattedAscTextEdit, &QPlainTextEdit::setPlainText);

}

void MainWindow::openAscFile()
{
    QString fileName = QFileDialog::getOpenFileName(this,
                            tr("Open .ASC File"), "", tr(".ASC File (*.asc)"));

    if (fileName.isEmpty())
        return;

    ascFileHandler->readFile(fileName);

    latexTextEdit->setPlainText("");
    formattedAscTextEdit->setPlainText("");
}

void MainWindow::runAntlrCompiler()
{
    QString path = ascFileHandler->getPath();
    if (path.isEmpty()) {
        QMessageBox::warning(this, "Attention!", "No .ASC file opened! Open an .ASC file and retry.", QMessageBox::Ok);
        return;
    }

    latexTextEdit->setPlainText("");
    formattedAscTextEdit->setPlainText("");
    errorListTextEdit->setPlainText("");

    processHandler->runProcess(path);

    runningProcessTimer->start(1000);
}

void MainWindow::refreshASCFile()
{
    if (ascFileHandler->getPath().isEmpty()) {
        QMessageBox::warning(this, "Attention!", "No .ASC file opened! Open an .ASC file and retry.", QMessageBox::Ok);
        return;
    }

    ascFileHandler->readFile(ascFileHandler->getPath());
}

void MainWindow::processTerminated()
{
    qDebug() << "Process terminated correctly!";

    runningProcessTimer->stop();
    ui->statusbar->showMessage("Process finished", 5000);

    if (QFile::exists("./logs/errors.log")) {
        qDebug() << "There has been errors";

        errorFileHandler->readFile("./logs/errors.log");
        errorListTextEdit->setStyleSheet("color:red;");
        latexTextEdit->setPlainText("");
        formattedAscTextEdit->setPlainText("");

        return;
    }

    latexFileHandler->readFile("./latex_output/translated_circuit.tex");
    formattedFileHandler->readFile("./circuit_output/formatted_circuit.asc");
    errorListTextEdit->setStyleSheet("color:green;");
    errorListTextEdit->setPlainText("Latex output produced correctly!");

    QDesktopServices::openUrl(QUrl::fromLocalFile("./latex_output/translated_circuit.pdf"));
}

void MainWindow::processEncounteredErrors()
{
    QMessageBox::warning(this, "Error!", "Some errors occour while running the process. Please contact us on github.", QMessageBox::Ok);

    runningProcessTimer->stop();

}

void MainWindow::about()
{
    QMessageBox::about(this, tr("About ltspice2circuitikz"),
                       tr("The <b>ltspice2circuitikz</b> is an amazing software that helps you translate "
                          ".ASC file into latex output that you can copy and paste into your report."));
}

