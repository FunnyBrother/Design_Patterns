package Mediator;
class Face extends BodyPart {
    public Face(Brain brain) {
        super(brain);
    }

    public void Smile() {
        System.out.println("FACE: smiling");
    }
}
