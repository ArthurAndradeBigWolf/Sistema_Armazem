class Geladeira extends EletroDom{
  private String tipo;
  private String sub_tipo; //Duplex / Inverse / Side by Side / French Door/
  private String degelo; //Frost Free/ Cycle Defrost/ Degelo Seco / Manual/

  //------------------------------------------------------
  public void impDados(){
    System.out.println(">>>>> Eletrodomestico <<<<");
    System.out.println(">>>>> GELADEIRA <<<<<");
  }

  //------------------------------------------------------

  //CONSTRUTOR
  public Geladeira(int codi, int poten, String fabri, String sub_tipo, String degelo){
    tipo = "Geladeira";
    this.sub_tipo = sub_tipo;
    this.degelo = degelo;

  }

  //CONSTRUTOR
  public Geladeira(){
    tipo = "Geladeira";
  }

  //Sets
  public void setSubTipo(String sub_tipo){
    this.sub_tipo = sub_tipo;
  }

  public void setDegelo(String degelo){
    this.degelo = degelo;
  }

  //GETS

  public String getSubTipo(){
    return sub_tipo;
  }

  public String getDegelo(){
    return degelo;
  }

  public String getTipo(){
    return tipo;
  }

}
