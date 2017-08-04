package Singletone;
public class LoggerSingletone {
    private int logCount = 0;
    private static LoggerSingletone loggerSingletoneInstance = null;

    private LoggerSingletone() {}

    public static LoggerSingletone GetInstance() {
        if(loggerSingletoneInstance == null) {
            loggerSingletoneInstance = new LoggerSingletone();
        }
        return loggerSingletoneInstance;
    }

    public void Log(String message) {
        System.out.println(logCount + ": " + message);
        logCount++;
    }

}
