package ContaBancaria;

//Definição dos métodos

public class ContaBanco{
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    //Construtor
    public ContaBanco(int numeroConta, String agencia, String nomeCliente, float saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    //Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void exibirMensagem(){
        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " 
        + agencia + ", conta é " + numeroConta + ", e o seu saldo: " + saldo + "R$, já disponível para saque");
    }
}

