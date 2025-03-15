public class ReprodutorMusical {

  private String artist;
  private String album;
  private String song;
  private String duration;


  public void tocar(){
    System.out.println("Tocando música");
  }
  public void parar(){
    System.out.println("Parando música");
  };
  public void pausar() {
    System.out.println("Pausando música");
  };
  public void selecionarMusica(String song){
    System.out.println("Selecionando música: " + song);
  };
  public void pularMusica(){
    System.out.println("Pulando música");
  };
  public void retrocederMusica(){
    System.out.println("Retrocedendo música");
  };
  public void repetirMusica(){
    System.out.println("Repetindo música");
  };
  public void aleatorio(){
    System.out.println("Modo aleatório");
  }
  public String getArtist() {
    return artist;
  }
  public void setArtist(String artist) {
    this.artist = artist;
  }
  public String getAlbum() {
    return album;
  }
  public void setAlbum(String album) {
    this.album = album;
  }
  public String getSong() {
    return song;
  }
  public void setSong(String song) {
    this.song = song;
  }
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  };

  

}
