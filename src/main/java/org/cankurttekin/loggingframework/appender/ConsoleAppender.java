package org.cankurttekin.loggingframework.appender;

import org.cankurttekin.loggingframework.LogMessage;

public class ConsoleAppender implements LogAppender {
    @Override
    public void append(LogMessage logMessage) {
        System.out.println(logMessage);
    }
}
