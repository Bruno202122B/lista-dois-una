import java.util.Scanner;
import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num1, num2, menor, maior, sorteado;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = input.nextInt();

       
        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

  
        sorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("O número sorteado foi: " + sorteado);

        if (sorteado % 2 == 0) {
            System.out.println("Este número é par.");
        } else {
            System.out.println("Este número é ímpar.");
        }
    }
}