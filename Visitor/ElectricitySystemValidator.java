package Visitor;
public class ElectricitySystemValidator implements IVisitor {
    public void Visit(OfficeBuilding building) {
        String electricityState = (building.electricitySystemId > 1000) ? "Good" : "Bad";

        System.out.format("Main electric shield in building %s is in %s state", building.buildingName, electricityState);
    }

    public void Visit(Floor floor) {
        System.out.format("Diagnosting electricity on floor %d", floor.floorNumber);
    }

    public void Visit(Room room) {
        System.out.format("Diagnosting electricity in room %d", room.roomNumber);
    }
}
