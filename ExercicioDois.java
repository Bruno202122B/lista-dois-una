import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Valor pago: ");
        double valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente para realizar a compra.");
            return;
        }

        double troco = valorPago - valorCompra;

        int notas50 = (int) (troco / 50);
        troco -= notas50 * 50;

        int notas20 = (int) (troco / 20);
        troco -= notas20 * 20;

        int notas10 = (int) (troco / 10);
        troco -= notas10 * 10;

        int notas5 = (int) (troco / 5);
        troco -= notas5 * 5;

        int notas2 = (int) (troco / 2);
        troco -= notas2 * 2;

        int notas1 = (int) troco;

        System.out.println("Troco: R$ " + troco);
        System.out.println("Notas de R$ 50,00: " + notas50);
        System.out.println("Notas de R$ 20,00: " + notas20);
        System.out.println("Notas de R$ 10,00: " + notas10);
        System.out.println("Notas de R$ 5,00: " + notas5);
        System.out.println("Notas de R$ 2,00: " + notas2);
        System.out.println("Notas de R$ 1,00: " + notas1);
    }
}