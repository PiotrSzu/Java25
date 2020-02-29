package singleton.exercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class LoggerBillPugh {
//    private static File loggingFile;

    private LoggerBillPugh(){
    }
    private static class LoggerBillPughHolder{
        private static LoggerBillPugh loggerBillPugh = new LoggerBillPugh();
    }
    public static LoggerBillPugh getInstance(){
        return LoggerBillPughHolder.loggerBillPugh;
    }

    public static void log(LEVEL level, String msg){
        LocalTime logTime = LocalTime.now();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("logBillPugh.txt", true);

        } catch (IOException e){
            e.printStackTrace();
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logTime + ", " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();
    }
}
