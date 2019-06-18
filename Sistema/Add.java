import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class Add extends JFrame implements ActionListener{


    //GELADEIRA
    JLabel cod = new JLabel("CODIGO");
    JTextField entracod = new JTextField(20);
    JLabel fabricante = new JLabel("FABRICANTE");
    JTextField entrafab = new JTextField(20);
    JLabel subtipo = new JLabel("SUBTIPO");
    JTextField entrasub = new JTextField(20);
    JLabel degelo = new JLabel("DEGELO");
    JTextField entradeg = new JTextField(20);
    JLabel pot = new JLabel("POTENCIA");
    JTextField entrapot = new JTextField(20);

    //Fogao
    JLabel tipo = new JLabel("TIPO");
    JTextField enttipo = new JTextField(20);
    JLabel bocas = new JLabel("BOCAS");
    JTextField entboc = new JTextField(20);
    JLabel forno = new JLabel("FORNO");
    JTextField entforno = new JTextField(20);

    //BOTÃO DO ATO DE ADICIONAR A GELADEIRA
    JButton addi = new JButton("ADICIONAR");
    JButton cancel = new JButton("CANCELAR");

    //BOTÃO NO ATO DE ADICIONAR O FOGÃO
    JButton adde = new JButton("ADICIONAR");
    JButton cance = new JButton("CANCELAR");

    //SISTEMA ADICIONAR
    private Armazem sistema;
    private Geladeira gel = new Geladeira();
    private Fogao fog = new Fogao();

    // >>>>>> GELADEIRA <<<<<<<<<<<<<
    public Add(Armazem sistema, Geladeira recebe){
        this.sistema = sistema;
        setLayout(null);

        //ORGANIZANDO OS ROTULOS
        cod.setBounds(50,40,100,20);
        fabricante.setBounds(50,60,100,20);
        subtipo.setBounds(50,80,100,20);
        degelo.setBounds(50,100,100,20);
        pot.setBounds(50,120,100,20);

        //ADICIONANDO
        add(cod);
        add(fabricante);
        add(subtipo);
        add(degelo);
        add(pot);

        //ORGANIZANDO AS CAIXAS DE TEXTO
        entracod.setBounds(160,40,100,20);
        entrafab.setBounds(160,60,100,20);
        entrasub.setBounds(160,80,100,20);
        entradeg.setBounds(160,100,100,20);
        entrapot.setBounds(160,120,100,20);

        //ADICIONANDO
        add(entracod);
        add(entrafab);
        add(entrasub);
        add(entradeg);
        add(entrapot);

        //BOTÃO
        addi.setBounds(50,140,100,20);
        cancel.setBounds(160,140,100,20);
        add(addi);
        add(cancel);
        addi.addActionListener(this);
        cancel.addActionListener(this);

        setSize(400,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    //=============================================================


    //>>>>>>>>> FOGAO <<<<<<<<<<<<<<<<<<<<<<<<<
    public Add(Fogao fog, Armazem sistema){

        this.sistema = sistema;
        setLayout(null);

        //ORGANIZANDO OS ROTULOS
        cod.setBounds(50,40,100,20);
        fabricante.setBounds(50,60,100,20);
        bocas.setBounds(50,80,100,20);
        pot.setBounds(50,100,100,20);
        forno.setBounds(50,120,100,20);

        //ADICIONANDO
        add(cod);
        add(fabricante);
        add(bocas);
        add(pot);
        add(forno);

        //ORGANIZANDO AS CAIXAS DE TEXTO
        entracod.setBounds(160,40,100,20);
        entrafab.setBounds(160,60,100,20);
        entboc.setBounds(160,80,100,20);
        entrapot.setBounds(160,100,100,20);
        entforno.setBounds(160,120,100,20);

        //ADICIONANDO
        add(entracod);
        add(entrafab);
        add(entboc);
        add(entrapot);
        add(entforno);
        add(adde);
        add(cance);

        //BOTÃO
        adde.setBounds(50,140,100,20);
        cance.setBounds(160,140,100,20);
        add(adde);
        add(cance);
        adde.addActionListener(this);
        cance.addActionListener(this);

        setSize(400,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }
    //--------------------------------------------------------------------------

    public void actionPerformed(ActionEvent e){
      if(e.getSource() == addi){

        //SE O CODIGO INSERIDO JA TIVER NO ARMAZEM DISPARA UMA EXCEÇÃO
        try{
          sistema.verificaExistente(gel,Integer.parseInt(entracod.getText()));//FUNÇÃO NA QUAL PODE DISPARAR UMA EXCEÇÃO
          gel.setCodigo(Integer.parseInt(entracod.getText()));
          gel.setFabricante(entrafab.getText());
          gel.setSubTipo(entrasub.getText());
          gel.setDegelo(entradeg.getText());
          gel.setPotencia(Integer.parseInt(entrapot.getText()));
          sistema.addEstoque(gel);
          JOptionPane.showMessageDialog(null," GELADEIRA ADICIONADA COM SUCESSO!!");
          setVisible(false);

        }catch (ExcecaoCod x) {
          JOptionPane.showMessageDialog(null," CODIGO DE GELADEIRA JA EXISTENTE!!");
          dispose();
          x.abreOutraJanela(sistema,gel);
        }

      }else if(e.getSource() == cancel){
          setVisible(false);
      }else if(e.getSource() == adde){

        try{
          sistema.verificaExistente(fog,Integer.parseInt(entracod.getText()));
          fog.setCodigo(Integer.parseInt(entracod.getText()));
          fog.setFabricante(entrafab.getText());
          fog.setBocas(Integer.parseInt(entboc.getText()));
          fog.setPotencia(Integer.parseInt(entrapot.getText()));
          fog.setForno(entforno.getText());
          sistema.addEstoque(fog);
          JOptionPane.showMessageDialog(null," FOGAO ADICIONADO COM SUCESSO!!");
          setVisible(false);
        }catch (ExcecaoCod y) {
          JOptionPane.showMessageDialog(null," CODIGO DE FOGAO JA EXISTENTE!!");
          dispose();
          y.abreOutraJanela(fog,sistema);
        }

      }else if(e.getSource() == cance){
        setVisible(false);
      }

    }
}
