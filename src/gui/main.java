
package gui;

import clases.ClassContador;
import clases.ClassProductos;
import clases.ClassWheels;
import clases.Reloj;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class main extends javax.swing.JFrame {
    private int aux = 0;
    private ArrayList <ClassProductos> products = new ArrayList();
    private ClassContador cont = new ClassContador();
    DefaultListModel modeloLista = new DefaultListModel();
    
    public main() {
        initComponents();
        jList1.setModel(modeloLista);
        this.jPanelMenu.setVisible(true);
        resIMG();
        setLocationRelativeTo(null);
        showDate();
        imgMenu();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asideLabel = new javax.swing.JPanel();
        jLabelProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jButtonShoppingCart = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelContadorCart = new javax.swing.JLabel();
        homeLabel = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelReloj = new javax.swing.JLabel();
        jButtonWheel = new javax.swing.JButton();
        jButtonBoard = new javax.swing.JButton();
        jButtonTrucks = new javax.swing.JButton();
        jButtonBearings = new javax.swing.JButton();
        jPanelWheels = new javax.swing.JPanel();
        Logo1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelReloj1 = new javax.swing.JLabel();
        jLabelRataPelos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerRuedas2 = new javax.swing.JSpinner();
        jButtonRuedas2 = new javax.swing.JButton();
        jLabelRataCrema = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSpinnerRuedas1 = new javax.swing.JSpinner();
        jButtonRuedas1 = new javax.swing.JButton();
        jLabelRataVomito = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerRuedas3 = new javax.swing.JSpinner();
        jButtonRuedas3 = new javax.swing.JButton();
        jPanelShoppingCart = new javax.swing.JPanel();
        Logo2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelReloj2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asideLabel.setBackground(new java.awt.Color(62, 63, 64));
        asideLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        asideLabel.add(jLabelProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 150));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ramirez Sosa");
        asideLabel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Leonardo Ibrahim");
        asideLabel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 30));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jButton1.setText("Log out");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        asideLabel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 350, 150, -1));

        jButtonHome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(242, 242, 242));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jButtonHome.setText("Home");
        jButtonHome.setBorderPainted(false);
        jButtonHome.setContentAreaFilled(false);
        jButtonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHome.setFocusPainted(false);
        jButtonHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        asideLabel.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, -1));

        jButtonShoppingCart.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonShoppingCart.setForeground(new java.awt.Color(242, 242, 242));
        jButtonShoppingCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonShoppingCart.setText("Shopping Cart");
        jButtonShoppingCart.setBorderPainted(false);
        jButtonShoppingCart.setContentAreaFilled(false);
        jButtonShoppingCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonShoppingCart.setFocusPainted(false);
        jButtonShoppingCart.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShoppingCart.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonShoppingCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShoppingCartActionPerformed(evt);
            }
        });
        asideLabel.add(jButtonShoppingCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(242, 242, 242));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings.png"))); // NOI18N
        jButton4.setText("Settings");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        asideLabel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seller");
        asideLabel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        jLabelContadorCart.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContadorCart.setForeground(new java.awt.Color(242, 242, 242));
        asideLabel.add(jLabelContadorCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 30, 20));

        getContentPane().add(asideLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 490));

        homeLabel.setBackground(new java.awt.Color(242, 242, 242));
        homeLabel.setLayout(new java.awt.CardLayout());

        jPanelMenu.setBackground(new java.awt.Color(242, 242, 242));
        jPanelMenu.setMaximumSize(new java.awt.Dimension(610, 490));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(610, 490));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(610, 490));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelMenu.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 100, 100));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 63, 64));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¡Welcome!");
        jPanelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 30, 260, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 63, 64));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date:");
        jPanelMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jLabelReloj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj.setText("dd/mm/yyyy");
        jLabelReloj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelMenu.add(jLabelReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 100, -1));

        jButtonWheel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonWheel.setDefaultCapable(false);
        jButtonWheel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWheelActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonWheel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 200, 140));

        jButtonBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBoard.setDefaultCapable(false);
        jButtonBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBoardActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 200, 140));

        jButtonTrucks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTrucks.setDefaultCapable(false);
        jButtonTrucks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrucksActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonTrucks, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 140));

        jButtonBearings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBearings.setDefaultCapable(false);
        jButtonBearings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBearingsActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonBearings, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 200, 140));

        homeLabel.add(jPanelMenu, "card2");

        jPanelWheels.setBackground(new java.awt.Color(242, 242, 242));
        jPanelWheels.setMaximumSize(new java.awt.Dimension(610, 490));
        jPanelWheels.setMinimumSize(new java.awt.Dimension(610, 490));
        jPanelWheels.setLayout(null);
        jPanelWheels.add(Logo1);
        Logo1.setBounds(6, 6, 100, 100);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 63, 64));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Wheels");
        jPanelWheels.add(jLabel6);
        jLabel6.setBounds(175, 30, 260, 47);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(62, 63, 64));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Date:");
        jPanelWheels.add(jLabel7);
        jLabel7.setBounds(530, 30, 36, 19);

        jLabelReloj1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj1.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj1.setText("dd/mm/yyyy");
        jLabelReloj1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelWheels.add(jLabelReloj1);
        jLabelReloj1.setBounds(500, 50, 100, 19);
        jPanelWheels.add(jLabelRataPelos);
        jLabelRataPelos.setBounds(450, 130, 150, 130);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(62, 63, 64));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html><body><center>Rata Wheels<br>Pelos Morado 55 mm<br>$519.00</center></body></html>");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelWheels.add(jLabel8);
        jLabel8.setBounds(450, 270, 150, 60);

        jSpinnerRuedas2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerRuedas2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelWheels.add(jSpinnerRuedas2);
        jSpinnerRuedas2.setBounds(290, 330, 50, 30);

        jButtonRuedas2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonRuedas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonRuedas2.setText("Add");
        jButtonRuedas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRuedas2ActionPerformed(evt);
            }
        });
        jPanelWheels.add(jButtonRuedas2);
        jButtonRuedas2.setBounds(270, 370, 90, 29);
        jPanelWheels.add(jLabelRataCrema);
        jLabelRataCrema.setBounds(20, 130, 150, 130);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(62, 63, 64));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html><body><center>Rata Wheels<br>Purple Head 55 mm<br>$519.00</center></body></html>");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelWheels.add(jLabel9);
        jLabel9.setBounds(20, 270, 150, 60);

        jSpinnerRuedas1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerRuedas1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelWheels.add(jSpinnerRuedas1);
        jSpinnerRuedas1.setBounds(70, 330, 50, 30);

        jButtonRuedas1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonRuedas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonRuedas1.setText("Add");
        jButtonRuedas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRuedas1ActionPerformed(evt);
            }
        });
        jPanelWheels.add(jButtonRuedas1);
        jButtonRuedas1.setBounds(50, 370, 90, 29);
        jPanelWheels.add(jLabelRataVomito);
        jLabelRataVomito.setBounds(240, 130, 150, 130);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(62, 63, 64));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html><body><center>Rata Wheels<br>Vomito Verde 55 mm<br>$519.00</center></body></html>");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelWheels.add(jLabel10);
        jLabel10.setBounds(240, 270, 150, 60);

        jSpinnerRuedas3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerRuedas3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelWheels.add(jSpinnerRuedas3);
        jSpinnerRuedas3.setBounds(500, 330, 50, 30);

        jButtonRuedas3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonRuedas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonRuedas3.setText("Add");
        jButtonRuedas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRuedas3ActionPerformed(evt);
            }
        });
        jPanelWheels.add(jButtonRuedas3);
        jButtonRuedas3.setBounds(480, 370, 90, 29);

        homeLabel.add(jPanelWheels, "card3");

        jPanelShoppingCart.setBackground(new java.awt.Color(242, 242, 242));
        jPanelShoppingCart.setMaximumSize(new java.awt.Dimension(610, 490));
        jPanelShoppingCart.setMinimumSize(new java.awt.Dimension(610, 490));
        jPanelShoppingCart.setLayout(null);
        jPanelShoppingCart.add(Logo2);
        Logo2.setBounds(6, 6, 100, 100);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(62, 63, 64));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Shopping Cart");
        jPanelShoppingCart.add(jLabel11);
        jLabel11.setBounds(175, 30, 260, 47);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(62, 63, 64));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Date:");
        jPanelShoppingCart.add(jLabel12);
        jLabel12.setBounds(530, 30, 36, 19);

        jLabelReloj2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj2.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj2.setText("dd/mm/yyyy");
        jLabelReloj2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelShoppingCart.add(jLabelReloj2);
        jLabelReloj2.setBounds(500, 50, 100, 19);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(62, 63, 64));
        jLabel13.setText("Nombre:");
        jPanelShoppingCart.add(jLabel13);
        jLabel13.setBounds(100, 120, 70, 30);

        jTextField1.setBackground(new java.awt.Color(62, 63, 64));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(242, 242, 242));
        jPanelShoppingCart.add(jTextField1);
        jTextField1.setBounds(175, 120, 260, 30);

        jList1.setBackground(new java.awt.Color(62, 63, 64));
        jList1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setViewportView(jList1);

        jPanelShoppingCart.add(jScrollPane1);
        jScrollPane1.setBounds(100, 180, 450, 220);

        jPanel2.setBackground(new java.awt.Color(62, 63, 64));
        jPanel2.setLayout(new java.awt.GridLayout());

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(242, 242, 242));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        jButton5.setText("Cancel");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jPanel2.add(jButton5);

        jPanelShoppingCart.add(jPanel2);
        jPanel2.setBounds(100, 430, 100, 30);

        jPanel3.setBackground(new java.awt.Color(62, 63, 64));
        jPanel3.setLayout(new java.awt.GridLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy.png"))); // NOI18N
        jButton2.setText("To Pay");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jPanel3.add(jButton2);

        jPanelShoppingCart.add(jPanel3);
        jPanel3.setBounds(450, 430, 100, 30);

        jPanel4.setBackground(new java.awt.Color(62, 63, 64));
        jPanel4.setLayout(new java.awt.GridLayout());

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(242, 242, 242));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/send.png"))); // NOI18N
        jButton3.setText("Capture");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jPanel4.add(jButton3);

        jPanelShoppingCart.add(jPanel4);
        jPanel4.setBounds(440, 120, 108, 29);

        homeLabel.add(jPanelShoppingCart, "card4");

        getContentPane().add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 610, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShoppingCartActionPerformed
        this.homeLabel.removeAll();
        this.homeLabel.revalidate();
        this.homeLabel.repaint();
        this.homeLabel.add(this.jPanelShoppingCart);
    }//GEN-LAST:event_jButtonShoppingCartActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        this.homeLabel.removeAll();
        this.homeLabel.revalidate();
        this.homeLabel.repaint();
        this.homeLabel.add(this.jPanelMenu);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonWheelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWheelActionPerformed
        this.homeLabel.removeAll();
        this.homeLabel.revalidate();
        this.homeLabel.repaint();
        this.homeLabel.add(this.jPanelWheels);;
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

    private void jButtonRuedas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRuedas1ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerRuedas1.getValue());
        this.products.add(new ClassWheels("Purple Head","55mm","Rata Wheels",599.00,(Integer) this.jSpinnerRuedas1.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonRuedas1ActionPerformed

    private void jButtonRuedas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRuedas2ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerRuedas2.getValue());
        this.products.add(new ClassWheels("Vomito Verde","55mm","Rata Wheels",599.00,(Integer) this.jSpinnerRuedas2.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonRuedas2ActionPerformed

    private void jButtonRuedas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRuedas3ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerRuedas3.getValue());
        this.products.add(new ClassWheels("Pelos Morado","55mm","Rata Wheels",599.00,(Integer) this.jSpinnerRuedas3.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonRuedas3ActionPerformed
    
    private void showCounter(){
        if(this.cont.getCont() < 100){
            this.jLabelContadorCart.setText(String.valueOf(this.cont.getCont()));
        }else{
            this.jLabelContadorCart.setText("99+");
        }
    }
    
    public void resIMG(){
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/me_round.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(this.jLabelProfile.getWidth(),
        this.jLabelProfile.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        this.jLabelProfile.setIcon(iconoEscalado);
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logoEscalado = logo.getImage().getScaledInstance(this.Logo.getWidth(), this.Logo.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoLogo = new ImageIcon(logoEscalado);
        this.Logo.setIcon(iconoLogo);
    }
    
    public void imgMenu(){
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
        
        ImageIcon crema = new ImageIcon(getClass().getResource("/img/ratacrema.jpg"));
        Image cremaEscalado = crema.getImage().getScaledInstance(this.jLabelRataCrema.getWidth(), this.jLabelRataCrema.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoCrema = new ImageIcon(cremaEscalado);
        this.jLabelRataCrema.setIcon(iconoCrema);
        
        ImageIcon pelos = new ImageIcon(getClass().getResource("/img/ratapelos.jpg"));
        Image pelosEscalado = pelos.getImage().getScaledInstance(this.jLabelRataPelos.getWidth(), this.jLabelRataPelos.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoPelos = new ImageIcon(pelosEscalado);
        this.jLabelRataPelos.setIcon(iconoPelos);
        
        ImageIcon vomito = new ImageIcon(getClass().getResource("/img/ratavomito.jpg"));
        Image vomitoEscalado = vomito.getImage().getScaledInstance(this.jLabelRataVomito.getWidth(), this.jLabelRataVomito.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoVomito = new ImageIcon(vomitoEscalado);
        this.jLabelRataVomito.setIcon(iconoVomito);
    }
    
    public void showDate(){
        Reloj r = new Reloj();
        this.jLabelReloj.setText(r.hfActual());
    }
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logo2;
    private javax.swing.JPanel asideLabel;
    private javax.swing.JPanel homeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonBearings;
    private javax.swing.JButton jButtonBoard;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonRuedas1;
    private javax.swing.JButton jButtonRuedas2;
    private javax.swing.JButton jButtonRuedas3;
    private javax.swing.JButton jButtonShoppingCart;
    private javax.swing.JButton jButtonTrucks;
    private javax.swing.JButton jButtonWheel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelContadorCart;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JLabel jLabelRataCrema;
    private javax.swing.JLabel jLabelRataPelos;
    private javax.swing.JLabel jLabelRataVomito;
    private javax.swing.JLabel jLabelReloj;
    private javax.swing.JLabel jLabelReloj1;
    private javax.swing.JLabel jLabelReloj2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelShoppingCart;
    private javax.swing.JPanel jPanelWheels;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerRuedas1;
    private javax.swing.JSpinner jSpinnerRuedas2;
    private javax.swing.JSpinner jSpinnerRuedas3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
