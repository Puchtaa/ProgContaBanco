import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double saldo = 0.0;
        int opcao = 0;

        while (opcao != 9) {

            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
            System.out.println("--- MENU ---");
            System.out.println("Escolha uma opção: ");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("9: Sair");

            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor para depositar: ");
                double valor = leitor.nextDouble();


                if (valor > 0) {
                    saldo += valor;
                    System.out.println("Depósito realizado com sucesso!");
                } else {
                    System.out.println("O valor do depósito deve ser maior que zero.");
                }


            } else if (opcao == 2) {
                System.out.print("Digite o valor para sacar: ");
                double valor = leitor.nextDouble();


                if (valor <= 0) {
                    System.out.println("O valor do saque deve ser maior que zero.");
                } else if (valor > saldo) {
                    System.out.printf("Saldo insuficiente! Seu saldo atual é de R$ %.2f.\n", saldo);
                } else {
                    saldo -= valor;
                    System.out.println("Saque realizado com sucesso!");
                }


            } else if (opcao != 9) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Seção encerrada. Até logo!");
        leitor.close();
    }
}