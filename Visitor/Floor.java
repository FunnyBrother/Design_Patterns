package Visitor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

class Floor implements IElement {
    private List<Room> rooms = new ArrayList<>();
    public int floorNumber;
    public Enumeration<Room> Rooms;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public void AddRoom(Room room) {
        rooms.add(room);
    }
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
        for (Room room: rooms) {
            room.Accept(visitor);
        }
    }
}
