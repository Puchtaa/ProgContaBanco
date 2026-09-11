import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double saldo = 0.0;
        int opcao = 0;

        while (opcao != 9) {
            System.out.println("\nSaldo atual: R$ %.2f " + saldo);
            System.out.println("--- MENU ---");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("9: Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor para depositar: ");
                double valor = leitor.nextDouble();
                saldo += valor;

            } else if (opcao == 2) {
                System.out.print("Digite o valor para sacar: ");
                double valor = leitor.nextDouble();
                saldo -= valor;

            } else if (opcao != 9) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado. Até logo!");
        leitor.close();
    }
}