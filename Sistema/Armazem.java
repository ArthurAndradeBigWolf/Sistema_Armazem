class Armazem implements Interface{

  private int maxEst = 5;
  public Geladeira estoqueGel[];
  private int numeroGelEstoq; //VARIAVEL DE CONTROLE, ONDE CONTEM O NUMERO DE GELADEIRAS EM ESTOQUE
  public Fogao estoqueFog[];
  private int numeroFogEstoq;
  //CONSTRUTOR
  public Armazem(){
    estoqueGel = new Geladeira [maxEst];
    numeroGelEstoq = 0;
    estoqueFog = new Fogao [maxEst];
    numeroFogEstoq = 0;
  }

  //>>>>     GELADEIRAS <<<<<<<<

  //ADICIONANDO NO FIM DO ESTOQUE
  public void addEstoque(Geladeira gela){

    if(numeroGelEstoq == 5){
      System.out.println("ESTOQUE CHEIO!!");
    }else{
      numeroGelEstoq++;
      estoqueGel[numeroGelEstoq - 1] = gela;
      System.out.println("GELADEIRA ADICIONADA!!");
    }
  }

  //CONSULTA ESTOQUE GELADEIRA
  public Geladeira ConsultaEstoque(Geladeira gela, int codigo){

    //VERIFICANDO SE HA ESTOQUE
    int i = 0;
    if(numeroGelEstoq == 0){
      System.out.println("SEM ESTOQUE DE GELADEIRAS!!");
    }else{

       //PROCURANDO DE ACORDO COM CODIGO INSERIDO PARA PESQUISA

       while(i!= numeroGelEstoq){

        if(codigo == estoqueGel[i].getCodigo()){
          gela = estoqueGel[i];
        }
        i++;
      }
    }
    return gela;
  }

  //REMOVE ESTOQUE
  public void removeEstoque(Geladeira gela, int codigo){


    for(int j = 0; j< numeroGelEstoq; j++){

      if(codigo == estoqueGel[j].getCodigo()){

        //CASO PRODUTO SEJA O ULTIMO NO VETOR
        if(j == (numeroGelEstoq - 1)){
          numeroGelEstoq--;
          break;
        //ORDENANDO VETOR E REMOVENDO O DESEJADO
        }else{
          for(int b = j; b < (numeroGelEstoq - 1); b++){
            estoqueGel[b] = estoqueGel[b + 1];
          }
        numeroGelEstoq--;
        break;
        }
      }
    }
  }

  //FUNÇÃO ALTERA O PRODUTO
  public void altera(Geladeira gela, int cod){

    for(int k=0; k < numeroGelEstoq; k++){

      if(cod == estoqueGel[k].getCodigo()){

        return;
      }
    }
  }

  public void verificaExistente(Geladeira gel, int codigo) throws ExcecaoCod{

    for(int i=0; i < numeroGelEstoq; i++){
        if (estoqueGel[i].getCodigo() == codigo){
          throw new ExcecaoCod();
        }
    }
    return;
  }
  //-----------------------------------------------------------------------------
  //-----------------------------------------------------------------------------
  //>>>>>>>>>>>> Fogaos <<<<<<<<<<<<<<<<

  public void addEstoque(Fogao fog){

    if(numeroFogEstoq == 5){
      System.out.println("ESTOQUE CHEIO!!");
    }else{
      numeroFogEstoq++;
      estoqueFog[numeroFogEstoq - 1] = fog;
      System.out.println("FOGÃO ADICIONADA!!");
    }

  }


  public Fogao ConsultaEstoque(Fogao fog, int codigo){

    int i = 0;
    if(numeroFogEstoq == 0){
      System.out.println("SEM ESTOQUE DE GELADEIRAS!!");
    }else{

       //PROCURANDO DE ACORDO COM CODIGO INSERIDO PARA PESQUISA

       while(i!= numeroFogEstoq){

        if(codigo == estoqueFog[i].getCodigo()){
          fog = estoqueFog[i];
        }
        i++;
      }
    }
    return fog;
  }


  public void removeEstoque(Fogao fog, int codigo){

    for(int j = 0; j< numeroFogEstoq; j++){

      if(codigo == estoqueFog[j].getCodigo()){

        //CASO PRODUTO SEJA O ULTIMO NO VETOR
        if(j == (numeroFogEstoq - 1)){
          numeroFogEstoq--;
          break;
        //ORDENANDO VETOR E REMOVENDO O DESEJADO
        }else{
          for(int b = j; b < (numeroFogEstoq - 1); b++){
            estoqueFog[b] = estoqueFog[b + 1];
          }
        numeroFogEstoq--;
        break;
        }
      }
    }
  }

  public void verificaExistente(Fogao fog, int codigo) throws ExcecaoCod{

    for(int i=0; i < numeroFogEstoq; i++){
        if (estoqueFog[i].getCodigo() == codigo){
          throw new ExcecaoCod();
        }
    }
    return;
  }
  //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


  //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

}
