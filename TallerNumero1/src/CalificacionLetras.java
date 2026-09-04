import java.util.Scanner;

public class CalificacionLetras{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la nota (0.0 a 5.0): ");
        double nota = sc.nextDouble();

        if (nota >= 4.6 && nota <= 5.0) {
            System.out.println("Calificación: A (Excelente)");
        } else if (nota >= 4.0 && nota < 4.6) {
            System.out.println("Calificación: B (Sobresaliente)");
        } else if (nota >= 3.5 && nota < 4.0) {
            System.out.println("Calificación: C (Aceptable)");
        } else if (nota >= 3.0 && nota < 3.5) {
            System.out.println("Calificación: D (Aprobado mínimo)");
        } else if (nota >= 0.0 && nota < 3.0) {
            System.out.println("Calificación: F (Reprobado)");
        } else {
            System.out.println("Nota fuera de rango.");
        }

        sc.close();
    }
}