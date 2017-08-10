package Mediator;
import java.util.*;

class Ear extends BodyPart {
    private Scanner in = new Scanner(System.in);
    private String sounds = null;

    public Ear(Brain brain) {
        super(brain);
    }

    public void HearSomething() {
        System.out.println("Enter what you hear:");
        sounds = in.nextLine();

        Changed();
    }

    public String GetSounds() {
        return sounds;
    }
}
