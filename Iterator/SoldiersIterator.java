package Iterator;
import java.lang.*;
import java.util.*;

public class SoldiersIterator {
    private Army army;
    private boolean heroIsIterated;
    private int currentGroup;
    private int currentGroupSoldier;

    public SoldiersIterator(Army army) {
        this.army = army;
        heroIsIterated = false;
        currentGroup = 0;
        currentGroupSoldier = 0;
    }

    public boolean HasNext() {
        if(!heroIsIterated) return true;
        if(currentGroup < army.armyGroups.size()) return true;
        if(currentGroup == army.armyGroups.size() - 1)
            if(currentGroupSoldier < army.armyGroups.get(currentGroup).soldiers.size())
                return true;
        return false;
    }

    public Soldier Next() throws Exception {
        Soldier nextSoldier;
        if (currentGroup < army.armyGroups.size()) {
            if (currentGroupSoldier < army.armyGroups.get(currentGroup).soldiers.size()) {
                nextSoldier = army.armyGroups.get(currentGroup).soldiers.get(currentGroupSoldier);
                currentGroupSoldier++;
            } else {
                currentGroup++;
                currentGroupSoldier++;
                return Next();
            }
        } else if (!heroIsIterated) {
            heroIsIterated = true;
            return army.armyHero;
        } else {
            throw new Exception("End of collection");
        }
        return nextSoldier;
    }
}
