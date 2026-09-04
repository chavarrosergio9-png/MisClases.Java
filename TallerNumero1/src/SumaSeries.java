import java.util.Scanner;

public class SumaSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de términos (n): ");
        int n = sc.nextInt();

        // 1. Naturales
        int sumaNaturales = 0;
        for (int i = 1; i <= n; i++) {
            sumaNaturales += i;
        }
        int formulaNaturales = n * (n + 1) / 2;

        // 2. Pares
        int sumaPares = 0;
        for (int i = 1; i <= n; i++) {
            sumaPares += 2 * i;
        }
        int formulaPares = n * (n + 1);

        // 3. Cuadrados
        int sumaCuadrados = 0;
        for (int i = 1; i <= n; i++) {
            sumaCuadrados += i * i;
        }
        int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("\n1. Suma de naturales: " + sumaNaturales + " (Fórmula: " + formulaNaturales + ")");
        System.out.println("2. Suma de pares:     " + sumaPares + " (Fórmula: " + formulaPares + ")");
        System.out.println("3. Suma de cuadrados: " + sumaCuadrados + " (Fórmula: " + formulaCuadrados + ")");

        sc.close();
    }
}