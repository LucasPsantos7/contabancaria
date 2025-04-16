import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        String nome = "Lucas pita";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int escolha = 0;

        System.out.println("*******************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("Nome:" + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.printf("Saldo inicial: %.2f", saldoInicial);
        System.out.println();
        System.out.println("*******************************");

        while (escolha != 4) {
            System.out.println("Operações");
            System.out.println();
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber Valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Saldo atual: R$" + saldoInicial);

            } else if (escolha == 2) {
                System.out.println("Informe o valor a receber:");
                double receberTransferencia = sc.nextDouble();
                saldoInicial += receberTransferencia;
                System.out.println("Saldo atualizado: R$" + saldoInicial);

            } else if (escolha == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double fazTransferencia = sc.nextDouble();


                if (fazTransferencia > saldoInicial) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldoInicial -= fazTransferencia;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.printf("Saldo atualizado: R$%.2f\n", saldoInicial);
                }

            } else if (escolha == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida");
            }
        }

    }
}