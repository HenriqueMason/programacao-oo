public abstract class Funcionario {
    /**
     * Criando a classe funcionario
     */
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Atributos da classe funcionario
     */

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
    }

    public abstract double calcularSalario();
}

