import java.util.Scanner;

public class EstadisticasNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / 10;
        double notaAlta = notas[0];
        int posAlta = 0;
        double notaBaja = notas[0];
        int posBaja = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < 10; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
                posAlta = i;
            }
            if (notas[i] < notaBaja) {
                notaBaja = notas[i];
                posBaja = i;
            }
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.printf("\nPromedio del grupo: %.2f\n", promedio);
        System.out.println("Nota más alta: " + notaAlta + " (en la posición " + posAlta + ")");
        System.out.println("Nota más baja: " + notaBaja + " (en la posición " + posBaja + ")");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        sc.close();
    }
}