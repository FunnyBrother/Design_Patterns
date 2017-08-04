package Abstact_Builder;

public abstract class LaptopBuilder {
    protected Laptop Laptop;
    public void CreateNewLaptop() {
        Laptop = new Laptop();
    }

    public Laptop GetMyLaptop() {
        return Laptop;
    }

    public abstract void SetMonitorResolution();
    public abstract void SetProcessor();
    public abstract void SetMemory();
    public abstract void SetHDD();
    public abstract void SetBattery();
}
