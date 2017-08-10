package Mediator;

import java.util.Scanner;
import java.util.*;

class Hand extends BodyPart {
        private boolean isSoft;
        private boolean isHurting;

        public Hand(Brain brain) {
            super(brain);
        }

        public void FeelSomething() {
            System.out.println("What you feel is soft? (Yes/No)");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            List<String> listOfAnswer = new ArrayList<>(Arrays.asList(answer.split("")));

            if (answer != null && listOfAnswer.get(0).equals('Y'))
                isSoft = true;
            System.out.println("What you feel is hurting? (Yes/No)");
            answer = in.nextLine();
            listOfAnswer = Arrays.asList(answer.split(""));
            if (answer != null && listOfAnswer.get(0).equals("Y"))
            isHurting = true;

            Changed();
        }

        public void HitPersonNearYou() {
        System.out.println("HAND: Just hit offender...");
        }

        public void Embrace() {
        System.out.println("HAND: Embracing what is in front of you...");
        }

        public boolean DoesItHurt() {
        return isHurting;
        }

        public boolean IsItNice() {
        return !isHurting && isSoft;
        }
}
