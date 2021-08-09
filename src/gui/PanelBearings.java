package gui;

import clases.Reloj;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class PanelBearings extends javax.swing.JPanel {

    
    public PanelBearings() {
        initComponents();
        resIMG();
        showDate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelReloj = new javax.swing.JLabel();
        jLabelAbecAntiBlack = new javax.swing.JLabel();
        jLabelAbecAntiGold = new javax.swing.JLabel();
        jLabelAbecArreRed = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 242, 242));
        setMaximumSize(new java.awt.Dimension(610, 490));
        setMinimumSize(new java.awt.Dimension(610, 490));
        setLayout(null);
        add(Logo);
        Logo.setBounds(6, 6, 100, 100);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 63, 64));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bearings");
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
        add(jLabelAbecAntiBlack);
        jLabelAbecAntiBlack.setBounds(20, 130, 150, 130);
        add(jLabelAbecAntiGold);
        jLabelAbecAntiGold.setBounds(240, 130, 150, 130);
        add(jLabelAbecArreRed);
        jLabelAbecArreRed.setBounds(450, 130, 150, 130);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(62, 63, 64));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><body><center>Antifashion<br>Baleros Abec 9<br>$399.00</center></body></html>");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2);
        jLabel2.setBounds(20, 290, 150, 60);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 63, 64));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><body><center>Antifashion<br>Baleros Abec 7<br>$349.00</center></body></html>");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel5);
        jLabel5.setBounds(240, 290, 150, 60);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 63, 64));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html><body><center>Arre<br>Baleros Abec 9<br>$290.00</center></body></html>");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel6);
        jLabel6.setBounds(450, 290, 150, 60);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(jSpinner2);
        jSpinner2.setBounds(60, 350, 64, 22);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(jSpinner3);
        jSpinner3.setBounds(280, 350, 64, 22);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(jSpinner4);
        jSpinner4.setBounds(490, 350, 64, 22);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButton2.setText("Add");
        add(jButton2);
        jButton2.setBounds(50, 390, 90, 25);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButton3.setText("Add");
        add(jButton3);
        jButton3.setBounds(270, 390, 90, 25);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButton4.setText("Add");
        add(jButton4);
        jButton4.setBounds(480, 390, 90, 25);
    }// </editor-fold>//GEN-END:initComponents
    
    public void resIMG(){
        ImageIcon logo = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logoEscalado = logo.getImage().getScaledInstance(this.Logo.getWidth(), this.Logo.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoLogo = new ImageIcon(logoEscalado);
        this.Logo.setIcon(iconoLogo);
        
        ImageIcon imperial = new ImageIcon(getClass().getResource("/img/abec7antibalck.jpg"));
        Image cremaEscalado = imperial.getImage().getScaledInstance(this.jLabelAbecAntiBlack.getWidth(), this.jLabelAbecAntiBlack.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoCrema = new ImageIcon(cremaEscalado);
        this.jLabelAbecAntiBlack.setIcon(iconoCrema);
        
        ImageIcon colors = new ImageIcon(getClass().getResource("/img/abec9antigold.jpg"));
        Image pelosEscalado = colors.getImage().getScaledInstance(this.jLabelAbecAntiGold.getWidth(), this.jLabelAbecAntiGold.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoPelos = new ImageIcon(pelosEscalado);
        this.jLabelAbecAntiGold.setIcon(iconoPelos);
        
        ImageIcon raw = new ImageIcon(getClass().getResource("/img/abec9arrered.jpg"));
        Image vomitoEscalado = raw.getImage().getScaledInstance(this.jLabelAbecArreRed.getWidth(), this.jLabelAbecArreRed.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoVomito = new ImageIcon(vomitoEscalado);
        this.jLabelAbecArreRed.setIcon(iconoVomito);
    }
    
    public void showDate(){
        Reloj r = new Reloj();
        this.jLabelReloj.setText(r.hfActual());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAbecAntiBlack;
    private javax.swing.JLabel jLabelAbecAntiGold;
    private javax.swing.JLabel jLabelAbecArreRed;
    private javax.swing.JLabel jLabelReloj;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    // End of variables declaration//GEN-END:variables
}
