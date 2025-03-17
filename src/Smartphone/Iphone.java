package Smartphone;

public class Iphone implements AparelhoTelefonico,NavegadorNaInternet,ReprodutorMusical{
    private String musica;
    private String modelo;

    public Iphone(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando ");
    }

    @Override
    public void atender() {
        System.out.printf("Atendendo \n");
    }

    @Override
    public void iniciarCorrioVoz() {
        System.out.println("reproduzindo correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo pagina da web: %s\n",url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    @Override
    public void selecionarMusica(String musica) {
        this.musica=musica;
        System.out.printf(" %s \n",musica);
    }

    @Override
    public void tocar() {
        System.out.printf("%s Tocando %s \n",modelo,musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica em reprodução");
    }


}
