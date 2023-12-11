
package Up;

import javax.swing.JTextArea;


public class MaisPontos extends Upgrade {

     public MaisPontos(String nome, int preco, int quantidade, String descricao){
    super(nome, preco, quantidade, descricao);
  }

    public int acaoupgrade(int auxupgrade, JTextArea j) {
        
        return auxupgrade + 1;
    }
}



