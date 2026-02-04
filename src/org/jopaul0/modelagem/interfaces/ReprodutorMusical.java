package org.jopaul0.modelagem.interfaces;

public interface ReprodutorMusical {

    default void selecionarMusica(String musica){
        System.out.println("Musica " + musica + " selecionada.");
    }
    void tocar();
    void pausar();
}
