class Fogao extends EletroDom{
  String tipo;
  int bocas;
  String forno;

  //--------------------------------------------------

  public void impDados(){
    System.out.println(">>>>> Eletrodomestico <<<<");
    System.out.println(">>>>> FOGÃO <<<<<");
  }

  //-------------------------------------------------

  //CONSTRUTORES
  public Fogao(){
    tipo = "Fogão";
  }

  public Fogao(int bocas, String forno){
    this.bocas = bocas;
    this.forno = forno;
  }

  //Metodos

  //setS

  public void setBocas(int bocas){
    this.bocas = bocas;
  }

  public void setForno(String forno){
    this.forno = forno;
  }

  //Gets

  public int getBocas(){
    return bocas;
  }

  public String getForno(){
    return forno;
  }

  public String getTipo(){
    return tipo;
  }

}
