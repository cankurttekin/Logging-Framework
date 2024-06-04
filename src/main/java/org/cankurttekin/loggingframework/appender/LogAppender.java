package org.cankurttekin.loggingframework.appender;

import org.cankurttekin.loggingframework.LogMessage;

public interface LogAppender {
    void append(LogMessage logMessage);
}
