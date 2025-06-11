// ======= view/ContatoView.java =======
package view;

import controller.ContatoController;
import model.*;

import java.util.List;
import java.util.Scanner;

public class ContatoView {
    private final ContatoController controller;
    private final Scanner sc = new Scanner(System.in);

    public ContatoView(ContatoController controller) { this.controller = controller; }

    public void iniciar() {
        while (true) {
            System.out.println("\n=== Agenda de Contatos ===");
            System.out.println("1 - Cadastrar  2 - Listar  3 - Atualizar  4 - Excluir  0 - Sair");
            switch (sc.nextLine()) {
                case "1" -> cadastrar();
                case "2" -> listar();
                case "3" -> atualizar();
                case "4" -> excluir();
                case "0" -> { System.out.println("Encerrando..."); return; }
                default   -> System.out.println("Opção inválida!");
            }
        }
    }

    private void cadastrar() {
        System.out.print("Tipo (PF/PJ): ");
        String tipo = sc.nextLine().trim().toUpperCase();
        System.out.print("Nome: ");     String nome  = sc.nextLine();
        System.out.print("Telefone: "); String tel   = sc.nextLine();
        System.out.print("E-mail: ");   String email = sc.nextLine();

        try {
            if ("PF".equals(tipo)) {
                System.out.print("CPF (11 dígitos): ");
                controller.cadastrar(new PessoaFisica(nome, tel, email, sc.nextLine()));
            } else if ("PJ".equals(tipo)) {
                System.out.print("CNPJ (14 dígitos): ");
                controller.cadastrar(new PessoaJuridica(nome, tel, email, sc.nextLine()));
            } else {
                System.out.println("Tipo inválido.");
            }
            System.out.println("Contato salvo!");
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }

    private void listar() {
        List<Contato> lista = controller.listar();
        if (lista.isEmpty()) { System.out.println("Nenhum contato."); return; }

        System.out.println("\nTP | Documento      | Nome                 | Telefone        | Email");
        System.out.println("---+----------------+----------------------+-----------------+-------------------------");
        lista.forEach(System.out::println);  // toString tabular da superclasse
    }

    private void atualizar() {
        System.out.print("CPF/CNPJ do contato a atualizar: ");
        String doc = sc.nextLine();

        // Para simplicidade: remove e cadastra novo
        try {
            controller.excluir(doc);
            System.out.println("Informe os novos dados:");
            cadastrar();
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }

    private void excluir() {
        System.out.print("CPF/CNPJ do contato a excluir: ");
        try {
            controller.excluir(sc.nextLine());
            System.out.println("Removido!");
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }
}

