import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = sc.nextDouble();

        System.out.print("Ingresa tu estatura en metros: ");
        double estatura = sc.nextDouble();

        double imc = peso / (estatura * estatura);

        System.out.printf("Tu IMC es: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Categoría: Bajo peso");
        } else if (imc <= 24.9) {
            System.out.println("Categoría: Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Categoría: Sobrepeso");
        } else {
            System.out.println("Categoría: Obesidad");
        }

        sc.close();
    }
}