package Command;
import java.util.*;

class YourAsProjectManagerCommand implements ICommand {
    protected Team team;
    protected List<Requirement> requirements;

    public YourAsProjectManagerCommand(Team team, List<Requirement> requirements) {
        this.team = team;
        this.requirements = requirements;
    }

    @Override
    public void Execute() {
        team.CompleteProject(requirements);
    }
}