package model;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        Contato contatoRemover = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoRemover = contato;
                break;
            }
        }
        if (contatoRemover != null) {
            contatos.remove(contatoRemover);
            System.out.println("Contato removido: " + nome);
        } else {
            System.out.println("Contato não encontrado: " + nome);
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}
