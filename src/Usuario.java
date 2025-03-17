import Smartphone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iphone 16");

        iphone.selecionarMusica("Fortunate son");
        iphone.tocar();
        iphone.pausar();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();



        iphone.ligar("15 999999999");
        iphone.atender();
        iphone.iniciarCorrioVoz();
    }
}