import java.util.Scanner;

public class areaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la base del rectangulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingresa la altura del rectangulo: ");
        double altura = sc.nextDouble();

        System.out.print("Ingresa el radio del circulo: ");
        double radio = sc.nextDouble();

        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);

        double areaCirculo = Math.PI * radio * radio;
        double circunferencia = 2 * Math.PI * radio;

        System.out.printf("area del rectangulo: %.2f%n", areaRectangulo);
        System.out.printf("Perimetro del rectangulo: %.2f%n", perimetroRectangulo);

        System.out.printf("area del circulo: %.2f%n", areaCirculo);
        System.out.printf("Circunferencia del circulo: %.2f%n", circunferencia);

        sc.close();
    }
}

// Math.PI es una constante que representa el valor de pi
