package Abstact_Builder;

public class Laptop {
    private static String name;
    protected static String MonitorResolution;
    protected static String Processor;
    protected static String Memory;
    protected static String HDD;
    protected static String Battery;

    public Laptop() {
        name = "Laptop";
    }

    @Override
    public String toString() {
        return MonitorResolution + ", " + Processor + ", " + Memory + ", " + HDD + ", " + Battery;
    }
}
