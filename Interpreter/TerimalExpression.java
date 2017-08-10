package Interpreter;
public class TerimalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        System.out.println("Called Terminal.Interpter()");
    }
}
