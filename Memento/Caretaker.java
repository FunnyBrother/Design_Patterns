package Memento;

import java.util.*;

public class Caretaker {
    private GameOriginator game = new GameOriginator();
    private Stack<GameMemento> quickSaves = new Stack<>();

    public void ShootThatDumbAss() {
        game.Play();
    }

    public void F5() {
        quickSaves.push(game.GameSave());
    }

    public void F9() {
        game.LoadGame(quickSaves.peek());
    }
}
