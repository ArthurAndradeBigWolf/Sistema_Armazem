import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class Dados extends JFrame implements ActionListener{


    //GELADEIRA
    JLabel cod = new JLabel("CODIGO");
    JLabel fabricante = new JLabel("FABRICANTE");
    JLabel subtipo = new JLabel("SUBTIPO");
    JLabel degelo = new JLabel("DEGELO");
    JLabel pot = new JLabel("POTENCIA");
    JLabel entracod = new JLabel();
    JLabel entrafabricante = new JLabel();
    JLabel entrasubtipo = new JLabel();
    JLabel entradegelo = new JLabel();
    JLabel entrapot = new JLabel();
    //Fogao
    JLabel tipo = new JLabel("TIPO");
    JLabel bocas = new JLabel("BOCAS");
    JLabel forno = new JLabel("FORNO");
    JLabel entrabocas = new JLabel();
    JLabel entratipo =  new JLabel();
    JLabel entraforno = new JLabel();
    JButton ok = new JButton("OK");
    // >>>>>> GELADEIRA <<<<<<<<<<<<<
    public Dados(Geladeira gel){
        setLayout(null);

        //ORGANIZANDO OS ROTULOS
        cod.setBounds(50,40,100,20);
        fabricante.setBounds(50,60,100,20);
        subtipo.setBounds(50,80,100,20);
        degelo.setBounds(50,100,100,20);
        pot.setBounds(50,120,100,20);
        ok.setBounds(100,140,100,20);
        //ADICIONANDO
        add(cod);
        add(fabricante);
        add(subtipo);
        add(degelo);
        add(pot);
        add(ok);
        // INSERINDO DADOS
        ok.addActionListener(this);
        entracod.setText(Integer.toString(gel.getCodigo()));
        entrafabricante.setText(gel.getFabricante());
        entrasubtipo.setText(gel.getSubTipo());
        entradegelo.setText(gel.getDegelo());
        entrapot.setText(Integer.toString(gel.getPotencia()));

        entracod.setBounds(160,40,100,20);
        entrafabricante.setBounds(160,60,100,20);
        entrasubtipo.setBounds(160,80,100,20);
        entradegelo.setBounds(160,100,100,20);
        entrapot.setBounds(160,120,100,20);

        //ADICIONANDO
        add(entracod);
        add(entrafabricante);
        add(entrasubtipo);
        add(entradegelo);
        add(entrapot);

        setSize(400,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    //=============================================================


    //>>>>>>>>> FOGAO <<<<<<<<<<<<<<<<<<<<<<<<<
    public Dados(Fogao fog){

        setLayout(null);

        //ORGANIZANDO OS ROTULOS
        cod.setBounds(50,40,100,20);
        fabricante.setBounds(50,60,100,20);
        tipo.setBounds(50,80,100,20);
        bocas.setBounds(50,100,100,20);
        pot.setBounds(50,120,100,20);
        forno.setBounds(50,140,100,20);
        ok.setBounds(100,160,100,20);
      
        //ADICIONANDO
        add(cod);
        add(fabricante);
        add(tipo);
        add(bocas);
        add(pot);
        add(forno);
        add(ok);
        ok.addActionListener(this);
        //INSERINDO Dados

        entracod.setText(Integer.toString(fog.getCodigo()));
        entrafabricante.setText(fog.getFabricante());
        entratipo.setText(fog.getTipo());
        entrabocas.setText(Integer.toString(fog.getBocas()));
        entrapot.setText(Integer.toString(fog.getPotencia()));
        entraforno.setText(fog.getForno());

        entracod.setBounds(160,40,100,20);
        entrafabricante.setBounds(160,60,100,20);
        entratipo.setBounds(160,80,100,20);
        entrabocas.setBounds(160,100,100,20);
        entrapot.setBounds(160,120,100,20);
        entraforno.setBounds(160,140,100,20);

        add(entracod);
        add(entrafabricante);
        add(entratipo);
        add(entrabocas);
        add(entrapot);
        add(entraforno);

        setSize(400,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }
    //--------------------------------------------------------------------------
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == ok){
          setVisible(false);
        }
    }
}
