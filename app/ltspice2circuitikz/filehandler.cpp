#include "FileHandler.h"
#include <QFile>

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

    content = QString::fromLatin1(fileToOpen.readAll());

    emit contentChanged(content);

    return true;
}

QString FileHandler::getPath() const
{
    return path;
}
