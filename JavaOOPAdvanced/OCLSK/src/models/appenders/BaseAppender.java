package models.appenders;

import abstractClasses.Appender;
import abstractClasses.Layout;
import models.Message;
import models.ReportLevel;


public abstract class BaseAppender implements Appender {

    private Layout layout;
    private ReportLevel threshold;
    private int messagesAppended;

    protected BaseAppender(Layout layout) {
        this.layout = layout;
        this.threshold = ReportLevel.INFO;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.threshold = reportLevel;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                this.getClass().getSimpleName(), this.layout.getClass().getSimpleName(),
                this.threshold.name(), this.messagesAppended);

    }

    protected void increaseMessagesAppended() {
        this.messagesAppended++;
    }

    protected Layout getLayout() {
        return this.layout;
    }

    protected ReportLevel getThreshold() {
        return this.threshold;
    }
}
