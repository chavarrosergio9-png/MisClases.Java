import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número n: ");
        int n = sc.nextInt();

        System.out.println("\n--- Tabla de multiplicar del " + n + " ---");
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        System.out.println("\n--- Cuadrícula del 1 al " + n + " ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        sc.close();
    }
}