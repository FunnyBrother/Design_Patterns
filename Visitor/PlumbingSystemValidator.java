package Visitor;
public class PlumbingSystemValidator implements IVisitor {
    public void Visit(OfficeBuilding building) {
        String plumbingState = (building.age < 30) ? "Good" : "Bad";
        String buildingAge = (building.age < 30) ? "New" : "Old";
        System.out.format("Plumbing state of building %s probably is in %s " +
                "condition, since building is %s.", building.buildingName, plumbingState, buildingAge);
    }

    public void Visit(Floor floor) {
        System.out.format("Diagnosting plumbing on floor %d.", floor.floorNumber);
    }

    public void Visit(Room room) {
        // we do nothing
    }
}
