package ejercicio3;
import java.util.Scanner;
public class TresEnRaya {

    public char[][] tablero = new char[3][3];
    public char jugadorActual = 'X';

    public TresEnRaya() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public char[][] getTablero() {
        return tablero;
    }

    public boolean colocarFicha(int fila, int col) {
        if (fila < 0 || fila > 2 || col < 0 || col > 2) {
            return false;
        }

        if (tablero[fila][col] != ' ') {
            return false;
        }

        tablero[fila][col] = jugadorActual;
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        return true;
    }

    public char comprobarGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return tablero[i][0];
            }
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                return tablero[0][i];
            }
        }

        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return tablero[0][0];
        }

        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return tablero[0][2];
        }

        return ' ';
    }

    public static void main(String[] args) {
        TresEnRaya juego = new TresEnRaya();
        Scanner sc = new Scanner(System.in);
        char ganador = ' ';
        boolean empate = false;

        System.out.println("-- TRES EN RAYA (Coordenadas de 0 a 2) --");

        while (ganador == ' ' && !empate) {
            System.out.println("Turno de: " + juego.jugadorActual);
            System.out.print("Fila: ");
            int f = sc.nextInt();
            System.out.print("Columna: ");
            int c = sc.nextInt();

            if (juego.colocarFicha(f, c)) {
                System.out.println("Tablero actual:");
                for (int i = 0; i < 3; i++) {
                    System.out.println(" " + juego.tablero[i][0] + " | " + juego.tablero[i][1] + " | " + juego.tablero[i][2]);
                }

                ganador = juego.comprobarGanador();

                boolean lleno = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (juego.tablero[i][j] == ' ') lleno = false;
                    }
                }
                if (ganador == ' ' && lleno) empate = true;
            } else {
                System.out.println("Movimiento no válido");
            }
        }

        if (ganador != ' ') {
            System.out.println("El ganador es: " + ganador);
        } else {
            System.out.println("Empate.");
        }
        sc.close();
    }
}