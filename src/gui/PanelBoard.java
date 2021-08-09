package gui;

import clases.Reloj;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PanelBoard extends javax.swing.JPanel {

    public PanelBoard() {
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
        jLabelSkateDimas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabelSkateSacro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabelSkateUjan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 242, 242));
        setMaximumSize(new java.awt.Dimension(610, 490));
        setMinimumSize(new java.awt.Dimension(610, 490));
        setPreferredSize(new java.awt.Dimension(610, 490));
        setLayout(null);
        add(Logo);
        Logo.setBounds(6, 6, 100, 100);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 63, 64));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Boards");
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
        add(jLabelSkateDimas);
        jLabelSkateDimas.setBounds(230, 130, 150, 150);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(62, 63, 64));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><body><center>Tricolor Black Sacro<br>Vladi Rivera<br>$759.00</center></body></html>");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2);
        jLabel2.setBounds(20, 290, 150, 60);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(jSpinner2);
        jSpinner2.setBounds(60, 350, 64, 22);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButton2.setText("Add");
        add(jButton2);
        jButton2.setBounds(50, 390, 90, 25);
        add(jLabelSkateSacro);
        jLabelSkateSacro.setBounds(20, 130, 150, 150);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 63, 64));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><body><center>Tricolor Black Sacro<br>Christian Dimas<br>$759.00</center></body></html>");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel5);
        jLabel5.setBounds(230, 290, 150, 60);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(jSpinner3);
        jSpinner3.setBounds(270, 350, 64, 22);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButton3.setText("Add");
        add(jButton3);
        jButton3.setBounds(260, 390, 90, 25);
        add(jLabelSkateUjan);
        jLabelSkateUjan.setBounds(440, 130, 150, 150);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 63, 64));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html><body><center>Tricolor Black Sacro<br>Genaro Lujan<br>$759.00</center></body></html>");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel6);
        jLabel6.setBounds(440, 290, 150, 60);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(jSpinner4);
        jSpinner4.setBounds(480, 350, 64, 22);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButton4.setText("Add");
        add(jButton4);
        jButton4.setBounds(470, 390, 90, 25);
    }// </editor-fold>//GEN-END:initComponents

    public void resIMG(){
        ImageIcon logo = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logoEscalado = logo.getImage().getScaledInstance(this.Logo.getWidth(), this.Logo.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoLogo = new ImageIcon(logoEscalado);
        this.Logo.setIcon(iconoLogo);
        
        ImageIcon sacro = new ImageIcon(getClass().getResource("/img/skateblacksacro.jpg"));
        Image cremaEscalado = sacro.getImage().getScaledInstance(this.jLabelSkateSacro.getWidth(), this.jLabelSkateSacro.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoCrema = new ImageIcon(cremaEscalado);
        this.jLabelSkateSacro.setIcon(iconoCrema);
        
        ImageIcon dimas = new ImageIcon(getClass().getResource("/img/skatedimas.jpg"));
        Image dimasEscalado = dimas.getImage().getScaledInstance(this.jLabelSkateDimas.getWidth(), this.jLabelSkateDimas.getHeight(),
        Image.SCALE_SMOOTH);
        Icon dimasPelos = new ImageIcon(dimasEscalado);
        this.jLabelSkateDimas.setIcon(dimasPelos);
        
        ImageIcon ujan = new ImageIcon(getClass().getResource("/img/skateujan.jpg"));
        Image ujanEscalado = ujan.getImage().getScaledInstance(this.jLabelSkateUjan.getWidth(), this.jLabelSkateUjan.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoUjan = new ImageIcon(ujanEscalado);
        this.jLabelSkateUjan.setIcon(iconoUjan);
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
    private javax.swing.JLabel jLabelReloj;
    private javax.swing.JLabel jLabelSkateDimas;
    private javax.swing.JLabel jLabelSkateSacro;
    private javax.swing.JLabel jLabelSkateUjan;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    // End of variables declaration//GEN-END:variables
}
