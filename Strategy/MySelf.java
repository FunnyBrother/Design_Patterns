package Strategy;
class MySelf {
    private IWearingStrategy iWearingStrategy = new DefaultWearingStrategy();

    public void ChangeStrategy(IWearingStrategy iWearingStrategy) {
        this.iWearingStrategy = iWearingStrategy;
    }

    public void GoOutside() {
        String clother = iWearingStrategy.getClothes();
        String accessories = iWearingStrategy.getAccessories();

        System.out.println("Today I wore " + clother + " and took " + accessories);
    }
}
