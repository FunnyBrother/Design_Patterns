package Mediator;
import java.util.Scanner;

class Eye extends BodyPart {
        private Scanner in = new Scanner(System.in);
        private String thingsAround = null;

        public Eye(Brain brain) {
            super(brain);
        }

        public void SeeSomething() {
            System.out.println("Enter what you see:");
            thingsAround = in.nextLine();

            Changed();
        }
}
