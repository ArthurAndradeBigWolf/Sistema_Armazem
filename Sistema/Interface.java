interface Interface {

  //GELADEIRA
  public void addEstoque(Geladeira gela);
  public Geladeira ConsultaEstoque(Geladeira gela, int codigo);
  public void removeEstoque(Geladeira gela, int codigo);

  //Fogaos
  public void addEstoque(Fogao fog);
  public Fogao ConsultaEstoque(Fogao fog, int codigo);
  public void removeEstoque(Fogao fog, int codigo);

}
