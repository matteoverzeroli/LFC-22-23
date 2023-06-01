#ifndef FILEHANDLER_H
#define FILEHANDLER_H

#include <QObject>

class FileHandler : public QObject
{
    Q_OBJECT
public:
    explicit FileHandler(QObject *parent = nullptr);

    const QString &getContent() const;
    QString getPath() const;
    bool readFile(QString path);

signals:
    void contentChanged(QString &content);

private:
    QString content;
    QString path;


};

#endif // FILEHANDLER_H
