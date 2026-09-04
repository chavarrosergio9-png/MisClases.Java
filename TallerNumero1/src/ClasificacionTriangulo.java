import java.util.Scanner;

public class ClasificacionTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el lado 1: ");
        double a = sc.nextDouble();

        System.out.print("Ingresa el lado 2: ");
        double b = sc.nextDouble();

        System.out.print("Ingresa el lado 3: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("El triángulo es Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es Isósceles.");
            } else {
                System.out.println("El triángulo es Escaleno.");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }

        sc.close();
    }
}









/*
INICIO
  Leer a, b, c (tres lados)

  esValido = (a + b > c) Y (a + c > b) Y (b + c > a)

  SI NO esValido ENTONCES
    Imprimir "No es un triángulo válido"
  SI NO
    SI a == b Y b == c ENTONCES
      Imprimir "Equilátero"
    SI NO SI a == b O b == c O a == c ENTONCES
      Imprimir "Isósceles"
    SI NO
      Imprimir "Escaleno"
    FIN SI
  FIN SI
FIN
*/
