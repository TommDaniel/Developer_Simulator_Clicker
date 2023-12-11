
package Gerenciamento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveLoad {
    private Player p;
    private File arquivo = new File("saves/save.dat");
    public SaveLoad(Player p){
        this.p = p;
    }
    
    public void save() throws FileNotFoundException{
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo));
            DataStorage ds = new DataStorage();
            
            ds.clicksUp = p.getSomadorC();
            ds.faseAtual = p.getLevel();
            ds.pontosUp = p.getSomadorP();
            ds.conquistas = p.getConquista();
            ds.preco1 = p.getPrecoC();
            ds.preco2 = p.getPrecoP();
            ds.LVC = p.getLVC();
            ds.LVP = p.getLVP();
            ds.pontos = p.getPontosPlayer();
            ds.GPT = p.getGPT();
            oos.writeObject(ds);
        }catch(IOException e){
            System.out.println("Save Exception!");
        }
    }
    public void load(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
            DataStorage ds = (DataStorage)ois.readObject();
            
            p.setSomadorC(ds.clicksUp);
            p.setLevel(ds.faseAtual);
            p.setSomadorP(ds.pontosUp);
            p.setConquista(ds.conquistas);
            p.setPrecoC(ds.preco1);
            p.setPrecoP(ds.preco2);
            p.setLVC(ds.LVC);
            p.setLVP(ds.LVP);
            p.setPontos(ds.pontos);
            p.setGPT(ds.GPT);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Load Exception!");
        }
    }
    public boolean existsSaveFile(){
        return arquivo.exists();
    }
    
}
