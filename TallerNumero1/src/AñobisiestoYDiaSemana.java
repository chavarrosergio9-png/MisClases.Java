import java.util.Scanner;

public class AñobisiestoYDiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un año: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " ES bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }

        System.out.print("Ingresa un número del 1 al 7 para el día de la semana: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Día: Lunes"); break;
            case 2: System.out.println("Día: Martes"); break;
            case 3: System.out.println("Día: Miércoles"); break;
            case 4: System.out.println("Día: Jueves"); break;
            case 5: System.out.println("Día: Viernes"); break;
            case 6: System.out.println("Día: Sábado"); break;
            case 7: System.out.println("Día: Domingo"); break;
            default: System.out.println("Número de día no válido."); break;
        }

        sc.close();
    }
}