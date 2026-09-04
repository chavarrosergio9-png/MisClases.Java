import java.util.Scanner;

public class TarifaParqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tipo de vehículo: 1=Moto, 2=Carro, 3=Camioneta");
        System.out.print("Ingresa una opción: ");
        int tipo = sc.nextInt();

        System.out.print("Ingresa las horas de permanencia: ");
        int horas = sc.nextInt();

        int primeraHora = 0;
        int horaAdicional = 0;

        switch (tipo) {
            case 1:
                primeraHora = 2000;
                horaAdicional = 1500;
                break;
            case 2:
                primeraHora = 4000;
                horaAdicional = 3000;
                break;
            case 3:
                primeraHora = 5000;
                horaAdicional = 4000;
                break;
            default:
                System.out.println("Opción de vehículo no válida.");
                sc.close();
                return;
        }

        int total = primeraHora + (horas - 1) * horaAdicional;
        System.out.println("El valor total a pagar es: $ " + total);

        sc.close();
    }
}