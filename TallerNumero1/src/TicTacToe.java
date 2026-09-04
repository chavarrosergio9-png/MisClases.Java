import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[3][3];

        // Inicializar el tablero con espacios en blanco
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        char turno = 'X';
        boolean hayGanador = false;
        int jugadas = 0;

        while (!hayGanador && jugadas < 9) {
            // Imprimir tablero
            System.out.println("\n " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
            System.out.println("-----------");
            System.out.println(" " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
            System.out.println("-----------");
            System.out.println(" " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);

            System.out.println("\nTurno del jugador (" + turno + ")");
            System.out.print("Ingresa la fila (0, 1 o 2): ");
            int fila = sc.nextInt();
            System.out.print("Ingresa la columna (0, 1 o 2): ");
            int col = sc.nextInt();

            if (fila < 0 || fila > 2 || col < 0 || col > 2) {
                System.out.println("Coordenadas fuera de rango. Intenta de nuevo.");
                continue;
            }

            if (tablero[fila][col] != ' ') {
                System.out.println("La casilla ya está ocupada. Intenta de nuevo.");
                continue;
            }

            tablero[fila][col] = turno;
            jugadas++;

            // Validar filas, columnas y diagonales
            for (int i = 0; i < 3; i++) {
                if (tablero[i][0] == turno && tablero[i][1] == turno && tablero[i][2] == turno) {
                    hayGanador = true;
                }
                if (tablero[0][i] == turno && tablero[1][i] == turno && tablero[2][i] == turno) {
                    hayGanador = true;
                }
            }
            if (tablero[0][0] == turno && tablero[1][1] == turno && tablero[2][2] == turno) {
                hayGanador = true;
            }
            if (tablero[0][2] == turno && tablero[1][1] == turno && tablero[2][0] == turno) {
                hayGanador = true;
            }

            if (!hayGanador) {
                turno = (turno == 'X') ? 'O' : 'X';
            }
        }

        // Mostrar tablero final
        System.out.println("\n " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
        System.out.println("-----------");
        System.out.println(" " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
        System.out.println("-----------");
        System.out.println(" " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);

        if (hayGanador) {
            System.out.println("\n¡Felicidades! Ganó el jugador '" + turno + "'.");
        } else {
            System.out.println("\n¡Empate! El tablero se ha llenado.");
        }

        sc.close();
    }
}