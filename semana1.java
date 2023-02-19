import java.util.Scanner;

public class semana1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        System.out.println("programa 1"); 
        System.out.println("Digíte el número 1");
        num1 = sc.nextDouble();
        System.out.println("Digíte el número 2");
        num2 = sc.nextDouble();
        System.out.println("el promedio es: " + 0.5*(num1+num2));

    }

}
