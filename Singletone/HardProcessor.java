package Singletone;
public class HardProcessor {
    private int start;

    public HardProcessor(int start) {
        this.start = start;
        LoggerSingletone.GetInstance().Log("Processor just created!");
    }

    public int ProcessTo(int end) {
        int sum = 0;
        for(int i = 0; i < end; i++)
            sum += i;
        LoggerSingletone.GetInstance().Log("Processor just calculated some value: " + sum);
        return sum;
    }
}
