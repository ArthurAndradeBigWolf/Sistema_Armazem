import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JanelaPrin extends JFrame implements ActionListener{
    private JButton botao1 = new JButton("CONSULTAR");
    private JButton botao2 = new JButton("ADICIONAR");
    private JButton botao3 = new JButton("REMOVER");
    private JButton botao4 = new JButton("ALTERAR");
    private JButton botao5 = new JButton("SAIR");
    private Armazem sistema = new Armazem();



    public JanelaPrin(){

      //DEFINDO DIMENSÕES DA JANELA
      setTitle("ARMAZEM");
      setSize(500,100);
      //DEFININDO LAYOUT;
      setLayout( new GridLayout(1,4));
      add(botao1);
      add(botao2);
      add(botao3);
      add(botao4);
      /*
      add(botao5);
      */
      //--------------

      //ADICIONANDO A EVENTOS
      botao1.addActionListener(this);
      botao2.addActionListener(this);
      botao3.addActionListener(this);
      botao4.addActionListener(this);
      /*
      botao5.addActionListener(this);
      */
      //--------------------------
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

      //BOTÃO CONSULTAR
      if(e.getSource() == botao1){
        JanelaConsulta jan = new JanelaConsulta(sistema);

      //BOTÃO ADICIONAR
      }else if(e.getSource() == botao2){
        JanelaAdd add = new JanelaAdd(sistema);
      //BOTÃO REMOVER
      }else if(e.getSource() == botao3){
        JanelaRemove rem = new JanelaRemove(sistema);
      //ALTERAR
      }else if(e.getSource() == botao4){
        JanelaAltera al = new JanelaAltera(sistema);
      }

    }

}
