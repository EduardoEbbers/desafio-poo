package com.iphone.classe;

import com.iphone.model.Pagina;

public class NavegadorInternet {
    public NavegadorInternet() {

    }
    public void exibirPagina(Pagina pagina) {
        System.out.println("Navegador Internet: EXIBINDO PAGINA " + pagina.getHmtl() + "; URL: " + pagina.getUrl());
    }

    public void adicionarNovaAba(Pagina pagina) {
        System.out.println("Navegador Internet: ADICIONANDO NOVA ABA " + pagina.getHmtl() + "; URL: " + pagina.getUrl());
    }

    public void atualizarPagina(Pagina pagina) {
        System.out.println("Navegador Internet: ATUALIZANDO PAGINA  " + pagina.getHmtl() + "; URL: " + pagina.getUrl());
    }
}
