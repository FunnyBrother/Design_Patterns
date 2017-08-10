package Observer;
public class MainAppObserver {
    public static void main(String[] args) {
        BoxFight boxFight = new BoxFight();

        RiskyPlayer riskyPlayer = new RiskyPlayer();
        ConservativePlayer conservativePlayer = new ConservativePlayer();

        boxFight.AttachObserver(riskyPlayer);
        boxFight.AttachObserver(conservativePlayer);

        boxFight.NextRound();
        boxFight.NextRound();
        boxFight.NextRound();
        boxFight.NextRound();
    }
}
