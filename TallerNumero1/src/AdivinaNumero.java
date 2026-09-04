import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;
        int intentosRealizados = 0;

        System.out.println("Adivina el número (entre 1 y 100):");

        while (intento != numeroSecreto) {
            intentosRealizados++;
            System.out.print("Intento " + intentosRealizados + ": ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Lo lograste en " + intentosRealizados + " intentos.");
            }
        }

        sc.close();
    }
}