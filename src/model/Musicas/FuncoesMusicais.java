package model.Musicas;

public class FuncoesMusicais implements ReprodutorMusical{

    private void SistemaTocarMusica()
    {
        System.out.println("CONFIGURANDO MUSICA..");
    }

    private void SistemaPausarMusica()
    {
        System.out.println("CONFIGURANDO O SISTEMA DE PAUSE..");
    }

    private void SistemaSelecionarMusica()
    {
        System.out.println("INICIANDO O SISTEMA DE SELEÇÃO..");
    }

    public void Tocar()
    {
        SistemaTocarMusica();
        System.out.println("TOCANDO MUSICA..");
    }

    public void Pausar()
    {
        SistemaPausarMusica();
        System.out.println("MUSICA PAUSADA!");
    }

    public void SelecionarMusica()
    {
        SistemaSelecionarMusica();
        System.out.println("SELECIONANDO MUSICA..");
    }

}
