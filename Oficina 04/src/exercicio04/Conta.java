package exercicio04;

public class Conta {

    private int numero;
    private double saldoInicial;

    public Conta(int numero, double saldoInicial){
        if(saldoInicial < 0){
            this.saldoInicial = 0;
        } else {
            this.saldoInicial = saldoInicial;
        }
        this.numero = numero;
    }

    public void exibir(){
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("Numero conta:: " + numero);
    }
}
