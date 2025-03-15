public class AparelhoTelefonico {

  private String phoneNumber;
  private String name;
  private String email;

  public void ligar(String number) {
    System.out.println("Ligando para " + number);
  }

  public void atender() {
    System.out.println("Atendendo chamada");
  }

  public void ignorar() {
    System.out.println("Ignorando chamada");
  }

  public void sms(String message) {
    System.out.println("Enviando SMS: " + message);
  }

  public void adicionarContato(String name, String number, String email) {
    System.out.println("Adicionando contato: " + name + " " + number + " " + email);
  }

  public void desligar() {
    System.out.println("Desligando");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }



}
