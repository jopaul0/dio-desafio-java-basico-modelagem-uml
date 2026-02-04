package org.jopaul0.modelagem.interfaces;

public interface NavegadorInternet {
    
    default void exibirPagina(String url){
        System.out.println("Exibindo a pagina da URL: " + url);
    }
    void adicionarNovaAba();
    void atualizarPagina();
}
