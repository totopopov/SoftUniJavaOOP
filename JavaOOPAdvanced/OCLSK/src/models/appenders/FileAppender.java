package models.appenders;

import abstractClasses.File;
import abstractClasses.Layout;
import models.LogFile;
import models.Message;
import models.ReportLevel;


public class FileAppender extends BaseAppender {

    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    @Override
    public void appendMessage(Message message) {
        if (message.getReportLevel().ordinal() < super.getThreshold().ordinal()) {
            return;
        }
        this.file.write(super.getLayout().formatMessage(message));
        super.increaseMessagesAppended();
    }

    @Override
    public String toString() {
        return super.toString() + ", File size: " + this.file.getSize();
    }

    public void setFile(File file) {
        this.file = file;
    }
}
