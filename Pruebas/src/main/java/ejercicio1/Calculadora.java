package ejercicio1;
import java.util.Scanner;
public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Elige una opción: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        Calculadora calc = new Calculadora();

        System.out.println("-- CALCULADORA --");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("Elige una opción: ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + calc.sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + calc.restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + calc.multiplicar(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Resultado: " + calc.dividir(num1, num2));
                }
                catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
        }
    }
}
