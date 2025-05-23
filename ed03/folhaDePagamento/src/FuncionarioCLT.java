public class FuncionarioCLT extends Funcionario {
    /**
     * Criando a classe funcionarioCLT estendendo da classe funcionario
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 300.0;
    }
}

