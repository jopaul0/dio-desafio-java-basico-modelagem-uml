package org.jopaul0.modelagem.models;

import org.jopaul0.modelagem.interfaces.AparelhoTelefonico;
import org.jopaul0.modelagem.interfaces.NavegadorInternet;
import org.jopaul0.modelagem.interfaces.ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    private List<String> contatos = new ArrayList<>();
    private List<String> musicas = new ArrayList<>();
    private List<String> paginasAbertas = new ArrayList<>();
    private String musicaAtual;

    // Getters
    public List<String> getContatos() { return new ArrayList<>(contatos); }
    public List<String> getMusicas() { return new ArrayList<>(musicas); }
    public List<String> getPaginasAbertas() { return new ArrayList<>(paginasAbertas); }


    // Sobrescritas dos metodos das interfaces
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        if (!paginasAbertas.contains(url)) {
            paginasAbertas.add(url);
        }
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba em branco aberta.");
        paginasAbertas.add("about:blank");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Recarregando dados da página atual...");
    }


    @Override
    public void ligar(String numero) {
        System.out.println("Chamando: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Em ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo mensagens de voz.");
    }


    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando agora: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
}
