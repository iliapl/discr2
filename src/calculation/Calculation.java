package calculation;

import creatingexpression.Expression;


public class Calculation {
    private double[] peremk;
    private double peremn;
    private double[] peremnk;
    String string = null;
    public String count(Expression expression, Factorial factorial, Steoenvariable steoenvariable, Compositionnombersstring compositionnombersstring){
        peremn = factorial.factorial(expression.getDegree());
        peremnk = new double[expression.getDegree()+1];
        peremk = new double[expression.getDegree()+1];
        for (int k = 0; k<expression.getDegree() + 1; k++){
            if(k == 0){
                peremk[0] = 1;
                peremnk[0] = factorial.factorial(expression.getDegree() - k);
            }
            else {
                peremk[k] = peremk[k-1] * k;
                peremnk[k] = factorial.factorial(expression.getDegree() - k);
            }
        }


        for(int p=0; p < expression.getDegree() + 1; p++){
            if(p == 0) {
                string =  compositionnombersstring.composition(steoenvariable.vozvedenievstepen(expression.getVariableone(), expression.getDegree() - p),
                        steoenvariable.vozvedenievstepen(expression.getVariabletwo(), p),(peremn/(peremk[p]*peremnk[p])) * Math.pow(expression.getNomberone(), expression.getDegree() - p),  Math.pow(expression.getNombertwo(), p));
            }
            else {
                string = string + " " + "+" + " " + compositionnombersstring.composition(steoenvariable.vozvedenievstepen(expression.getVariableone(), expression.getDegree() - p),
                        steoenvariable.vozvedenievstepen(expression.getVariabletwo(), p), (peremn/(peremk[p]*peremnk[p])) * Math.pow(expression.getNomberone(), expression.getDegree() - p), Math.pow(expression.getNombertwo(), p));
            }
        }
        return string;
    }
}
