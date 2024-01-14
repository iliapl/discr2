package calculation;

import creatingexpression.Expression;

public class Steoenvariable {
    public String vozvedenievstepen(String variable, int stepen){
        String string = variable;
        if(stepen == 0 || stepen == 1){
            if(stepen == 0){
            variable = null;
            }
            else{
                variable = variable;
            }
        }
        else{
            for(int i = 2; i <= stepen; i++){
             variable = variable + string;
            }
        }
        return variable;
    }
}
