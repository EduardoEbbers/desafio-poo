package com.iphone.classe;

import com.iphone.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico {
    public AparelhoTelefonico() {
    }

    public void ligar(Contato contato) {
        System.out.println("Aparelho Telefonico: LIGANDO para " + contato.getNome() + "; NUMERO: " + contato.getTelefone());
    }

    public void atender(Contato contato) {
        System.out.println("Aparelho Telefonico: ATENDENDO " + contato.getNome() + "; NUMERO: " + contato.getTelefone());
    }

    public void iniciarCorreioVoz(Contato contato) {
        System.out.println("Aparelho Telefonico: INICIANDO CORREIO DE VOZ para " + contato.getNome());
    }
}
