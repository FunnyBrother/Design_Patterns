package Observer;
public class RiskyPlayer implements IObserver {
    public String BoxerToPutMoneyOn;

    public void Update(ISubject subject) {
        BoxFight boxFight = (BoxFight)subject;

        if(boxFight.BoxerAScore > boxFight.BoxerBScore)
            BoxerToPutMoneyOn = "I pun on boxer B, if he win I get more!";
        else
            BoxerToPutMoneyOn = "I pun on boxer A, if he win I get more!";
        System.out.println("RISKYPLAYER: " + BoxerToPutMoneyOn);
    }
}
