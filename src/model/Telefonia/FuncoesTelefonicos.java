package model.Telefonia;

public class FuncoesTelefonicos implements AparelhoTelefonico{

    private void SistemaLigar()
    {
        System.out.println("CONFERINDO A REDE DA LIGAÇÃO..");
    }

    private void SistemaAtender()
    {
        System.out.println("CONFERINDO A CONEXÃO DA MINHA REDE..");
    }

    private void SistemaIniciarCorreioVoz()
    {
        System.out.println("LIGANDO O GRAVADOR DE VOZ..");
    }


    public void Ligar()
    {
        SistemaLigar();
        System.out.println("LIGANDO..");
    }

    public void Atender()
    {
        SistemaAtender();
        System.out.println("ATENDENDO..");
    }

    public void IniciarCorreioVoz()
    {
        SistemaIniciarCorreioVoz();
        System.out.println("INICIANDO CORREIO DE VOZ..");
    }


}
