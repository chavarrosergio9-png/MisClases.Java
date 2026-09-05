
import java.util.Scanner;

public class TiempoDeViaje {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa los minutos: ");
            int minutos = sc.nextInt();
            int segundosTotales = minutos * 60;
            int horas = minutos / 60;
            int minResto = minutos % 60;
            int segResto = segundosTotales % 60;

            System.out.println("Horas: " + horas);
            System.out.println("Minutos restantes: " + minResto);
            System.out.println("Segundos restantes: " + segResto);
            System.out.println("Segundos totales: " + segundosTotales);
        }
    }

}