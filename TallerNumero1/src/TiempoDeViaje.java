public class TiempoDeViaje {
    public static void main(String[] args) {
        // Declaración de variables
         int minutos = 150;
         int segundosTotales = minutos * 60;
        int horas = minutos / 60;
        int minResto = minutos % 60;
        int segResto = segundosTotales % 60;

        // Imprimir resultados
        System.out.println("Tiempo de viaje: " + horas + " horas");
        System.out.println("Tiempo de viaje: " + minResto + " minutos");
        System.out.println("Tiempo de viaje: " + segResto + " segundos");
        System.out.println("Tiempo total en segundos: " + segundosTotales);
    }

}