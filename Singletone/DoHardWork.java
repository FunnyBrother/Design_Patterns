package Singletone;
public class DoHardWork {
    public static void main(String[] args) {
        LoggerSingletone loggerSingletone = LoggerSingletone.GetInstance();
        HardProcessor hardProcessor = new HardProcessor(1);
        loggerSingletone.Log("Hard work started...");
        hardProcessor.ProcessTo(5);
        loggerSingletone.Log("Hard work finished");
    }
}
