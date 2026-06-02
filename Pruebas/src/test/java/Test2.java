import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import ejercicio2.ValidadorContrasenya;
import org.junit.jupiter.api.Test;
public class Test2 {

    ValidadorContrasenya validador = new ValidadorContrasenya();

    @Test
    public void contrasenya() {
        assertTrue(validador.validar("Berta123"));
    }

    @Test
    public void caracteres() {
        assertFalse(validador.validar("Berta1"));
    }

    @Test
    public void mayusculas() {
        assertFalse(validador.validar("berta"));
    }

    @Test
    public void noNumeros() {
        assertFalse(validador.validar("Berta"));
    }

    @Test
    public void cadenaVacia() {
        assertFalse(validador.validar(""));
    }

    @Test
    public void contrasenyaEspacio() {
        assertFalse(validador.validar("   "));
    }
}
