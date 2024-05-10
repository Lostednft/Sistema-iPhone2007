package model.util;

import model.Internet.FuncoesInternet;
import model.Internet.NavegadorInternet;
import model.Musicas.FuncoesMusicais;
import model.Musicas.ReprodutorMusical;
import model.Telefonia.AparelhoTelefonico;
import model.Telefonia.FuncoesTelefonicos;

public class Celular {
    public static void main(String[] args) {

        AparelhoTelefonico tel = new FuncoesTelefonicos();
        tel.Ligar();
        tel.Atender();
        tel.IniciarCorreioVoz();


        System.out.println("--------------------------------------");

        ReprodutorMusical rep = new FuncoesMusicais();
        rep.Tocar();
        rep.Pausar();
        rep.SelecionarMusica();

        System.out.println("--------------------------------------");

        NavegadorInternet nav = new FuncoesInternet();

        nav.ExibirPagina();
        nav.AdicionarNovaAba();
        nav.AtualizarPagina();

    }
}
