import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class Alterando extends JFrame implements ActionListener{


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
    JButton altera1 = new JButton("ALTERAR");
    JButton cancel = new JButton("CANCELAR");

    //BOTÃO NO ATO DE ADICIONAR O FOGÃO
    JButton altera2 = new JButton("ALTERAR");
    JButton cance = new JButton("CANCELAR");

    //SISTEMA ADICIONAR
    private Armazem sistema;
    private Geladeira gel;
    private Fogao fog;

    // >>>>>> GELADEIRA <<<<<<<<<<<<<
    public Alterando(Armazem sistema, Geladeira recebe){
        this.sistema = sistema;
        this.gel = recebe;
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
        altera1.setBounds(50,140,100,20);
        cancel.setBounds(160,140,100,20);
        add(altera1);
        add(cancel);
        altera1.addActionListener(this);
        cancel.addActionListener(this);

        setSize(400,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    //=============================================================


    //>>>>>>>>> FOGAO <<<<<<<<<<<<<<<<<<<<<<<<<
    public Alterando(Fogao recebe, Armazem sistema){
        this.fog = recebe;
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
      

        //BOTÃO
        altera2.setBounds(50,140,100,20);
        cance.setBounds(160,140,100,20);
        add(altera2);
        add(cance);
        altera2.addActionListener(this);
        cance.addActionListener(this);

        setSize(400,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }
    //--------------------------------------------------------------------------

    public void actionPerformed(ActionEvent e){

      //GELADEIRA
      if(e.getSource() == altera1){

        gel.setCodigo(Integer.parseInt(entracod.getText()));
        gel.setFabricante(entrafab.getText());
        gel.setSubTipo(entrasub.getText());
        gel.setDegelo(entradeg.getText());
        gel.setPotencia(Integer.parseInt(entrapot.getText()));
        JOptionPane.showMessageDialog(null," GELADEIRA ALTERADA COM SUCESSO!!");
        setVisible(false);

      }else if(e.getSource() == cancel){
        setVisible(false);

      //FOGAO
      }else if(e.getSource() == altera2){

        fog.setCodigo(Integer.parseInt(entracod.getText()));
        fog.setFabricante(entrafab.getText());
        fog.setBocas(Integer.parseInt(entboc.getText()));
        fog.setPotencia(Integer.parseInt(entrapot.getText()));
        fog.setForno(entforno.getText());
        JOptionPane.showMessageDialog(null," FOGAO ALTERADA COM SUCESSO!!");
        setVisible(false);

      }else if(e.getSource() == cance){
        setVisible(false);
      }

    }
}
