import java.util.Scanner;

public class BusquedaPacientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[8];

        System.out.println("--- Ingreso de 8 pacientes ---");
        for (int i = 0; i < 8; i++) {
            System.out.print("Paciente " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.print("\nIngresa el nombre del paciente a buscar: ");
        String buscar = sc.nextLine();

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < 8; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El paciente '" + buscar + "' se encuentra en la posición " + posicion + ".");
        } else {
            System.out.println("El paciente '" + buscar + "' no fue encontrado.");
        }

        sc.close();
    }
}