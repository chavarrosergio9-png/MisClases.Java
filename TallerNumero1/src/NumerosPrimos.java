import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el valor de b: ");
        int b = sc.nextInt();

        int cantidad = 0;
        int suma = 0;

        System.out.print("Primos entre " + a + " y " + b + ": ");

        for (int num = a; num <= b; num++) {
            if (num < 2) {
                continue;
            }

            boolean esPrimo = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(num)) {
                if (num % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor++;
            }

            if (esPrimo) {
                if (cantidad > 0) {
                    System.out.print(", ");
                }
                System.out.print(num);
                cantidad++;
                suma += num;
            }
        }

        System.out.println();
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);

        sc.close();
    }
}