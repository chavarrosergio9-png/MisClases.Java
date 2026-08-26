import java.util.Scanner;

public class AreaCirculo2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        // pedir el radio
        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        // calcular el area
        double area = Math.PI * radio * radio;

        // mostrar el resultado
        System.out.println("El area del circulo es: " + area);
    }
}
