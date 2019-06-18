import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JanelaAltera extends JFrame implements ActionListener{
    private JButton botao1 = new JButton("GELADEIRA");
    private JButton botao2 = new JButton("FOGAO");
    private JButton botao3 = new JButton("CANCELAR");
    private Armazem sistema;
    private Fogao fog;
    private Geladeira gel;

    public JanelaAltera(Armazem sistema){
      this.sistema = sistema;
      //DEFINDO DIMENSÕES DA JANELA
      setSize(500,100);
      //DEFININDO LAYOUT;
      setLayout( new GridLayout(1,3));
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
        int procura;
        procura = Integer.parseInt(JOptionPane.showInputDialog(null,"CODIGO DA GELADEIRA:", "ALTERAR", JOptionPane.PLAIN_MESSAGE));
        gel = sistema.ConsultaEstoque(gel,procura);
        Alterando altera = new Alterando(sistema,gel);
        dispose();


      //FOGÃO
      }else if(e.getSource() == botao2){
        int procura;
        procura = Integer.parseInt(JOptionPane.showInputDialog(null,"CODIGO DO FOGÃO:", "REMOVER", JOptionPane.PLAIN_MESSAGE));
        fog = sistema.ConsultaEstoque(fog,procura);
        Alterando alterar = new Alterando(fog,sistema);
        dispose();

      //CANCELAR
      }else if(e.getSource() == botao2){
        setVisible(false);
      }



    }

}
