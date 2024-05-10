package model.Internet;

public class FuncoesInternet implements NavegadorInternet{

    private void SistemaExibirPagina()
    {
        System.out.println("CONFIGURANDO O SISTEMA DE EXIBIÇÃO DA PAGINA..");
    }

    private void SistemaAdicionarNovaAba()
    {
        System.out.println("INICIANDO O SISTEMA DE NOVA ABA..");
    }

    private void SistemaAtualizarPagina()
    {
        System.out.println("RENICIANDO O SISTEMA DA PAGINA..");
    }

    public void ExibirPagina()
    {
        SistemaExibirPagina();
        System.out.println("EXIBINDO PAGINA..");
    }

    public void AdicionarNovaAba()
    {
        SistemaAdicionarNovaAba();
        System.out.println("ADICIONANDO NOVA ABA..");
    }

    public void AtualizarPagina()
    {
        SistemaAtualizarPagina();
        System.out.println("ATUALIZANDO PAGINA..");
    }
}
