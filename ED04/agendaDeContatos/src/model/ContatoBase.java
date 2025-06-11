// ======= model/ContatoBase.java =======
package model;

public abstract class ContatoBase implements model.Contato {
    private String nome;
    private String telefone;
    private String email;

    protected ContatoBase(String nome, String telefone, String email) {
        setNome(nome);           // já dispara validação do nome
        this.telefone = telefone;
        this.email    = email;
    }

    // ---------- getters/setters ----------
    @Override public String getNome() { return nome; }
    @Override public void   setNome(String nome) {
        if (nome == null || nome.trim().length() < 3)
            throw new IllegalArgumentException("Nome deve ter ao menos 3 caracteres.");
        this.nome = nome.trim();
    }

    @Override public String getTelefone() { return telefone; }
    @Override public void   setTelefone(String telefone) { this.telefone = telefone; }

    @Override public String getEmail()    { return email; }
    @Override public void   setEmail(String email)       { this.email = email; }

    // ---------- util ----------
    /** Classes concretas devem retornar “PF” ou “PJ” para exibição. */
    public abstract String getTipo();

    @Override
    public String toString() {
        return String.format("%-2s | %-14s | %-20s | %-15s | %-25s",
                getTipo(), getDocumento(), nome, telefone, email);
    }
}
