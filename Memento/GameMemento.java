package Memento;
public class GameMemento {
    private GameState state;

    public GameMemento(GameState state) {
        this.state = state;
    }

    public GameState GetState() {
        return state;
    }
}
