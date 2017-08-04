package Factory_Method;
public class Method {
    public static void main(String[] args) {
        LoggingProviders enterprise = new Enterprise();
        ILogger iLogger = LoggerProviderFactory.GetLogginProvider(enterprise);
        iLogger.LogMessage("Factory Method");
    }
}
