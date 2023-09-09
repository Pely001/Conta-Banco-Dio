package ContaBancaria;

import java.util.Scanner;

//Solicitação dos dados via terminal
public class ContaTerminal{
    public static ContaBanco lerDadosConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        String setAgencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int setNumeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String setNomeCliente = scanner.nextLine();

        System.out.print("Digite o valor do primeiro depósito: ");
        float setSaldo = scanner.nextFloat();

        scanner.close();

        ContaBanco conta = new ContaBanco(setNumeroConta, setAgencia, setNomeCliente, setSaldo);
        return conta;
    
    }
}
