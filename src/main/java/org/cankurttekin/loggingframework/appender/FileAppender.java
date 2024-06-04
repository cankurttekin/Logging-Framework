package org.cankurttekin.loggingframework.appender;

import org.cankurttekin.loggingframework.LogMessage;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements LogAppender {
    private final String loggingFilePath;

    public FileAppender(String loggingFilePath) {
        this.loggingFilePath = loggingFilePath;
    }

    @Override
    public void append(LogMessage logMessage) {
        try (FileWriter writer = new FileWriter(loggingFilePath, true)) {
            writer.write(logMessage.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
