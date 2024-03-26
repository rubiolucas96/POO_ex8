package view;

import model.AgendaTelefonica;
import model.Contato;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();

        int opcao;
        do {
            System.out.println("\n------ Menu ------");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email do contato: ");
                    String email = scanner.nextLine();
                    agenda.adicionarContato(new Contato(nome, telefone, email));
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.print("Nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contato = agenda.buscarContato(nomeBuscar);
                    if (contato != null) {
                        System.out.println("Contato encontrado: " + contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("\n------ Contatos na Agenda ------");
                    for (Contato c : agenda.getContatos()) {
                        System.out.println(c);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}


