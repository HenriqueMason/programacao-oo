// ======= model/PessoaFisica.java =======
package model;

public class PessoaFisica extends model.ContatoBase {
    private final String cpf;

    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        if (!cpfValido(cpf))
            throw new IllegalArgumentException("CPF inválido.");
        this.cpf = cpf;
    }

    @Override public String getDocumento() { return cpf; }
    @Override public String getTipo()      { return "PF"; }

    // ---------- validação simples ----------
    private static boolean cpfValido(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
        // TODO implementar algoritmo de dígitos verificadores se desejar
    }
}

