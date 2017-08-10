package Command;
import java.util.*;

public class Team {
    private String projectName;

    public Team(String projectName) {
        this.projectName = projectName;
    }

    public void CompleteProject(List<Requirement> requirement) {
        System.out.println("User Story (" + requirement.toString() + ")has been completed");
    }
}
