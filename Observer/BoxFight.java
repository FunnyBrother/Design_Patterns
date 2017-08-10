package Observer;
import java.util.*;

public class BoxFight implements ISubject {
    public List<IObserver> observers;
    public int RoundNumbers;
    private Random random = new Random();
    public int BoxerAScore;
    public int BoxerBScore;

    public BoxFight() {
        observers = new ArrayList<IObserver>();
    }

    public void AttachObserver(IObserver observer) {
        observers.add(observer);
    }

    public void DetachObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void NextRound() {
        RoundNumbers++;
        BoxerAScore += random.nextInt(5);
        BoxerBScore += random.nextInt(5);

        Notify();
    }

    public void Notify() {
        for(IObserver observer: observers)
            observer.Update(this);
    }
}
