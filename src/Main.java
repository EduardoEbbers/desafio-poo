import com.iphone.classe.AparelhoTelefonico;
import com.iphone.classe.NavegadorInternet;
import com.iphone.classe.ReprodutorMusical;
import com.iphone.model.Contato;
import com.iphone.model.Musica;
import com.iphone.model.Pagina;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            // REPRODUTOR MUSICAL
         */
        Musica musica1 = new Musica("musica1", "2:00min");
        Musica musica2 = new Musica("musica2", "4:00min");

        System.out.println("Musica 1: " + musica1.getNome());
        System.out.println("Musica 2: " + musica2.getNome());

        System.out.println("\n");

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.tocar(musica1);
        reprodutorMusical.pausar(musica1);
        reprodutorMusical.selecionarMusica(musica2.getNome());
        reprodutorMusical.tocar(musica2);
        reprodutorMusical.pausar(musica2);

        System.out.println("\n");

        /*
            // NAVEGADOR DE INTERNET
         */
        Pagina pagina1 = new Pagina("html1", "url1");
        Pagina pagina2 = new Pagina("html2", "url2");

        System.out.println("Pagina 1: " + pagina1.getHmtl());
        System.out.println("Pagina 2: " + pagina2.getHmtl());

        System.out.println("\n");

        NavegadorInternet navegadorInternet = new NavegadorInternet();

        navegadorInternet.exibirPagina(pagina1);
        navegadorInternet.adicionarNovaAba(pagina1);
        navegadorInternet.atualizarPagina(pagina1);
        navegadorInternet.exibirPagina(pagina2);
        navegadorInternet.adicionarNovaAba(pagina2);
        navegadorInternet.atualizarPagina(pagina2);

        System.out.println("\n");

        /*
            // APARELHO TELEFONICO
         */
        Contato contato1 = new Contato("contato1", "telefone1");
        Contato contato2 = new Contato("contato2", "telefone2");

        System.out.println("Contato 1: " + contato1.getNome());
        System.out.println("Contato 2: " + contato2.getNome());

        System.out.println("\n");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        aparelhoTelefonico.ligar(contato1);
        aparelhoTelefonico.atender(contato1);
        aparelhoTelefonico.iniciarCorreioVoz(contato1);
        aparelhoTelefonico.ligar(contato2);
        aparelhoTelefonico.atender(contato2);
        aparelhoTelefonico.iniciarCorreioVoz(contato2);
    }
}