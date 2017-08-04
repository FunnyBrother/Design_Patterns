package Abstact_Builder;
public class BuyLaptop {
    private LaptopBuilder laptopBuilder;

    public void SetLaptopBuilder(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop GetLaptop() {
        return laptopBuilder.GetMyLaptop();
    }

    public void ConstructLaptop() {
        laptopBuilder.CreateNewLaptop();
        laptopBuilder.SetMonitorResolution();
        laptopBuilder.SetProcessor();
        laptopBuilder.SetMemory();
        laptopBuilder.SetHDD();
        laptopBuilder.SetBattery();
    }
}
