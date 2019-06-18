public abstract class EletroDom{

  //ATRIBUTOS

  private int codigo;
  private int potencia;
  private String fabricante;
  private Origem orinatal = new Origem();

  //------------------------------------------

  public abstract void impDados();

  //------------------------------------------

  //CONSTRUTOR VAZIO
  public EletroDom(){

  }

  //Sets
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }

  public void setPotencia(int potencia){
    this.potencia = potencia;
  }

  public void setFabricante(String fabricante){
    this.fabricante = fabricante;
  }

  //GETS

  public int getCodigo(){
    return codigo;
  }

  public int getPotencia(){
    return potencia;
  }

  public String getFabricante(){
    return fabricante;
  }

  public Origem getOrinatal(){
    return orinatal;
  }

}
