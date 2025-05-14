/**
 * Criando a classe base chamada "Conta"
 */
public class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Criando os construtores para a classe
     * @param cliente
     * @param saldoInicial
     */
    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void aplicarJurosDiarios() {
    }
}

/**
 * Criando a classe ContaCorrente com extenção da classe principal Conta
 */
class ContaCorrente extends Conta {

    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001; // 0.1% de juros ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Corrente: ");
        super.imprimirExtrato();
    }
}

/**
 * Criando a classe ContaPoupança com extenção da classe principal Conta
 */
class ContaPoupanca extends Conta {

    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008; // 0.08% de juros ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Poupança:");
        super.imprimirExtrato();
    }
}

/**
 * Criando a classe ContaSalario com extenção da classe principal Conta
 */
class ContaSalario extends Conta {

    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Sem juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Salário:");
        super.imprimirExtrato();
    }
}

