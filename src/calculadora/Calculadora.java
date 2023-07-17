package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el operador (+, -, x, :, o /): ");
        String operador = scanner.next();

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "x":
                resultado = num1 * num2;
                break;
            case ":":
                resultado = (double) num1 / num2;
                break;
            case "/":
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
