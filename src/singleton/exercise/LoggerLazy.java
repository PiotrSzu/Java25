package singleton.exercise;

import java.io.*;
import java.time.LocalTime;

public class LoggerLazy {
    private static LoggerLazy instance;
    private static File loggingFile;
    private LoggerLazy(){
    }
    public static LoggerLazy getInstance(){
        if(instance == null){
            instance = new LoggerLazy();
        }
        return null;
    }

    public static void log(LEVEL level, String msg){
        LocalTime logTime = LocalTime.now();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("log.txt", true);

        } catch (IOException e){
            e.printStackTrace();
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logTime + ", " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();
    }
}
