/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Gerenciamento;

import Up.*;
import javax.swing.JTextArea;

/**
 *
 * @author daniel
 */
public class Player {
    private Moeda pontos;
    private Upgrade clicksUp;
    private Upgrade pontosUp;
    private Upgrade C;
    private int somadorC = 1;
    private int somadorP = 1;
    private String precoC;
    private String precoP;
    private int LVC;
    private int LVP;
    private int GPT = 0;
    private Fases level = new Fases();
    private boolean[] estadoConquista = new boolean[6];
   
    
    public Player(){
        this.pontos = new Moeda();
        this.C = new ChatGPT("ChatGPT", 30,0,"Cliquer AUTO");
        this.clicksUp = new MaisClicks("MaisClick", 2,0,"Mais um click");
        this.pontosUp = new MaisPontos("MaisPontos", 2,0,"Mais um ponto");
    }
    
    public Upgrade getClicksUp(){
        return clicksUp;
    }
    public Upgrade getPontosUp(){
        return pontosUp;
    }
    public void setLevel(int i){
        level.setIndice(i);
    }
    public int getLevel(){
        return level.getIndice();
    }
    public String LevelAtual(){
        String l = level.obterFaseAtual();
        return l;
    }
    public int getSomadorP(){
        return somadorP;
    }
    public int getSomadorC(){
        return somadorC;
    }
    public String getPrecoP(){
        return precoP;
    }
    public String getPrecoC(){
        return precoC;
    }
    public int getLVP(){
        return LVP;
    }
    public int getLVC(){
        return LVC;
    }
    public void setPrecoP(String p){
        precoP = p;
    }
    public void setPrecoC(String c){
        precoC = c;
    }
    public void setSomadorP(int p){
        somadorP = p;
    }
    public void setSomadorC(int c){
        somadorC = c;
    }
    public void setLVP(int p){
        LVP = p;
    }
    public void setLVC(int c){
        LVC = c;
    }
    public void StartGPT(JTextArea j){
        GPT = C.acaoupgrade(GPT, j);
    }
    public int getGPT(){
        return GPT;
    }
    public void setGPT(int i){
        GPT = i;
    }
    public void conquista(int conquista){
        switch(conquista){
            case 1:
                estadoConquista[0] = true;
                break;
            case 2:
                estadoConquista[1] = true;
                break;
            case 3:
                estadoConquista[2] = true;
                break;
            case 4:
                estadoConquista[3] = true;
                break;
            case 5:
                estadoConquista[4] = true;
                break;
            case 6:
                estadoConquista[5] = true;
                break;
            default:
                break;
        }
    }
    public boolean[] getConquista(){
        return estadoConquista;
    }
    public void setConquista(boolean[] conquista){
        estadoConquista = conquista;
        
   }
   public double getPontosPlayer(){
       return pontos.getPontos();
   }
   public void setPontos(double i){
       pontos.setPontos(i);
   }
   public void addPontos(){
       pontos.addPontos(somadorP);
   }
   public void subPontos(double quantidade){
       pontos.removerPontos(quantidade);
   }
}
