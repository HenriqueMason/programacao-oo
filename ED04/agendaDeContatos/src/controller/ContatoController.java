// ======= controller/ContatoController.java =======
package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContatoController {
    private final List<Contato> contatos = new ArrayList<>();

    // ---------- CRUD ----------
    public void cadastrar(Contato contato) {
        if (existe(contato.getDocumento()))
            throw new IllegalArgumentException("Já existe contato com esse CPF/CNPJ.");
        contatos.add(contato);
    }

    public List<Contato> listar() { return List.copyOf(contatos); }

    public void atualizar(String documento, Contato atualizado) {
        int idx = indicePorDocumento(documento)
                .orElseThrow(() -> new IllegalArgumentException("Contato não encontrado."));
        contatos.set(idx, atualizado);
    }

    public void excluir(String documento) {
        int idx = indicePorDocumento(documento)
                .orElseThrow(() -> new IllegalArgumentException("Contato não encontrado."));
        contatos.remove(idx);
    }

    // ---------- helpers ----------
    private boolean existe(String documento) {
        return contatos.stream().anyMatch(c -> c.getDocumento().equals(documento));
    }
    private Optional<Integer> indicePorDocumento(String doc) {
        for (int i = 0; i < contatos.size(); i++)
            if (contatos.get(i).getDocumento().equals(doc)) return Optional.of(i);
        return Optional.empty();
    }
}

