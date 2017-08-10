package Interpreter;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Context context = new Context();

        List<AbstractExpression> list = new ArrayList<>();

        list.add(new TerimalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerimalExpression());
        list.add(new NonTerminalExpression());

        for(AbstractExpression exp : list)
            exp.Interpret(context);
    }
}
