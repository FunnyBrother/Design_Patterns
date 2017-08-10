package Command;

import java.util.*;

public class TestCommand {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Team team = new Team("Z");
        List<Requirement> requirement = new ArrayList<>(Arrays.asList(new Requirement("Cool web site"),
                new Requirement("Ability to book beer on site")));

        ICommand commandX = new YourAsProjectManagerCommand(team, requirement);
        customer.AddCommand(commandX);

        HeroDeveloper heroDeveloper = new HeroDeveloper();

        ICommand commandA = new HeroDevepolerCommand(heroDeveloper, "A");
        customer.AddCommand(commandA);

        customer.SignContractWithBoss();
    }
}
