import calculation.Calculation;
import calculation.Compositionnombersstring;
import calculation.Factorial;
import calculation.Steoenvariable;
import creatingexpression.Createexpression;
import creatingexpression.Expression;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        Createexpression createexpression =new Createexpression();
        createexpression.creating(expression);
        createexpression.intife(expression);
        Factorial factorial = new Factorial();
        Compositionnombersstring compositionnombersstring =new Compositionnombersstring();
        Steoenvariable steoenvariable =new Steoenvariable();
        Calculation calculation = new Calculation();
       System.out.println(calculation.count(expression,factorial,steoenvariable,compositionnombersstring));
    }
}