package org.example;


public class Logger {

    private final LogFormatter logFormatter;

    private final LogWriter logWriter;

    public Logger(String filePath){
        this.logFormatter = new LogFormatter();
        this.logWriter = new LogWriter(filePath);
    }

    public void logEntry(LogEntry logEntry){
        String formatedString = logFormatter.formate(logEntry);
        logWriter.log(formatedString);
    }

    public void info(String message) {
        LogEntry logEntry = new LogEntry(LoggingLevel.INFO, message);
        logEntry(logEntry);
    }

    public void debug(String message) {
        LogEntry logEntry = new LogEntry(LoggingLevel.DEBUG, message);
    }

    public void error(String message) {
        LogEntry logEntry = new LogEntry(LoggingLevel.ERROR, message);
    }

}


