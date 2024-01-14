package creatingexpression;

import java.util.Scanner;
public class Createexpression {
    private String expression;
    Scanner scanner = new Scanner(System.in);
   public void creating(Expression expression){
       System.out.println("Введите 2 числа");
       expression.setNomberone(scanner.nextInt());
       System.out.println("Two");
       expression.setNombertwo(scanner.nextInt());
       System.out.println("Введите степень");
       expression.setDegree(scanner.nextInt());
       System.out.println(expression.getDegree() + "p");
   }
   public void intife(Expression expression){
       System.out.println("Введите два неизвестных");
       expression.variableone = scanner.nextLine();
       System.out.println("One");
       expression.variableone = scanner.nextLine();
       System.out.println("Two");
       expression.variabletwo = scanner.nextLine();
   }

}
