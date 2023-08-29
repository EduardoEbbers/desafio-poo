package com.iphone.classe;

import com.iphone.model.Musica;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    public ReprodutorMusical() { }

    public void tocar(Musica musica) {
        System.out.println("Reprodutor Musical: TOCANDO a musica: " + musica.getNome() + "; TEMPO TOTAL: " + musica.getTempo());
    }

    public void pausar(Musica musica) {
        System.out.println("Reprodutor Musical: PAUSANDO a musica: " + musica.getNome());
    }

    public void selecionarMusica(String nomeMusica) {
        System.out.println("Reprodutor Musical: SELECIONANDO MUSICA: " + nomeMusica);
    }
}
