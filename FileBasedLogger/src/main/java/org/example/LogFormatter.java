package org.example;

public class LogFormatter {

    public String formate(LogEntry logEntry){
        String logString = logEntry.getLevel().toString()
                            + " " + logEntry.getMessage()
                            + " " + logEntry.getLocalTime().toString();
        return logString;
    }
}
