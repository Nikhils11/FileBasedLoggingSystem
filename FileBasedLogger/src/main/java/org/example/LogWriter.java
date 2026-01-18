package org.example;
import java.io.FileWriter;


public class LogWriter {

    private final String filePath;

    public LogWriter(String filePath){
        this.filePath = filePath;
    }

    public void log(String formatedLog){
        try(FileWriter writer = new FileWriter(filePath, true)){
            writer.write(formatedLog + System.lineSeparator());
            System.out.println(formatedLog);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
