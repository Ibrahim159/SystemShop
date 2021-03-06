/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author ibrah
 */
public class PanelShoppingCart extends javax.swing.JPanel {

    /**
     * Creates new form PanelShoppingCart
     */
    public PanelShoppingCart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelReloj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 242, 242));
        setMaximumSize(new java.awt.Dimension(610, 490));
        setMinimumSize(new java.awt.Dimension(610, 490));
        setLayout(null);
        add(Logo);
        Logo.setBounds(6, 6, 100, 100);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 63, 64));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Shopping Cart");
        add(jLabel4);
        jLabel4.setBounds(175, 30, 260, 47);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 63, 64));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date:");
        add(jLabel3);
        jLabel3.setBounds(530, 30, 36, 19);

        jLabelReloj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj.setText("dd/mm/yyyy");
        jLabelReloj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabelReloj);
        jLabelReloj.setBounds(500, 50, 100, 19);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(62, 63, 64));
        jLabel1.setText("Nombre:");
        add(jLabel1);
        jLabel1.setBounds(100, 120, 70, 30);

        jTextField1.setBackground(new java.awt.Color(62, 63, 64));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(242, 242, 242));
        add(jTextField1);
        jTextField1.setBounds(175, 120, 260, 30);

        jList1.setBackground(new java.awt.Color(62, 63, 64));
        jList1.setForeground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 180, 450, 220);

        jPanel1.setBackground(new java.awt.Color(62, 63, 64));
        jPanel1.setLayout(new java.awt.GridLayout());

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(242, 242, 242));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        jButton4.setText("Cancel");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jPanel1.add(jButton4);

        add(jPanel1);
        jPanel1.setBounds(100, 430, 100, 30);

        jPanel2.setBackground(new java.awt.Color(62, 63, 64));
        jPanel2.setLayout(new java.awt.GridLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy.png"))); // NOI18N
        jButton2.setText("To Pay");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jPanel2.add(jButton2);

        add(jPanel2);
        jPanel2.setBounds(450, 430, 100, 30);

        jPanel3.setBackground(new java.awt.Color(62, 63, 64));
        jPanel3.setLayout(new java.awt.GridLayout());

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(242, 242, 242));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/send.png"))); // NOI18N
        jButton3.setText("Capture");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jPanel3.add(jButton3);

        add(jPanel3);
        jPanel3.setBounds(440, 120, 108, 29);
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelReloj;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
