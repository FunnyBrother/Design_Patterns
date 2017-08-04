package Abstact_Builder;
public class TripLaptopBuilder extends LaptopBuilder {
    public void SetMonitorResolution() {
        Laptop.MonitorResolution = "1280X800";
    }

    @Override
    public void SetProcessor() {
        Laptop.Processor = "Pentium 4, 3.2 GHz ";
    }

    @Override
    public void SetMemory() {
        Laptop.Memory = "2048 Mb";
    }

    @Override
    public void SetHDD() {
        Laptop.HDD = "160 Gb";
    }

    @Override
    public void SetBattery() {
        Laptop.Battery = "4 lbs";
    }
}
