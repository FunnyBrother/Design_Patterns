package Iterator;
public class Hero extends Soldier {
    private final int HeroHealthPoints = 500;

    @Override
    protected int MaxHealthPoints() {
        return HeroHealthPoints;
    }

    public Hero(String name) {
        super(name);
    }
}
