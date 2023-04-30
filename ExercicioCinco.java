import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
        String operador = scanner.next();

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                    return;
                }
                resultado = num1 / num2;
                break;
            case "^":
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Símbolo da operação inválido!");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
