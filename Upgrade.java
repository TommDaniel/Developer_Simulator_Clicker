
package Up;

import javax.swing.JTextArea;


public abstract class Upgrade {

    // variaveis
  private String nome;
  private int preco;
  private int quantidade;
  private String descricao;

  // construtor
  public Upgrade(String nome, int preco, int quantidade, String descricao) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
    this.descricao = descricao;
  }

  // métodos
  public abstract int acaoupgrade(int auxupgrade,JTextArea j);

  // gets
  public String getnome() {
    return nome;
  }

  public int getpreco() {
    return preco;
  }

  public int getquantidade() {
    return quantidade;
  }

  public String getdescricao() {
    return descricao;
  }
  
}
