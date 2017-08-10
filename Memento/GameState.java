package Memento;
public class GameState {
    private int health;
    private int killedMonster;

    public GameState(int health, int killedMonster) {
        this.health = health;
        this.killedMonster = killedMonster;
    }

    public int getHealth() {
        return health;
    }

    public int getKilledMonster() {
        return killedMonster;
    }

    @Override
    public String toString() {
        return "Health: " + health + "\n Killed Monsters: " + killedMonster;
    }
}
