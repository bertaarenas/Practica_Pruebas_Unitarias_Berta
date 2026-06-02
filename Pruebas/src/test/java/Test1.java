import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import ejercicio1.Calculadora;
import org.junit.jupiter.api.Test;
public class Test1 {

    @Test
    public void sumaPositiva() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.sumar(3, 5));
    }

    @Test
    public void sumaNegativa() {
        Calculadora calc = new Calculadora();
        assertEquals(-8, calc.sumar(-3, -5));
    }

    @Test
    public void resta() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.restar(5, -2));
    }

    @Test
    public void multplicacionZero() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.multiplicar(0, 5));
    }

    @Test
    public void division() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    public void divisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5, 0);
        });
    }

    @Test
    public void divisionNegativa() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(-10, -5));
    }
}
