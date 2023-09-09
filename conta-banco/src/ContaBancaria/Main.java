package ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBanco conta = ContaTerminal.lerDadosConta();
        conta.exibirMensagem();
    }
}