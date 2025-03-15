public class NavegadorInternet {

  private String url;

  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  public void atualizarPagina() {
    System.out.println("Atualizando página");
  }

  public void avancarPagina() {
    System.out.println("Avançando página");
  }

  public void retrocederPagina() {
    System.out.println("Retrocedendo página");
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  

}
