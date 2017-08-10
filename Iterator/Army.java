package Iterator;
import java.util.*;

public class Army {
    public Hero armyHero;
    public List<Group> armyGroups;

    public Army(Hero armyHero)
    {
        this.armyHero = armyHero;
        this.armyGroups = new ArrayList<>();
    }

    public void AddArmyGroup(Group group)
    {
        armyGroups.add(group);
    }
}
