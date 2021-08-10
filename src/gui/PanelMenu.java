package gui;

import clases.Reloj;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class PanelMenu extends javax.swing.JPanel {

    
    public PanelMenu() {
        initComponents();
        imgMenu();
        showDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelReloj = new javax.swing.JLabel();
        jButtonWheel = new javax.swing.JButton();
        jButtonBoard = new javax.swing.JButton();
        jButtonTrucks = new javax.swing.JButton();
        jButtonBearings = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 242, 242));
        setMaximumSize(new java.awt.Dimension(610, 490));
        setMinimumSize(new java.awt.Dimension(610, 490));
        setPreferredSize(new java.awt.Dimension(610, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 100, 100));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 63, 64));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¡Welcome!");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 30, 260, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 63, 64));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jLabelReloj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj.setText("dd/mm/yyyy");
        jLabelReloj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabelReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 100, -1));

        jButtonWheel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonWheel.setDefaultCapable(false);
        jButtonWheel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWheelActionPerformed(evt);
            }
        });
        add(jButtonWheel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 200, 140));

        jButtonBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBoard.setDefaultCapable(false);
        jButtonBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBoardActionPerformed(evt);
            }
        });
        add(jButtonBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 200, 140));

        jButtonTrucks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTrucks.setDefaultCapable(false);
        jButtonTrucks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrucksActionPerformed(evt);
            }
        });
        add(jButtonTrucks, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 140));

        jButtonBearings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBearings.setDefaultCapable(false);
        jButtonBearings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBearingsActionPerformed(evt);
            }
        });
        add(jButtonBearings, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 200, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonWheelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWheelActionPerformed
        PanelWheels pwheels = new PanelWheels();
        pwheels.setSize(610,490);
        pwheels.setLocation(0, 0);
        removeAll();
        revalidate();
        repaint();
        add(pwheels);
    }//GEN-LAST:event_jButtonWheelActionPerformed

    private void jButtonBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBoardActionPerformed
        PanelBoard pboard = new PanelBoard();
        pboard.setSize(610,490);
        pboard.setLocation(0, 0);
        removeAll();
        revalidate();
        repaint();
        add(pboard);
    }//GEN-LAST:event_jButtonBoardActionPerformed

    private void jButtonTrucksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrucksActionPerformed
        PanelTrucks ptrucks = new PanelTrucks();
        ptrucks.setSize(610,490);
        ptrucks.setLocation(0, 0);
        removeAll();
        revalidate();
        repaint();
        add(ptrucks);
    }//GEN-LAST:event_jButtonTrucksActionPerformed

    private void jButtonBearingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBearingsActionPerformed
        PanelBearings pbearings = new PanelBearings();
        pbearings.setSize(610,490);
        pbearings.setLocation(0, 0);
        removeAll();
        revalidate();
        repaint();
        add(pbearings);
    }//GEN-LAST:event_jButtonBearingsActionPerformed
 
    public void imgMenu(){
        ImageIcon logo = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logoEscalado = logo.getImage().getScaledInstance(this.Logo.getWidth(), this.Logo.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoLogo = new ImageIcon(logoEscalado);
        this.Logo.setIcon(iconoLogo);
        
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/btnwheels.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(this.jButtonWheel.getWidth(),
        this.jButtonWheel.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        this.jButtonWheel.setIcon(iconoEscalado);
        
        ImageIcon imgBoard = new ImageIcon(getClass().getResource("/img/btnboard.png"));
        Image boardEscalada = imgBoard.getImage().getScaledInstance(this.jButtonBoard.getWidth(),
        this.jButtonBoard.getHeight(), Image.SCALE_SMOOTH);
        Icon boardEscalado = new ImageIcon(boardEscalada);
        this.jButtonBoard.setIcon(boardEscalado);
        
        ImageIcon imgTrucks = new ImageIcon(getClass().getResource("/img/btntrucks.png"));
        Image trucksEscalada = imgTrucks.getImage().getScaledInstance(this.jButtonTrucks.getWidth(),
        this.jButtonTrucks.getHeight(), Image.SCALE_SMOOTH);
        Icon trucksEscalado = new ImageIcon(trucksEscalada);
        this.jButtonTrucks.setIcon(trucksEscalado);
        
        ImageIcon imgBearings = new ImageIcon(getClass().getResource("/img/btnbearings.png"));
        Image bearingsEscalada = imgBearings.getImage().getScaledInstance(this.jButtonBearings.getWidth(),
        this.jButtonBearings.getHeight(), Image.SCALE_SMOOTH);
        Icon bearingsEscalado = new ImageIcon(bearingsEscalada);
        this.jButtonBearings.setIcon(bearingsEscalado);
    }
    
    public void showDate(){
        Reloj r = new Reloj();
        this.jLabelReloj.setText(r.hfActual());
    }
                                                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButtonBearings;
    private javax.swing.JButton jButtonBoard;
    private javax.swing.JButton jButtonTrucks;
    private javax.swing.JButton jButtonWheel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelReloj;
    // End of variables declaration//GEN-END:variables
}
