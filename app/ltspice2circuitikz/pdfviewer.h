#ifndef PDFVIEWER_H
#define PDFVIEWER_H

#include <QObject>

class PdfViewer : public QObject
{
    Q_OBJECT
public:
    explicit PdfViewer(QObject *parent = nullptr);

signals:

};

#endif // PDFVIEWER_H
