#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QDockWidget>
#include <QPlainTextEdit>
#include <QMessageBox>
#include <QToolBar>
#include <QFileDialog>
#include <QTimer>

#include "processhandler.h"
#include "filehandler.h"

QT_BEGIN_NAMESPACE
namespace Ui { class MainWindow; }
QT_END_NAMESPACE

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    MainWindow(QWidget *parent = nullptr);
    ~MainWindow();

private slots:
    void about();
    void openAscFile();
    void runAntlrCompiler();
    void processTerminated();
    void refreshASCFile();
private:
    Ui::MainWindow *ui;
    QPlainTextEdit *ascTextEdit;
    QPlainTextEdit *errorListTextEdit;
    QPlainTextEdit *latexTextEdit;
    QPlainTextEdit *formattedAscTextEdit;
    QTimer *runningProcessTimer;

    QMenu *viewMenu;

    FileHandler *ascFileHandler;
    FileHandler *errorFileHandler;
    FileHandler *latexFileHandler;
    FileHandler *formattedFileHandler;
    ProcessHandler *processHandler;



    void createActions();
    void createDockWidgets();
};
#endif // MAINWINDOW_H
