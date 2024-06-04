package org.cankurttekin.loggingframework;

import org.cankurttekin.loggingframework.appender.ConsoleAppender;
import org.cankurttekin.loggingframework.appender.FileAppender;

public class LoggingExample {

    public static void run() {
        Logger myLogger = Logger.getInstance();

        // Setting log level to DEBUG and Appender to ConsoleAppender
        LoggerConfig config = new LoggerConfig(LogLevel.DEBUG,
                                                //new FileAppender("LoggingToFileExample.log"));
                                                new ConsoleAppender());
        myLogger.setConfig(config);

        myLogger.debug("debug message");
        myLogger.info("information message");
        myLogger.warning("warning message");
        myLogger.error("error message");
        myLogger.fatal("fatal message");
    }
}
