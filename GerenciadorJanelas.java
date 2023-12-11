/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author daniel
 */
public class GerenciadorJanelas {
    private static JDesktopPane jDesktopPane;
    
    public GerenciadorJanelas(JDesktopPane jDesktopPane){
        GerenciadorJanelas.jDesktopPane = jDesktopPane;
    }
    public void abrirTela(JInternalFrame j){
        if(j.isVisible()){
            j.toFront();
            j.requestFocus();
            
        }else{
            jDesktopPane.add(j);
            j.setVisible(true);
        }
    }
}
