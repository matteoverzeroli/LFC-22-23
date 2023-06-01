#ifndef PROCESSHANDLER_H
#define PROCESSHANDLER_H

#include <QObject>
#include <QProcess>

class ProcessHandler : public QObject
{
    Q_OBJECT
public:
    explicit ProcessHandler(QObject *parent = nullptr);

    void runProcess(QString path);

signals:
    void processTerminatedWithErrors();
    void processTerminatedCorrectly();

public slots:
    void processFinished(int exitCode, QProcess::ExitStatus exitStatus);
    void readStandardOutput();

private slots:
    void errorOccurred(QProcess::ProcessError error);
private:
    QProcess *myProcess {nullptr};
};

#endif // PROCESSHANDLER_H
