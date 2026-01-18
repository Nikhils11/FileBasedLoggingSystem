package org.example;


import java.time.LocalTime;

public class LogEntry {

    private LoggingLevel level;
    private String message;
    private LocalTime localTime;

    public LogEntry(LoggingLevel level, String message){
        this.level = level;
        this.message = message;
        this.localTime =  LocalTime.now();
    }

    public LogEntry(){
        this.localTime =  LocalTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public LocalTime getLocalTime(){
        return this.localTime;
    }

}
