package singleton.exercise;

import java.io.File;

public enum LoggerEnum {
    INSTANCE;
    private static LoggerLazy instance;
    private static File loggingFile;

    public static LoggerLazy getInstance() {
        return instance;
    }

    public static void setInstance(LoggerLazy instance) {
        LoggerEnum.instance = instance;
    }

    public static File getLoggingFile() {
        return loggingFile;
    }

    public static void setLoggingFile(File loggingFile) {
        LoggerEnum.loggingFile = loggingFile;
    }
}
