import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ejercicio3.TresEnRaya;
import org.junit.jupiter.api.Test;
public class Test3 {

    @Test
    public void fichaBien() {
        TresEnRaya juego = new TresEnRaya();
        assertTrue(juego.colocarFicha(0, 0));
        assertEquals('X', juego.getTablero()[0][0]);
    }

    @Test
    public void fivhaFuera() {
        TresEnRaya juego = new TresEnRaya();
        assertFalse(juego.colocarFicha(3, 0));
    }

    @Test
    public void casillaOcupada() {
        TresEnRaya juego = new TresEnRaya();
        juego.colocarFicha(1, 1);
        assertFalse(juego.colocarFicha(1, 1));
    }

    @Test
    public void ganarFila() {
        TresEnRaya juego = new TresEnRaya();
        juego.colocarFicha(0, 0);
        juego.colocarFicha(1, 0);
        juego.colocarFicha(0, 1);
        juego.colocarFicha(1, 1);
        juego.colocarFicha(0, 2);
        assertEquals('X', juego.comprobarGanador());
    }

    @Test
    public void ganarColumna() {
        TresEnRaya juego = new TresEnRaya();
        juego.colocarFicha(0, 0);
        juego.colocarFicha(0, 1);
        juego.colocarFicha(1, 0);
        juego.colocarFicha(1, 1);
        juego.colocarFicha(2, 0);
        assertEquals('X', juego.comprobarGanador());
    }

    @Test
    public void diagonalPrincipal() {
        TresEnRaya juego = new TresEnRaya();
        juego.colocarFicha(0, 0);
        juego.colocarFicha(0, 1);
        juego.colocarFicha(1, 1);
        juego.colocarFicha(0, 2);
        juego.colocarFicha(2, 2);
        assertEquals('X', juego.comprobarGanador());
    }

    @Test
    public void diagonalSecundaria() {
        TresEnRaya juego = new TresEnRaya();
        juego.colocarFicha(0, 2);
        juego.colocarFicha(0, 0);
        juego.colocarFicha(1, 1);
        juego.colocarFicha(1, 0);
        juego.colocarFicha(2, 0);
        assertEquals('X', juego.comprobarGanador());
    }

    @Test
    public void empate() {
        TresEnRaya juego = new TresEnRaya();
        juego.colocarFicha(0, 0);
        juego.colocarFicha(0, 1);
        juego.colocarFicha(0, 2);
        juego.colocarFicha(1, 1);
        juego.colocarFicha(1, 0);
        juego.colocarFicha(1, 2);
        juego.colocarFicha(2, 1);
        juego.colocarFicha(2, 0);
        juego.colocarFicha(2, 2);
        assertEquals(' ', juego.comprobarGanador());
    }
}