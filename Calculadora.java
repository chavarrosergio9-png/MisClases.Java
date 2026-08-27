import java.util.Scanner;

public class Calculadora{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Número 1: ");
    double a = sc.nextDouble();

    System.out.println("Operación (+, -, *, /): ");
    char op = sc.next().charAt(0);

    System.out.println("Número 2: ");
    double b = sc.nextDouble();

    double resultado;
    switch(op){
        case '+':
            resultado = a + b;
            System.out.println("El resultado es: " + resultado);
            break;
        case '-':
            resultado = a - b;
            System.out.println("El resultado es: " + resultado);
            break;
        case '*':
            resultado = a * b;
            System.out.println("El resultado es: " + resultado);
            break;
        case '/':
            if(b != 0){
                resultado = a / b;
             
                System.out.println("El resultado es: " + resultado);
                } else {
                System.out.println("Error: División por cero");
            }
            break;
        default:
            System.out.println("Operación inválida");
        }
    }
}
