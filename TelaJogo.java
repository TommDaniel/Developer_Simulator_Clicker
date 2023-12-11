
package tela;

import Gerenciamento.*;
import Up.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
/**
 *
 * @author daniel
 */
public class TelaJogo extends javax.swing.JInternalFrame {
    private ImagePanel TelaImagem;
    private static TelaJogo telaJogo;
    private String imagem1 = "imagens/sonoscomputer_f2.png";
    private String imagem2 = "imagens/sonoscomputer_f3.png";
    private String imagem3 = "imagens/sonoscomputer_f4.png";
    private File fundo = new File(imagem1);
    
    
    private Player p = new Player();
    private int i = 0;
    private boolean Cgpt = false;
    private char[] fase = p.LevelAtual().toCharArray();
    private Upgrade U1 = p.getClicksUp();
    private Upgrade U2 = p.getPontosUp();
    private int imagemAtual = 1;
    private int l1 = 1;
    private int l2 = 1;
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    private DecimalFormat df = new DecimalFormat("0.00",symbols);
    
    private SaveLoad saveLoad = new SaveLoad(p);
    
    public static TelaJogo getIntancia(){
        if(telaJogo == null){
            telaJogo = new TelaJogo();
        }
        return telaJogo;
    }
    /**
     * Creates new form TelaJogo
     */
    
    public TelaJogo() {
        initComponents();
        initConquista();
        TelaImagem = new ImagePanel(fundo);
        TelaImagem.setPreferredSize(new java.awt.Dimension(229, 97));
        TelaImagem.setBackground(new java.awt.Color(29, 29, 29));
        TelaImagem.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TelaImagem, java.awt.BorderLayout.PAGE_END);
        
        
    }
    
    //Verificação das Conquistas
    private void initConquista() {
        //primeiramente feito com thread, mas por motivos de conflito, utilizando timer agora, de 1 em 1 segundo
        Timer timer = new Timer(1000, new ActionListener() {
                
            public void actionPerformed(ActionEvent e) {
                
                // conquista 1
                if ((p.getLevel()+1) == 2 && !jRadioButton1.isSelected()) {// verifica se a conquista ja esta ativada, mostrando que esta completa
                    
                    SwingUtilities.invokeLater(() -> jRadioButton1.setSelected(true));
                    p.conquista(1);
                }
                // Conquista 2
                if (l1 > 30 && !jRadioButton2.isSelected()) {
                    SwingUtilities.invokeLater(() -> jRadioButton2.setSelected(true));
                    p.conquista(2);
                }
    
                // Conquista 3
                if (l2 > 20 && !jRadioButton3.isSelected()) {
                    SwingUtilities.invokeLater(() -> jRadioButton3.setSelected(true));
                    p.conquista(3);
                }
    
                // Conquista 4
                if (Cgpt && !jRadioButton4.isSelected()) {
                    SwingUtilities.invokeLater(() -> jRadioButton4.setSelected(true));
                    p.conquista(4);
                }
                // Conquista 5
                if ((p.getLevel()+1) > 7 && !jRadioButton5.isSelected()) {
                    SwingUtilities.invokeLater(() -> jRadioButton5.setSelected(true));
                    p.conquista(5);
                }
                // Conquista 6
                if (l1>30 && l2> 20 && Cgpt && (p.getLevel()+1) > 7 && !jRadioButton6.isSelected()) {
                    SwingUtilities.invokeLater(() -> jRadioButton6.setSelected(true));
                    p.conquista(6);
                }
            }
        });
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Preco1 = new javax.swing.JLabel();
        Preco2 = new javax.swing.JLabel();
        Preco3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();

        jScrollPane2.setBackground(new java.awt.Color(85, 85, 85));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jEditorPane1);

        jLabel7.setText("1.0");

        setBackground(new java.awt.Color(29, 29, 29));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, null, null));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setResizable(true);
        setTitle("Clicker");
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(29, 29, 29));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(29, 29, 29));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(85, 85, 85));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("0 LV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(29, 29, 29));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mais Clicks: Ganha mais 1 click");

        jButton2.setBackground(new java.awt.Color(85, 85, 85));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("0 LV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(85, 85, 85));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("UP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(29, 29, 29));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mais Pontos: Ganha mais pontos");

        jLabel3.setBackground(new java.awt.Color(29, 29, 29));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ChatGPT: Cliker automatico");

        jLabel4.setBackground(new java.awt.Color(29, 29, 29));
        jLabel4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fase: 1");

        Preco1.setBackground(new java.awt.Color(29, 29, 29));
        Preco1.setForeground(new java.awt.Color(255, 255, 255));
        Preco1.setText("25.0");

        Preco2.setBackground(new java.awt.Color(29, 29, 29));
        Preco2.setForeground(new java.awt.Color(255, 255, 255));
        Preco2.setText("5.0");

        Preco3.setBackground(new java.awt.Color(29, 29, 29));
        Preco3.setForeground(new java.awt.Color(255, 255, 255));
        Preco3.setText("20.0");

        jLabel5.setBackground(new java.awt.Color(29, 29, 29));
        jLabel5.setFont(new java.awt.Font("SimSun", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Devs: Daniel, Vitor, Lucas, Carlos e Gibson");

        jLabel6.setBackground(new java.awt.Color(29, 29, 29));
        jLabel6.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Pontos: 0");

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Upgrades");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Preco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Preco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Preco3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Preco1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(Preco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Preco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(29, 29, 29));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jRadioButton1.setBackground(new java.awt.Color(29, 29, 29));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Hello World!");
        jRadioButton1.setEnabled(false);
        jRadioButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseMoved(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(29, 29, 29));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Teclas Turbinadas");
        jRadioButton2.setEnabled(false);
        jRadioButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseMoved(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(29, 29, 29));
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Teclas Douradas");
        jRadioButton3.setEnabled(false);
        jRadioButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseMoved(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(29, 29, 29));
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Automação");
        jRadioButton4.setEnabled(false);
        jRadioButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseMoved(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(29, 29, 29));
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Domínio do Loop");
        jRadioButton5.setEnabled(false);
        jRadioButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseMoved(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(29, 29, 29));
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Programador Experiente");
        jRadioButton6.setEnabled(false);
        jRadioButton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jRadioButton6MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 620, 431);
    }// </editor-fold>//GEN-END:initComponents
