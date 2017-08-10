package Mediator;
class BodyPart {
    private Brain brain;

    public BodyPart(Brain brain) {
        this.brain = brain;
    }

    public void Changed() {
        brain.SomethingHappenedToBodyPart(this);
    }
}
