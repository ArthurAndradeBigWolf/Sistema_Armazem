import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JanelaAdd extends JFrame implements ActionListener{
    private JButton botao1 = new JButton("GELADEIRA");
    private JButton botao2 = new JButton("FOGAO");
    private JButton botao3 = new JButton("CANCELAR");
    private Geladeira entrada1 = new Geladeira();
    private Fogao entrada2 = new Fogao();
    private Armazem sistema;

    public JanelaAdd(Armazem sistema){

      this.sistema = sistema;
      //DEFINDO DIMENSÕES DA JANELA
      setSize(500,100);
      //DEFININDO LAYOUT;
      setLayout( new FlowLayout());
      add(botao1);
      add(botao2);
      add(botao3);
      //--------------

      //ADICIONANDO A EVENTOS
      botao1.addActionListener(this);
      botao2.addActionListener(this);
      botao3.addActionListener(this);

      //--------------------------
      setLocationRelativeTo(null);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      setVisible(true);
    }

    //EVENTOS RELACIONADO AOS BOTÕES
    public void actionPerformed(ActionEvent e){

      //GELADEIRA
      if(e.getSource() == botao1){

        Add jamm = new Add(sistema, entrada1);
        dispose();
      //FOGÃO
      }else if(e.getSource() == botao2){

        Add jam = new Add(entrada2,sistema);
        dispose();
      //CANCELAR
      }else if(e.getSource() == botao3){
        setVisible(false);
      }



    }

}