//Upgrade de clicks
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double number2 = Double.parseDouble(Preco1.getText());
        if(p.getPontosPlayer() > number2){
            p.subPontos(number2);
            String numeroFormatado = df.format(p.getPontosPlayer());
            jLabel6.setText("Pontos: " + numeroFormatado);
            p.setSomadorC(U1.acaoupgrade(p.getSomadorC(),null));
            jButton1.setText( (l1++) + " LV");
            p.setLVC(l1);

            number2 = number2 * 1.5;
            numeroFormatado = df.format(number2);
            Preco1.setText(numeroFormatado);
            p.setPrecoC(numeroFormatado);
        }else{
            JOptionPane.showMessageDialog(this, "Sem Pontos suficientes \n Digite mais códigos!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//Upgrade de Pontos
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        double number1 = Double.parseDouble(Preco2.getText());
        if(p.getPontosPlayer() > number1){
            p.subPontos(number1);
            String numeroFormatado = df.format(p.getPontosPlayer());
            jLabel6.setText("Pontos: " + numeroFormatado);
            p.setSomadorP(U2.acaoupgrade(p.getSomadorP(),null));
            jButton2.setText( (l2++) + " LV");
            p.setLVP(l2);

            number1 = number1 * 1.5;
            numeroFormatado = df.format(number1);
            Preco2.setText(numeroFormatado);
            p.setPrecoP(numeroFormatado);
        }else{
            JOptionPane.showMessageDialog(this, "Sem Pontos suficientes \n Digite mais códigos!");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
//Tela Clicador
    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        // TODO add your handling code here:
        mudarImagem();
        p.addPontos();
        String numeroFormatado = df.format(p.getPontosPlayer());
        jLabel6.setText("Pontos: " + numeroFormatado);
        for(int j=0; j < p.getSomadorC(); j++){
            if (i < fase.length) {
                jTextArea1.setText(jTextArea1.getText() + fase[i]);
                i++;
            }else{
                i=0;
                jTextArea1.setText("");
                fase = p.LevelAtual().toCharArray();
                jLabel4.setText("Fase: "+ (p.getLevel()+1));
            }
        }
    }//GEN-LAST:event_jTextArea1KeyReleased
//salva
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        try {
            saveLoad.save();
            JOptionPane.showMessageDialog(this, "Jogo salvo com sucesso!");
            System.exit(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formInternalFrameClosing
//da load
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        if (saveLoad.existsSaveFile()) {
            // Carrega o jogo e mostra a mensagem
            saveLoad.load();
            JOptionPane.showMessageDialog(this, "Jogo carregado com sucesso!");
            verConquistas();
            Progresso();
        }
    }//GEN-LAST:event_formInternalFrameOpened
//conquistas salvas
    private void verConquistas(){
        boolean[] conquistasFeitas = p.getConquista();
        
        for (int i = 0; i < conquistasFeitas.length; i++) {
            if(conquistasFeitas[i] == true){
                switch(i){
                    case 0:
                        SwingUtilities.invokeLater(() -> jRadioButton1.setSelected(true));
                        break;
                    case 1:
                        SwingUtilities.invokeLater(() -> jRadioButton2.setSelected(true));
                        break;
                    case 2:
                        SwingUtilities.invokeLater(() -> jRadioButton3.setSelected(true));
                        break;
                    case 3:
                        SwingUtilities.invokeLater(() -> jRadioButton4.setSelected(true));
                        break;
                    case 4:
                        SwingUtilities.invokeLater(() -> jRadioButton5.setSelected(true));
                        break;
                    case 5:
                        SwingUtilities.invokeLater(() -> jRadioButton6.setSelected(true));
                        break;
                    default:
                        break;
                }
            }
        }
    }
    //atualiza a tela pos load
    public void Progresso(){
        fase = p.LevelAtual().toCharArray();
        jLabel4.setText("Fase: "+ (p.getLevel()+1));
        Preco1.setText(p.getPrecoC());
        Preco2.setText(p.getPrecoP());
        jButton1.setText( p.getLVC() + " LV");
        jButton2.setText( p.getLVP() + " LV");
        String numeroFormatado = df.format(p.getPontosPlayer());
        jLabel6.setText("Pontos: " + numeroFormatado);
        if(p.getGPT() == 1){
            p.StartGPT(jTextArea1);
        }
    }
//Upgrade GPT
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double number3 = Double.parseDouble(Preco3.getText());
        if(p.getPontosPlayer() > number3){
            p.subPontos(number3);
            String numeroFormatado = df.format(p.getPontosPlayer());
            jLabel6.setText("Pontos: " + numeroFormatado);
            p.subPontos(number3);
            p.StartGPT(jTextArea1);
            jButton3.setEnabled(false);
            Cgpt = true;
        }else{
            JOptionPane.showMessageDialog(this, "Sem Pontos suficientes \n Digite mais códigos!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseMoved
        jRadioButton2.setToolTipText("Aprimore seu Teclado 30 vezes.Quanto Mais, Melhor!");
    }//GEN-LAST:event_jRadioButton2MouseMoved

    private void jRadioButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseMoved
        jRadioButton3.setToolTipText("Aprimore a Argonomia do seu teclado 20 vezes.Quanto mais Conforto, mais produtividade!");    
    }//GEN-LAST:event_jRadioButton3MouseMoved

    private void jRadioButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseMoved
        jRadioButton4.setToolTipText("Desbloqueie o poder da digitação automática.Seria o Futuro? ou algo mais...");
    }//GEN-LAST:event_jRadioButton4MouseMoved

    private void jRadioButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseMoved
        jRadioButton5.setToolTipText("Supere os desafios e complete a desafiadora fase 8. Você é um verdadeiro mestre dos códigos");
    }//GEN-LAST:event_jRadioButton5MouseMoved

    private void jRadioButton6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton6MouseMoved
        jRadioButton6.setToolTipText("Conquiste todas as realizações disponíveis");
    }//GEN-LAST:event_jRadioButton6MouseMoved


    private void jRadioButton1MouseMoved(java.awt.event.MouseEvent evt) {
        jRadioButton1.setToolTipText("Digite seu primeiro programa Java e conclua a Fase Inicial.");
    }
    




//muda Art do clicador
    private void mudarImagem() {
        if (imagemAtual == 1) {
            fundo = new File(imagem2);
            imagemAtual = 2;
        } else if (imagemAtual == 2) {
            fundo = new File(imagem3);
            imagemAtual = 3;
        } else {
            fundo = new File(imagem1);
            imagemAtual = 1;
        }
        TelaImagem.setImagem(fundo); // Certifique-se de que este método está correto
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Preco1;
    private javax.swing.JLabel Preco2;
    private javax.swing.JLabel Preco3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
