package Strategy;
public class RainWearingStrategy implements IWearingStrategy {
    @Override
    public String getClothes() {
        return "Coat";
    }

    @Override
    public String getAccessories() {
        return "Umbrella";
    }
}
