import java.util.Scanner;

public class PromedioPonderado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la primera nota: ");
		double p1 = scanner.nextDouble();

		System.out.print("Ingrese la segunda nota: ");
		double p2 = scanner.nextDouble();

		System.out.print("Ingrese la nota final: ");
		double pf = scanner.nextDouble();

		double definitiva = (p1 * 0.30) + (p2 * 0.30) + (pf * 0.40);
		String estado = (definitiva >= 3.0) ? "Aprobado" : "Reprobado";

		System.out.printf("Definitiva: %.2f%n", definitiva);
		System.out.println("Estado: " + estado);

		scanner.close();
	}
}