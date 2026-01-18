package org.example;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = new Logger("B://log.txt");
        System.out.println(new File("B://log.txt").exists());
        logger.info("Let see what happens");
    }
}
