package Iterator;
import java.util.*;
public class Group {
    public List<Soldier> soldiers;

    public Group()
    {
        soldiers = new ArrayList<>();
    }

    public void AddNewSoldier(Soldier soldier)
    {
        soldiers.add(soldier);
    }
}
