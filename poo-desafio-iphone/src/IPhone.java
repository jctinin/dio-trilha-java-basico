public class IPhone {
    public static void main(String[] args) throws Exception {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.setArtist("Drake");
        reprodutorMusical.setAlbum("$ome $exy $ongs 4 U");
        reprodutorMusical.setSong("Gimme a Hug");
        reprodutorMusical.setDuration("4:20");

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.pularMusica();
        reprodutorMusical.retrocederMusica();
        reprodutorMusical.repetirMusica();
        reprodutorMusical.aleatorio();
        reprodutorMusical.selecionarMusica("CN Tower");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.setPhoneNumber("123456789");
        aparelhoTelefonico.setName("Júlio César Tinin");
        aparelhoTelefonico.setEmail("jctinin@outlook.com");

        aparelhoTelefonico.ligar("987654321");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ignorar();
        aparelhoTelefonico.sms("Hello, world!");

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.setUrl("https://www.dio.me");
    }
}
