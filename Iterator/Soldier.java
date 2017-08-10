package Iterator;
public class Soldier {
    public String name;
    public int health;
    private final int SoldierHealthPointh = 100;

    protected int MaxHealthPoints() {
        return SoldierHealthPointh;
    }

    public Soldier(String name) {
        this.name = name;
    }

    public void Treat() {
        health = MaxHealthPoints();
        System.out.println(health);
    }
}
