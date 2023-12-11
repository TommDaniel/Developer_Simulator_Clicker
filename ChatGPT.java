/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

/**
 *
 * @author danie
 */
public class ChatGPT extends Upgrade{

    public ChatGPT(String nome, int preco, int quantidade, String descricao){
        super(nome, preco, quantidade, descricao);
    }
    
    public int acaoupgrade(int auxupgrade,JTextArea j){
        new Thread(() -> {
            try {
                Robot robot = new Robot();

                while (true) {
                    // Espera 10 segundos
                    Thread.sleep(10000);

                    // Verifica se o JTextField tem foco
                    if (j.isFocusOwner()) {
                        // Simula pressionamento de tecla
                        robot.keyPress(KeyEvent.VK_A); // Pressiona a tecla 'A'
                        robot.keyRelease(KeyEvent.VK_A); // Libera a tecla 'A'
                    }
                }
            } catch (AWTException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        return 1;
    }
}

