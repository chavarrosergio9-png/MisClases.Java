import java.util.Scanner;

public class InvertirArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos (máximo 20): ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            arreglo[i] = sc.nextInt();
        }

        System.out.print("Original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // Inversión en el mismo arreglo
        for (int i = 0; i < n / 2; i++) {
            int aux = arreglo[i];
            arreglo[i] = arreglo[n - 1 - i];
            arreglo[n - 1 - i] = aux;
        }

        System.out.print("Invertido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}