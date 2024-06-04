package org.cankurttekin.loggingframework;

public class LogMessage {
    private final long timestamp;
    private final String message;
    private final LogLevel level;

    public LogMessage(LogLevel level, String message) {
        this.level = level;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public LogLevel getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "LogMessage{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", level=" + level +
                '}';
    }
}
