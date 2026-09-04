import java.util.Scanner;

public class VentasSucursalProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] ventas = new double[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ventas - Sucursal " + (i + 1) + ", Producto " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n--- Ventas por sucursal ---");
        for (int i = 0; i < 4; i++) {
            double totalSucursal = 0;
            for (int j = 0; j < 3; j++) {
                totalSucursal += ventas[i][j];
            }
            System.out.printf("Sucursal %d: $ %.2f\n", (i + 1), totalSucursal);
        }

        System.out.println("\n--- Ventas por producto ---");
        for (int j = 0; j < 3; j++) {
            double totalProducto = 0;
            for (int i = 0; i < 4; i++) {
                totalProducto += ventas[i][j];
            }
            System.out.printf("Producto %d: $ %.2f\n", (j + 1), totalProducto);
        }

        double ventaMayor = ventas[0][0];
        int sucursalMayor = 0;
        int productoMayor = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                    sucursalMayor = i;
                    productoMayor = j;
                }
            }
        }

        System.out.printf("\nVenta más alta: $ %.2f (Sucursal %d, Producto %d)\n",
                ventaMayor, (sucursalMayor + 1), (productoMayor + 1));

        sc.close();
    }
}