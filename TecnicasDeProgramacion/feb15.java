package TecnicasDeProgramacion;
import java.util.Scanner;

public class feb15 {
    
    public static void main(String[] args) {
        //int valor;
        //int dato = 5;
        //valor = (dato%2 == 0) ? 1 : 0;
        //System.out.println(valor);
        Scanner lectura = new Scanner(System.in);
        // PROGRAMA 1
        double num1 = 0.0;
        double num2 = 0.0;
        double base = 0.0;
        double altura = 0.0;
        double radio = 0.0;
        double promedio;
        double area;
        double y = 0;
        double y2 = 0;
        double x1 = 0;
        double x2 = 0;
        double x = 0;
        String respuesta;
        double respuesta2;
        System.out.println("___________________________________________________________");
        System.out.println("Este programa recibe dos números y da como salida su promedio");
        System.out.println("Escriba el primer número");
        num1 = lectura.nextDouble();
        System.out.println("Escriba el segundo número");
        num2 = lectura.nextDouble();
        promedio = 0.5 * (num1 + num2);
        System.out.println("El promedio es: " + promedio);
        System.out.println("___________________________________________________________");
        
        
        // PROGRAMA 2
        System.out.println("___________________________________________________________");
        System.out.println("Este programa recibe la medida de la base y la altura de un triángulo y da como salida su área");
        System.out.println("Escriba la medida de la base");
        base = lectura.nextDouble();
        System.out.println("Escriba la medida de la altura");
        altura = lectura.nextDouble();
        area = 0.5 * (base * altura);
        System.out.println("El área del triángulo es: " + area);
        System.out.println("___________________________________________________________");
        
        
        //PROGRAMA 3
        System.out.println("___________________________________________________________");
        System.out.println("Este programa da resuelve la siguiente ecuación y^2+xy+4x^2");
        System.out.println("Diga el valor de y");
        y = lectura.nextDouble();
        y2 = y*y;
        x1 = (-y + Math.sqrt(y2 - (16*y2) ))/(8);
        x2 = (-y - Math.sqrt(y2 - (16*y2) ))/(8);
        System.out.println("Las soluciones son: " + x1 + " y " + x2);
        System.out.println("___________________________________________________________");
        
        
        //PROGRAMA 3 EXTRA
        System.out.println("___________________________________________________________");
        System.out.println("Este programa da resuelve la siguiente ecuación y^2+xy+4x^2");
        System.out.println("Diga el valor de y");
        y = lectura.nextDouble();
        y2 = y*y;
        x = (-y2)/(y+4);
        System.out.println("Las soluciónes es: " + x);
        System.out.println("___________________________________________________________");
        

        //PROGRAMA 4
        System.out.println("___________________________________________________________");
        System.out.println("Este programa recibe el radio de un círculo y da como resultado su área ");
        System.out.println("Escriba el radio del círculo");
        radio = lectura.nextDouble();
        area = 0;
        area = 3.14159265359 * (radio * radio);
        System.out.println("El área del círculo es: " + area);
        System.out.println("___________________________________________________________");
        
        // PROGRAMA 5
        System.out.println("___________________________________________________________");
        System.out.println("Este programa devuelve el valor absoluto de un número dado");
        num1 = 0;
        num1 = lectura.nextDouble();
        num2 = -1* num1;
        respuesta2 = (num1 >= 0) ? num1 : num2;
        System.out.println(respuesta2);
        System.out.println("___________________________________________________________");
        
        //PROGRAMA 6
        System.out.println("___________________________________________________________");
        System.out.println("Este programa dice si un número es par o impar");
        num1 = 0;
        num1 = lectura.nextDouble();
        respuesta = (num1%2 == 0) ? "par": "impar";
        System.out.println(respuesta);
        System.out.println("___________________________________________________________");
        

        //PROGRAMA 7
        System.out.println("___________________________________________________________");
        System.out.println("Este programa dice si un año es bisiesto o no");
        num1 = 0;
        num1 = lectura.nextDouble();
        respuesta = (num1%4 == 0) ? "bisiesto": "no es bisiesto";
        System.out.println(respuesta);       
        System.out.println("___________________________________________________________");
    }
    
}
