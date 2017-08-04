package Factory_Method;
public class LoggerProviderFactory {
    LoggerProviderFactory() {}
    public static ILogger GetLogginProvider(LoggingProviders loggingProvider) {
        if(loggingProvider instanceof Enterprise)
            return new EnterpriseLogger();
        if(loggingProvider instanceof Log4Net)
            return new Log4NetLogger();
        return new EnterpriseLogger();
    }
}


