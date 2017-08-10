package Mediator;
public class Brain {
    private Ear ear;
    private Eye eye;
    private Face face;
    private Hand hand;
    private Leg leg;

    public Brain() {
        CreateBodyParts();
    }

    private void CreateBodyParts() {
        ear = new Ear(this);
        eye = new Eye(this);
        face = new Face(this);
        hand = new Hand(this);
        leg = new Leg(this);
    }

    public void SomethingHappenedToBodyPart(BodyPart bodyPart) {
        if (bodyPart.equals(ear)) {
            String heardSounds = ((Ear)bodyPart).GetSounds();

            if (heardSounds.contains("stupid")) {
                leg.StepForward();
                hand.HitPersonNearYou();
                leg.Kick();
            }
            else if (heardSounds.contains("cool")) {
                face.Smile();
            }
        } else if (bodyPart.equals(eye)) {
            // something sea
        } else if (bodyPart.equals(hand)) {
            Hand hand = (Hand)bodyPart;

            boolean hurtingFeeling = hand.DoesItHurt();
            if (hurtingFeeling) {
                leg.StepBack();
            }

            boolean itIsNice = hand.IsItNice();
            if (itIsNice) {
                leg.StepForward();
                hand.Embrace();
            }
        } else if (bodyPart.equals(leg)) {
            // leg can also feel something
        }
    }
}
