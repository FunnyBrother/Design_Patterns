package Strategy;
public class MainAppStrategy {
    public static void main(String[] args) {
        MySelf me = new MySelf();
        me.ChangeStrategy(new RainWearingStrategy());
        me.GoOutside();
    }
}
