package org.jopaul0.modelagem;

import org.jopaul0.modelagem.interfaces.AparelhoTelefonico;
import org.jopaul0.modelagem.models.Iphone;

public class App {
    public static void main(String[] args) {

        // Criamos a instância principal do iPhone
        Iphone meuIphone = new Iphone();

        System.out.println("--- DEMONSTRAÇÃO IPHONE 2007 ---");

        // Testando as funções de Música
        System.out.println("\n[REPRODUTOR MUSICAL]");
        meuIphone.selecionarMusica("Lovely Rita - The Beatles");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando as funções de Telefone
        System.out.println("\n[APARELHO TELEFÔNICO]");
        meuIphone.ligar("(12) 99999-8888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando as funções de Internet
        System.out.println("\n[NAVEGADOR NA INTERNET]");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        // Exemplo de Polimorfismo:
        // O iPhone pode ser "visto" apenas como um Telefone se necessário
        System.out.println("\n--- TESTE DE POLIMORFISMO ---");
        AparelhoTelefonico soTelefone = meuIphone;
        soTelefone.ligar("190"); 
        
        System.out.println("\nDemonstração finalizada com sucesso!");
    }
}