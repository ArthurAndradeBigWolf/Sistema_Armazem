public class ExcecaoCod extends Exception{

    public ExcecaoCod(){
      System.out.println("ERRO");
    }

    public void abreOutraJanela(Armazem sistema, Geladeira gel){
      Add janelaNova = new Add(sistema,gel);
    }

    public void abreOutraJanela(Fogao fog, Armazem sistema){
      Add janelaNova = new Add(fog,sistema);
    }

}
