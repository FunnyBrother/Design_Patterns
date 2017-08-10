package Visitor;
import java.util.*;

public class OfficeBuilding implements IElement {
    private List<Floor> floors = new ArrayList<>();
    public String buildingName;
    public int age;
    public int electricitySystemId;
    public Enumeration<Floor> Floors;

    public OfficeBuilding(String buildingName, int age, int electricitySystemId) {
        this.buildingName = buildingName;
        this.age = age;
        this.electricitySystemId = electricitySystemId;
    }

    public void AddFloor(Floor floor) {
        floors.add(floor);
    }

    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
        for (Floor floor : floors)
            floor.Accept(visitor);
    }
}
