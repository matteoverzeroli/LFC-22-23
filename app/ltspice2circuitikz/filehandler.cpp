#include "FileHandler.h"
#include <QFile>
#include <QTextStream>
#include <QDebug>
#include <QTextCodec>

FileHandler::FileHandler(QObject *parent)
    : QObject{parent}
{

}

const QString &FileHandler::getContent() const
{
    return content;
}

bool FileHandler::readFile(QString path)
{
    this->path = path;

    QFile fileToOpen(path);
    if (!fileToOpen.open(QIODevice::ReadOnly))
        return false;

    content = QString::fromLocal8Bit(fileToOpen.readAll());

    emit contentChanged(content);

    return true;
}

QString FileHandler::getPath() const
{
    return path;
}
