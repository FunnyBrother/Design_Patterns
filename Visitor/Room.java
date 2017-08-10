package Visitor;
public class Room implements IElement {
    public int roomNumber;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
