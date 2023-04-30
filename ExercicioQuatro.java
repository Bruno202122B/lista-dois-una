import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int codigo = input.nextInt();
        System.out.print("Digite o raio: ");
        double raio = input.nextDouble();

        
        if (codigo == 1) {
            double perimetro = 2 * Math.PI * raio;
            System.out.println("Perímetro do círculo: " + perimetro);
        } else if (codigo == 2) {
            double area = Math.PI * Math.pow(raio, 2);
            System.out.println("Área do círculo: " + area);
        } else if (codigo == 3) {
            double volume = (4.0/3) * Math.PI * Math.pow(raio, 3);
            System.out.println("Volume da esfera: " + volume);
        } else {
            System.out.println("Código de operação inválido.");
        }

        input.close();
    }
}
