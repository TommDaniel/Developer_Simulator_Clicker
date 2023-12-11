/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tela;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(File f) {
        // Carrega a imagem aqui (considere o tratamento de exceções)
        try {
            image = ImageIO.read(f);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Redimensiona e desenha a imagem para preencher todo o painel
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
    public void setImagem(File f) {
        try {
            image = ImageIO.read(f);
            repaint(); // Repinta o painel com a nova imagem
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

