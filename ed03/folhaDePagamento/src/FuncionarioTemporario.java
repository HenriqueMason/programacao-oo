public class FuncionarioTemporario extends Funcionario {
    /**
     * Criando a classe funcionariotemporario estendendo da classe funcionario
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase - 100.0;
    }
}

