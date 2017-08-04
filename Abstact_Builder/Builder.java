package Abstact_Builder;
public class Builder {
    public static void main(String[] args) {
        LaptopBuilder tripBuilder = new TripLaptopBuilder();
        LaptopBuilder gamingBuilder = new GammingLaptopBuilder();
        BuyLaptop shopForYou = new BuyLaptop();

        shopForYou.SetLaptopBuilder(gamingBuilder);
        shopForYou.ConstructLaptop();

        Laptop laptop = shopForYou.GetLaptop();
        System.out.println(laptop.toString());
    }
}
