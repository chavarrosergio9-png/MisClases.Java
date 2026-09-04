import java.util.Scanner;

public class ValidacionEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = 0;

        System.out.print("Ingresa tu edad (1 a 120): ");
        edad = sc.nextInt();

        while (edad < 1 || edad > 120) {
            System.out.println("Error: Edad fuera de rango. Debe estar entre 1 y 120.");
            System.out.print("Ingresa tu edad nuevamente: ");
            edad = sc.nextInt();
        }

        if (edad <= 12) {
            System.out.println("Etapa: Niñez");
        } else if (edad <= 17) {
            System.out.println("Etapa: Adolescencia");
        } else if (edad <= 25) {
            System.out.println("Etapa: Juventud");
        } else if (edad <= 59) {
            System.out.println("Etapa: Adultez");
        } else {
            System.out.println("Etapa: Tercera edad");
        }

        sc.close();
    }
}