/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ds.boardgame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class TelaBoardGame extends javax.swing.JFrame {
    
    ImageIcon imgFace1 = new ImageIcon("images/face1.jpg");
    ImageIcon imgFace2 = new ImageIcon("images/face2.jpg");
    ImageIcon imgFace3 = new ImageIcon("images/face3.jpg");
    ImageIcon imgFace4 = new ImageIcon("images/face4.jpg");
    ImageIcon imgFace5 = new ImageIcon("images/face5.jpg");
    ImageIcon imgFace6 = new ImageIcon("images/face6.jpg");
    ImageIcon imgViserion = new ImageIcon("images/DRagonViserion.png");
    ImageIcon imgDrogon = new ImageIcon("images/DRagonDrogon.png");
    ImageIcon imgRhaegal = new ImageIcon("images/DragonRhaegal.png");
    
    private final int posChegada;

    /**
     * Creates new form TelaBoardGame
     */
    public TelaBoardGame() {
        initComponents();
        btnBotao.setBackground(Color.green);
        
        posChegada = lblVencedor.getX();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        int size = 100;
        
        g.drawLine(150, 200, 950, 200);
        g.drawLine(150, 300, 950, 300);
        for (int i=1;i<10;i++)
            g.drawLine(50+(i*size), 200, 50+(i*size), 300);  
        
        g.drawLine(150, 400, 950, 400);
        g.drawLine(150, 500, 950, 500);
        for (int i=1;i<10;i++)
            g.drawLine(50+(i*size), 400, 50+(i*size), 500);
        
        g.drawLine(150, 600, 950, 600);
        g.drawLine(150, 700, 950, 700);
        for (int i=1;i<10;i++)
            g.drawLine(50+(i*size), 600, 50+(i*size), 700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSorteio = new javax.swing.JPanel();
        btnBotao = new javax.swing.JButton();
        lblDados = new javax.swing.JLabel();
        pnlCorrida = new javax.swing.JPanel();
        lblVencedor = new javax.swing.JLabel();
        lblViserion = new javax.swing.JLabel();
        lblDrogon = new javax.swing.JLabel();
        lblRhaegal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBotao.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        btnBotao.setText("PLAY");
        btnBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotaoActionPerformed(evt);
            }
        });

        lblDados.setText(".");

        javax.swing.GroupLayout pnlSorteioLayout = new javax.swing.GroupLayout(pnlSorteio);
        pnlSorteio.setLayout(pnlSorteioLayout);
        pnlSorteioLayout.setHorizontalGroup(
            pnlSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSorteioLayout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addComponent(lblDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(487, 487, 487))
        );
        pnlSorteioLayout.setVerticalGroup(
            pnlSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSorteioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDados)
                    .addComponent(btnBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        lblVencedor.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblVencedor.setText("<html>\nV<br>E<br>N<br>C<br>E<br>D<br>O<br>R\n</html>");

        lblViserion.setIcon(new javax.swing.ImageIcon("/home/aluno/NetBeansProjects/BoardGame/images/DRagonViserion.png")); // NOI18N

        lblDrogon.setIcon(new javax.swing.ImageIcon("/home/aluno/NetBeansProjects/BoardGame/images/DragonDrogon.png")); // NOI18N

        lblRhaegal.setIcon(new javax.swing.ImageIcon("/home/aluno/NetBeansProjects/BoardGame/images/DragonRhaegal.png")); // NOI18N

        javax.swing.GroupLayout pnlCorridaLayout = new javax.swing.GroupLayout(pnlCorrida);
        pnlCorrida.setLayout(pnlCorridaLayout);
        pnlCorridaLayout.setHorizontalGroup(
            pnlCorridaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCorridaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnlCorridaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDrogon)
                    .addComponent(lblViserion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRhaegal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        pnlCorridaLayout.setVerticalGroup(
            pnlCorridaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCorridaLayout.createSequentialGroup()
                .addGroup(pnlCorridaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCorridaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCorridaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblViserion)
                        .addGap(126, 126, 126)
                        .addComponent(lblDrogon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRhaegal)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSorteio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlCorrida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSorteio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCorrida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotaoActionPerformed
     int random = (new Random()).nextInt ( 6 ) + 1;
        
        mostraDado(random);
        
        movePlayer(random);
            
        if(btnBotao.getBackground() == Color.green)
            btnBotao.setBackground(Color.red);
        else if(btnBotao.getBackground() == Color.red)
            btnBotao.setBackground(Color.blue);
        else
            btnBotao.setBackground(Color.green);
        
            this.repaint();
    }//GEN-LAST:event_btnBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaBoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBoardGame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBotao;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblDrogon;
    private javax.swing.JLabel lblRhaegal;
    private javax.swing.JLabel lblVencedor;
    private javax.swing.JLabel lblViserion;
    private javax.swing.JPanel pnlCorrida;
    private javax.swing.JPanel pnlSorteio;
    // End of variables declaration//GEN-END:variables

    private void mostraDado(int random) {
      switch (random) {
            case 1:
                  JOptionPane.showMessageDialog(rootPane, "Valor sorteado: ", "Dado", JOptionPane.INFORMATION_MESSAGE, imgFace1);
                  break;
            case 2:
                  JOptionPane.showMessageDialog(rootPane, "Valor sorteado: ", "Dado", JOptionPane.INFORMATION_MESSAGE, imgFace2);
                  break;
            case 3:
                  JOptionPane.showMessageDialog(rootPane, "Valor sorteado: ", "Dado", JOptionPane.INFORMATION_MESSAGE, imgFace3);
                  break;
            case 4:
                  JOptionPane.showMessageDialog(rootPane, "Valor sorteado: ", "Dado", JOptionPane.INFORMATION_MESSAGE, imgFace4);
                  break;
            case 5:
                  JOptionPane.showMessageDialog(rootPane, "Valor sorteado: ", "Dado", JOptionPane.INFORMATION_MESSAGE, imgFace5);
                  break;
            case 6:
                  JOptionPane.showMessageDialog(rootPane, "Valor sorteado: ", "Dado", JOptionPane.INFORMATION_MESSAGE, imgFace6);
                  break;
      }
    }
      
    private void movePlayer(int random) {
        ImageIcon venceu = null;
        if(btnBotao.getBackground() == Color.green) {
           int novaPosicao = lblViserion.getX()+random*100; 
           
           if(novaPosicao > posChegada) {
              novaPosicao = posChegada;
              venceu = imgViserion; 
           }
           
           lblViserion.setBounds(novaPosicao,  lblViserion.getY(),  lblViserion.getWidth(), lblViserion.getHeight());
        } else if(btnBotao.getBackground() == Color.red) {
          int novaPosicao = lblDrogon.getX()+random*100; 
           
           if(novaPosicao > posChegada) {
              novaPosicao = posChegada;
              venceu = imgDrogon; 
           }
              
          lblDrogon.setBounds(novaPosicao,  lblDrogon.getY(),  lblDrogon.getWidth(), lblDrogon.getHeight());
        } else {
            int novaPosicao = lblRhaegal.getX()+random*100; 
           
           if(novaPosicao > posChegada) {
              novaPosicao = posChegada;
              venceu = imgRhaegal;
           }   
            
           lblRhaegal.setBounds(novaPosicao,  lblRhaegal.getY(),  lblRhaegal.getWidth(), lblRhaegal.getHeight()); 
        } 
        
        if(venceu != null) {
            JOptionPane.showMessageDialog(rootPane, "Vencedor: ", "Pódio", JOptionPane.INFORMATION_MESSAGE, venceu);
        }
        
    }
    
}
    
 

