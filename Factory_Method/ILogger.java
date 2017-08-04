package Factory_Method;

public interface ILogger {
    void LogMessage(String message);
    void LogError(String message);
    void LogVerboseInformation(String message);
}

class Log4NetLogger implements ILogger {
    @Override
    public void LogMessage(String message) {
        System.out.println("Log4Net: " + message);
    }

    @Override
    public void LogError(String message) {

    }

    @Override
    public void LogVerboseInformation(String message) {

    }
}

class EnterpriseLogger implements ILogger {
    @Override
    public void LogMessage(String message) {
        System.out.println("Enterprise: " + message);
    }

    @Override
    public void LogError(String message) {

    }

    @Override
    public void LogVerboseInformation(String message) {

    }
}
