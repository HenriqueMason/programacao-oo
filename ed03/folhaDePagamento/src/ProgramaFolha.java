public class ProgramaFolha {
    /**
     * Criando a classe programafolha, de certa forma onde o programa vai rodas
     */
    public static void main(String[] args) {
        Funcionario funcionario1 = new FuncionarioCLT("Carlos", 2000.00);
        Funcionario funcionario2 = new FuncionarioTemporario("Ana", 2000.00);

        System.out.println("Funcionário CLT:");
        funcionario1.exibirDados();
        System.out.println("Salário Final: R$ " + funcionario1.calcularSalario());

        System.out.println("\nFuncionário Temporário:");
        funcionario2.exibirDados();
        System.out.println("Salário Final: R$ " + funcionario2.calcularSalario());
    }
}
