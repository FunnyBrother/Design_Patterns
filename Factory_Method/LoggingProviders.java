package Factory_Method;
public class LoggingProviders {
    LoggingProviders() {}
}

class Enterprise extends LoggingProviders {
    private static String name;
    public Enterprise() {
        super();
        this.name = "Enterprise";
    }
}

class Log4Net extends LoggingProviders {
    private static String name;
    public Log4Net() {
        super();
        this.name = "Log4Net";
    }
}
