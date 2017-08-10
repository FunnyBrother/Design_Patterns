package Command;
import java.util.*;

public class Customer {
    protected List<ICommand> commands;

    public Customer() {
        commands = new ArrayList<>();
    }

    public void AddCommand(ICommand command) {
        commands.add(command);
    }

    public void SignContractWithBoss() {
        for(ICommand mCommands : commands)
            mCommands.Execute();
    }
}
