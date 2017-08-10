package Memento;
public class GameOriginator {
    private GameState state = new GameState(100, 0);

    public void Play() {
        System.out.println(state.toString());
        state = new GameState((int)(state.getHealth()*0.9), state.getKilledMonster() + 2);
    }

    public GameMemento GameSave() {
        return new GameMemento(state);
    }

    public void LoadGame(GameMemento gameMemento) {
        state = gameMemento.GetState();
    }
}
