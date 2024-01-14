package calculation;

import java.util.Objects;

public class Compositionnombersstring {
    public String composition(double i, String string){
        if(i == 0 || string == null){  return " ";}
        else {
       return i + string;
        }
    }
    public String composition(String a, String b, double ia, double ib){
        String string = null;
        if(Objects.equals(composition(ia, a), " ") || Objects.equals(composition(ib, b), " ")) {
            if (Objects.equals(composition(ia, a), " ") && !Objects.equals(composition(ib, b), " ")) {
                string = composition(ib, b);
            }
            if (Objects.equals(composition(ib, b), " ") && !Objects.equals(composition(ia, a), " ")) {
                string = composition(ia, a);
            }
            if(Objects.equals(composition(ib, b), " ") && Objects.equals(composition(ia, a), " ")){
                string = " ";
            }
        }
        else {
            if (!Objects.equals(composition(ib, b), " ") && !Objects.equals(composition(ib, b), " ")) {
                string = ib * ia + a + b;
            }
        }
        return string;
    }

}
