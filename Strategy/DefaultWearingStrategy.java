package Strategy;
public class DefaultWearingStrategy implements IWearingStrategy {
    @Override
    public String getClothes() {
        return "Nothing :)";
    }

    @Override
    public String getAccessories() {
        return "Nothing";
    }
}
