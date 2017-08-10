package Observer;

public class ConservativePlayer implements IObserver {
    public String BoxerToPutMoneyOn;

    public void Update(ISubject subject) {
        BoxFight boxFight = (BoxFight)subject;

        if(boxFight.BoxerAScore < boxFight.BoxerBScore)
            BoxerToPutMoneyOn = "I pun on boxer B, better be safe!";
        else
            BoxerToPutMoneyOn = "I pun on boxer A, better be safe!";
        System.out.println("CONSERVATIVEPLAYER: " + BoxerToPutMoneyOn);
    }
}

