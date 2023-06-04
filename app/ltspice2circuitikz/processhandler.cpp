#include "processhandler.h"
#include <QDebug>
#include <QCoreApplication>

ProcessHandler::ProcessHandler(QObject *parent)
    : QObject{parent}
{

}

void ProcessHandler::runProcess(QString path)
{
    QString program = "java";
    QString executable = QCoreApplication::applicationDirPath() + "/ltspice2circuitikz.jar";
    QStringList arguments;
    arguments << "-jar" << executable << path;

    myProcess = new QProcess(this);

    connect (myProcess, SIGNAL(readyReadStandardOutput()), this, SLOT(readStandardOutput()));

    qDebug() << "Running process...";
    myProcess->start(program, arguments);

    connect(myProcess, qOverload<int, QProcess::ExitStatus >(&QProcess::finished),
            this, &ProcessHandler::processFinished);

    connect(myProcess, qOverload<QProcess::ProcessError>(&QProcess::errorOccurred),
            this, &ProcessHandler::errorOccurred);
}

void ProcessHandler::processFinished(int exitCode, QProcess::ExitStatus exitStatus)
{
    Q_UNUSED(exitStatus)

    qDebug() << "Process Finished";

    if (exitCode != QProcess::NormalExit) {
        qDebug() << "The process has not exited in a normal way!" << exitCode;
        qDebug() <<  myProcess->readAllStandardOutput();
        qDebug() <<  myProcess->readAllStandardError();

        emit processTerminatedWithErrors();
        return;
    }

    emit processTerminatedCorrectly();
}

void ProcessHandler::errorOccurred(QProcess::ProcessError error)
{
    qDebug() << "An error occurred!" << error;

    emit processTerminatedWithErrors();
}

void ProcessHandler::readStandardOutput()
{
    qDebug() <<  myProcess->readAllStandardOutput();
}
