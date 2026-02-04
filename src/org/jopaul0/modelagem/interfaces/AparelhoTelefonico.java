package org.jopaul0.modelagem.interfaces;

public interface AparelhoTelefonico {
    
    default void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }
    void atender();
    void iniciarCorreioVoz();
}
