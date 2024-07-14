import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner desafio = new Scanner(System.in);
        String nome = "Vlad Dracul";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("***************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("***************************");
        System.out.println("\n");

        int escolha = 0;
        String menu = """
                1 - Consultar Saldo
                2 - Transfeir Saldo
                3 - Receber valor
                4 - Sair
                """;

        while (escolha != 4) {
            System.out.println(menu);
            escolha = desafio.nextInt();

            if (escolha == 1) {
                System.out.println("O seu saldo atual é de: " + saldo);
            } else if (escolha == 2) {
                System.out.println("Qual valor deseja transferir?");
                double valor = desafio.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo o suficiente para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Novo saldo: " + saldo);

                }


            } else if (escolha == 3) {
                System.out.println("Valor recebido:");
                double valor = desafio.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);

            } else if (escolha == 4) {
                System.out.println("Encerranddo o programa");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }


        }


    }

}

















