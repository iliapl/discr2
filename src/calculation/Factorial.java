package calculation;

public class Factorial {
    public int factorial(double a){
        int h = 0;
        for(int k =0; k <= a;k++){
            if(k == 0){
                h = 1;
            }
            else {
                h = h * k;
            }
        }
        return h;
    }
}
