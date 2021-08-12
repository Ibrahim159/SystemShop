
package gui;

import clases.ClassBearings;
import clases.ClassBoard;
import clases.ClassContador;
import clases.ClassProductos;
import clases.ClassTrucks;
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
        jPanelBoards = new javax.swing.JPanel();
        Logo3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelReloj3 = new javax.swing.JLabel();
        jLabelSkateDimas = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinnerTablas1 = new javax.swing.JSpinner();
        jLabelSkateSacro = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSpinnerTablas2 = new javax.swing.JSpinner();
        jLabelSkateUjan = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSpinnerTablas3 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jButtonsTabla1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonTablas2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonTablas3 = new javax.swing.JButton();
        jPanelTrucks = new javax.swing.JPanel();
        Logo4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelReloj4 = new javax.swing.JLabel();
        jLabelTrucksImperial = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinnerTrucks1 = new javax.swing.JSpinner();
        jButtonTrucks1 = new javax.swing.JButton();
        jLabelTrucksColor = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSpinnerTrucks2 = new javax.swing.JSpinner();
        jButtonTrucks2 = new javax.swing.JButton();
        jLabelTrucksRaw = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSpinnerTrucks3 = new javax.swing.JSpinner();
        jButtonTrucks3 = new javax.swing.JButton();
        jPanelBearings = new javax.swing.JPanel();
        Logo5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabelReloj5 = new javax.swing.JLabel();
        jLabelAbecAntiBlack = new javax.swing.JLabel();
        jLabelAbecAntiGold = new javax.swing.JLabel();
        jLabelAbecArreRed = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSpinnerAntiAbec9 = new javax.swing.JSpinner();
        jSpinnerBearings2 = new javax.swing.JSpinner();
        jSpinnerBearings3 = new javax.swing.JSpinner();
        jButtonAntiAbec9 = new javax.swing.JButton();
        jButtonBearings2 = new javax.swing.JButton();
        jButtonBearings3 = new javax.swing.JButton();

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
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

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
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

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
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

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

        jPanelBoards.setBackground(new java.awt.Color(242, 242, 242));
        jPanelBoards.setMaximumSize(new java.awt.Dimension(610, 490));
        jPanelBoards.setMinimumSize(new java.awt.Dimension(610, 490));
        jPanelBoards.setLayout(null);
        jPanelBoards.add(Logo3);
        Logo3.setBounds(6, 6, 100, 100);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(62, 63, 64));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Boards");
        jPanelBoards.add(jLabel14);
        jLabel14.setBounds(175, 30, 260, 47);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(62, 63, 64));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Date:");
        jPanelBoards.add(jLabel15);
        jLabel15.setBounds(530, 30, 36, 19);

        jLabelReloj3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj3.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj3.setText("dd/mm/yyyy");
        jLabelReloj3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelBoards.add(jLabelReloj3);
        jLabelReloj3.setBounds(500, 50, 100, 19);
        jPanelBoards.add(jLabelSkateDimas);
        jLabelSkateDimas.setBounds(230, 130, 150, 150);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(62, 63, 64));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("<html><body><center>Tricolor Black Sacro<br>Vladi Rivera<br>$759.00</center></body></html>");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelBoards.add(jLabel16);
        jLabel16.setBounds(20, 290, 150, 60);

        jSpinnerTablas1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerTablas1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelBoards.add(jSpinnerTablas1);
        jSpinnerTablas1.setBounds(70, 350, 50, 30);
        jPanelBoards.add(jLabelSkateSacro);
        jLabelSkateSacro.setBounds(20, 130, 150, 150);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(62, 63, 64));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("<html><body><center>Tricolor Black Sacro<br>Christian Dimas<br>$759.00</center></body></html>");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelBoards.add(jLabel17);
        jLabel17.setBounds(230, 290, 150, 60);

        jSpinnerTablas2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerTablas2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelBoards.add(jSpinnerTablas2);
        jSpinnerTablas2.setBounds(280, 350, 50, 30);
        jPanelBoards.add(jLabelSkateUjan);
        jLabelSkateUjan.setBounds(440, 130, 150, 150);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(62, 63, 64));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("<html><body><center>Tricolor Black Sacro<br>Genaro Lujan<br>$759.00</center></body></html>");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelBoards.add(jLabel18);
        jLabel18.setBounds(440, 290, 150, 60);

        jSpinnerTablas3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerTablas3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelBoards.add(jSpinnerTablas3);
        jSpinnerTablas3.setBounds(490, 350, 50, 30);

        jPanel1.setBackground(new java.awt.Color(62, 63, 64));
        jPanel1.setLayout(new java.awt.GridLayout());

        jButtonsTabla1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonsTabla1.setForeground(new java.awt.Color(242, 242, 242));
        jButtonsTabla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonsTabla1.setText("Add");
        jButtonsTabla1.setContentAreaFilled(false);
        jButtonsTabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonsTabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsTabla1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonsTabla1);

        jPanelBoards.add(jPanel1);
        jPanel1.setBounds(50, 390, 90, 28);

        jPanel5.setBackground(new java.awt.Color(62, 63, 64));
        jPanel5.setLayout(new java.awt.GridLayout());

        jButtonTablas2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonTablas2.setForeground(new java.awt.Color(242, 242, 242));
        jButtonTablas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonTablas2.setText("Add");
        jButtonTablas2.setContentAreaFilled(false);
        jButtonTablas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTablas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTablas2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonTablas2);

        jPanelBoards.add(jPanel5);
        jPanel5.setBounds(260, 390, 90, 28);

        jPanel6.setBackground(new java.awt.Color(62, 63, 64));
        jPanel6.setLayout(new java.awt.GridLayout());

        jButtonTablas3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonTablas3.setForeground(new java.awt.Color(242, 242, 242));
        jButtonTablas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonTablas3.setText("Add");
        jButtonTablas3.setContentAreaFilled(false);
        jButtonTablas3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTablas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTablas3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonTablas3);

        jPanelBoards.add(jPanel6);
        jPanel6.setBounds(470, 390, 90, 28);

        homeLabel.add(jPanelBoards, "card5");

        jPanelTrucks.setBackground(new java.awt.Color(242, 242, 242));
        jPanelTrucks.setMaximumSize(new java.awt.Dimension(610, 490));
        jPanelTrucks.setMinimumSize(new java.awt.Dimension(610, 490));
        jPanelTrucks.setLayout(null);
        jPanelTrucks.add(Logo4);
        Logo4.setBounds(6, 6, 100, 100);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(62, 63, 64));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Trucks");
        jPanelTrucks.add(jLabel19);
        jLabel19.setBounds(175, 30, 260, 47);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(62, 63, 64));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Date:");
        jPanelTrucks.add(jLabel20);
        jLabel20.setBounds(530, 30, 36, 19);

        jLabelReloj4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj4.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj4.setText("dd/mm/yyyy");
        jLabelReloj4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelTrucks.add(jLabelReloj4);
        jLabelReloj4.setBounds(500, 50, 100, 19);
        jPanelTrucks.add(jLabelTrucksImperial);
        jLabelTrucksImperial.setBounds(20, 130, 150, 130);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(62, 63, 64));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("<html><body><center>Antifashion Trucks<br>Imperial Domination<br>$699.00</center></body></html>");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelTrucks.add(jLabel21);
        jLabel21.setBounds(20, 290, 150, 60);

        jSpinnerTrucks1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerTrucks1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelTrucks.add(jSpinnerTrucks1);
        jSpinnerTrucks1.setBounds(70, 350, 50, 30);

        jButtonTrucks1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonTrucks1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonTrucks1.setText("Add");
        jButtonTrucks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrucks1ActionPerformed(evt);
            }
        });
        jPanelTrucks.add(jButtonTrucks1);
        jButtonTrucks1.setBounds(50, 390, 90, 29);
        jPanelTrucks.add(jLabelTrucksColor);
        jLabelTrucksColor.setBounds(240, 130, 150, 130);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(62, 63, 64));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("<html><body><center>Antifashion Trucks<br>Imperial Colors<br>$699.00</center></body></html>");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelTrucks.add(jLabel22);
        jLabel22.setBounds(240, 290, 150, 60);

        jSpinnerTrucks2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerTrucks2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelTrucks.add(jSpinnerTrucks2);
        jSpinnerTrucks2.setBounds(290, 350, 50, 30);

        jButtonTrucks2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonTrucks2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonTrucks2.setText("Add");
        jButtonTrucks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrucks2ActionPerformed(evt);
            }
        });
        jPanelTrucks.add(jButtonTrucks2);
        jButtonTrucks2.setBounds(270, 390, 90, 29);
        jPanelTrucks.add(jLabelTrucksRaw);
        jLabelTrucksRaw.setBounds(450, 130, 150, 130);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(62, 63, 64));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("<html><body><center>Raw Trucks<br>HUM<br>$735.00</center></body></html>");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelTrucks.add(jLabel23);
        jLabel23.setBounds(450, 290, 150, 60);

        jSpinnerTrucks3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerTrucks3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelTrucks.add(jSpinnerTrucks3);
        jSpinnerTrucks3.setBounds(500, 350, 50, 30);

        jButtonTrucks3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonTrucks3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonTrucks3.setText("Add");
        jButtonTrucks3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrucks3ActionPerformed(evt);
            }
        });
        jPanelTrucks.add(jButtonTrucks3);
        jButtonTrucks3.setBounds(480, 390, 90, 29);

        homeLabel.add(jPanelTrucks, "card6");

        jPanelBearings.setBackground(new java.awt.Color(242, 242, 242));
        jPanelBearings.setMaximumSize(new java.awt.Dimension(610, 490));
        jPanelBearings.setMinimumSize(new java.awt.Dimension(610, 490));
        jPanelBearings.setLayout(null);
        jPanelBearings.add(Logo5);
        Logo5.setBounds(6, 6, 100, 100);

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(62, 63, 64));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Bearings");
        jPanelBearings.add(jLabel24);
        jLabel24.setBounds(175, 30, 260, 47);

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(62, 63, 64));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Date:");
        jPanelBearings.add(jLabel25);
        jLabel25.setBounds(530, 30, 36, 19);

        jLabelReloj5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj5.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj5.setText("dd/mm/yyyy");
        jLabelReloj5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelBearings.add(jLabelReloj5);
        jLabelReloj5.setBounds(500, 50, 100, 19);
        jPanelBearings.add(jLabelAbecAntiBlack);
        jLabelAbecAntiBlack.setBounds(20, 130, 150, 130);
        jPanelBearings.add(jLabelAbecAntiGold);
        jLabelAbecAntiGold.setBounds(240, 130, 150, 130);
        jPanelBearings.add(jLabelAbecArreRed);
        jLabelAbecArreRed.setBounds(450, 130, 150, 130);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(62, 63, 64));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("<html><body><center>Antifashion<br>Baleros Abec 9<br>$399.00</center></body></html>");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelBearings.add(jLabel26);
        jLabel26.setBounds(20, 290, 150, 60);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(62, 63, 64));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("<html><body><center>Antifashion<br>Baleros Abec 7<br>$349.00</center></body></html>");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelBearings.add(jLabel27);
        jLabel27.setBounds(240, 290, 150, 60);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(62, 63, 64));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("<html><body><center>Arre<br>Baleros Abec 9<br>$290.00</center></body></html>");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelBearings.add(jLabel28);
        jLabel28.setBounds(450, 290, 150, 60);

        jSpinnerAntiAbec9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerAntiAbec9.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelBearings.add(jSpinnerAntiAbec9);
        jSpinnerAntiAbec9.setBounds(70, 350, 50, 30);

        jSpinnerBearings2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerBearings2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelBearings.add(jSpinnerBearings2);
        jSpinnerBearings2.setBounds(290, 350, 50, 30);

        jSpinnerBearings3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerBearings3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelBearings.add(jSpinnerBearings3);
        jSpinnerBearings3.setBounds(500, 350, 50, 30);

        jButtonAntiAbec9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAntiAbec9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonAntiAbec9.setText("Add");
        jButtonAntiAbec9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAntiAbec9ActionPerformed(evt);
            }
        });
        jPanelBearings.add(jButtonAntiAbec9);
        jButtonAntiAbec9.setBounds(50, 390, 90, 29);

        jButtonBearings2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBearings2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonBearings2.setText("Add");
        jButtonBearings2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBearings2ActionPerformed(evt);
            }
        });
        jPanelBearings.add(jButtonBearings2);
        jButtonBearings2.setBounds(270, 390, 90, 29);

        jButtonBearings3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBearings3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        jButtonBearings3.setText("Add");
        jButtonBearings3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBearings3ActionPerformed(evt);
            }
        });
        jPanelBearings.add(jButtonBearings3);
        jButtonBearings3.setBounds(480, 390, 90, 29);

        homeLabel.add(jPanelBearings, "card7");

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
        this.homeLabel.removeAll();
        this.homeLabel.revalidate();
        this.homeLabel.repaint();
        this.homeLabel.add(this.jPanelBoards);
    }//GEN-LAST:event_jButtonBoardActionPerformed

    private void jButtonTrucksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrucksActionPerformed
        this.homeLabel.removeAll();
        this.homeLabel.revalidate();
        this.homeLabel.repaint();
        this.homeLabel.add(this.jPanelTrucks);
    }//GEN-LAST:event_jButtonTrucksActionPerformed

    private void jButtonBearingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBearingsActionPerformed
        this.homeLabel.removeAll();
        this.homeLabel.revalidate();
        this.homeLabel.repaint();
        this.homeLabel.add(this.jPanelBearings);
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

    private void jButtonsTabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsTabla1ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerTablas1.getValue());
        this.products.add(new ClassBoard("Sacro Vladi Rivera", "Tricolor", 759.00, (Integer) this.jSpinnerTablas1.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonsTabla1ActionPerformed

    private void jButtonTablas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTablas2ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerTablas2.getValue());
        this.products.add(new ClassBoard("Sacro Christian Dimas", "Tricolor", 759.00, (Integer) this.jSpinnerTablas2.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonTablas2ActionPerformed

    private void jButtonTablas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTablas3ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerTablas3.getValue());
        this.products.add(new ClassBoard("Sacro Genaro Lujan", "Tricolor", 759.00, (Integer) this.jSpinnerTablas3.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonTablas3ActionPerformed

    private void jButtonTrucks3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrucks3ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerTrucks3.getValue());
        this.products.add(new ClassTrucks("HUM", "RAW TRUCKS", 735.00,(Integer) this.jSpinnerTrucks3.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonTrucks3ActionPerformed

    private void jButtonTrucks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrucks1ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerTrucks1.getValue());
        this.products.add(new ClassTrucks("Imperial Domination", "Antifashion", 699.00,(Integer) this.jSpinnerTrucks1.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonTrucks1ActionPerformed

    private void jButtonTrucks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrucks2ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerTrucks2.getValue());
        this.products.add(new ClassTrucks("Imperial Colors", "Antifashion", 699.00,(Integer) this.jSpinnerTrucks2.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonTrucks2ActionPerformed

    private void jButtonAntiAbec9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAntiAbec9ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerAntiAbec9.getValue());
        this.products.add(new ClassBearings("DARK", 9, "Antifashion", 399.00, (Integer) this.jSpinnerAntiAbec9.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonAntiAbec9ActionPerformed

    private void jButtonBearings2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBearings2ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerBearings2.getValue());
        this.products.add(new ClassBearings("GOLD", 7, "Antifashion", 349.00, (Integer) this.jSpinnerBearings2.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonBearings2ActionPerformed

    private void jButtonBearings3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBearings3ActionPerformed
        this.cont.setCont((Integer) this.jSpinnerBearings3.getValue());
        this.products.add(new ClassBearings("RED", 9, "Arre", 290.00, (Integer) this.jSpinnerBearings3.getValue()));
        showCounter();
        modeloLista.addElement(products.get(aux).toString());
        this.aux++;
    }//GEN-LAST:event_jButtonBearings3ActionPerformed
    
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
        this.Logo1.setIcon(iconoLogo);
        this.Logo2.setIcon(iconoLogo);
        this.Logo3.setIcon(iconoLogo);
        this.Logo4.setIcon(iconoLogo);
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
        
        ImageIcon sacro = new ImageIcon(getClass().getResource("/img/skateblacksacro.jpg"));
        Image sacroEscalado = sacro.getImage().getScaledInstance(this.jLabelSkateSacro.getWidth(), this.jLabelSkateSacro.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoSacro= new ImageIcon(sacroEscalado);
        this.jLabelSkateSacro.setIcon(iconoSacro);
        
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
        
        ImageIcon imperial = new ImageIcon(getClass().getResource("/img/trucksimperial.jpg"));
        Image imperialEscalado = imperial.getImage().getScaledInstance(this.jLabelTrucksImperial.getWidth(), this.jLabelTrucksImperial.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoimperial = new ImageIcon(imperialEscalado);
        this.jLabelTrucksImperial.setIcon(iconoimperial);
        
        ImageIcon colors = new ImageIcon(getClass().getResource("/img/trucksimperialcolor.jpg"));
        Image colorsEscalado = colors.getImage().getScaledInstance(this.jLabelTrucksColor.getWidth(), this.jLabelTrucksColor.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconocolors = new ImageIcon(colorsEscalado);
        this.jLabelTrucksColor.setIcon(iconocolors);
        
        ImageIcon raw = new ImageIcon(getClass().getResource("/img/trucksrawhum.jpg"));
        Image rawEscalado = raw.getImage().getScaledInstance(this.jLabelTrucksRaw.getWidth(), this.jLabelTrucksRaw.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoraw = new ImageIcon(rawEscalado);
        this.jLabelTrucksRaw.setIcon(iconoraw);
        
        ImageIcon antBec9 = new ImageIcon(getClass().getResource("/img/abec7antibalck.jpg"));
        Image antBec9Escalado = antBec9.getImage().getScaledInstance(this.jLabelAbecAntiBlack.getWidth(), this.jLabelAbecAntiBlack.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoantBec9 = new ImageIcon(antBec9Escalado);
        this.jLabelAbecAntiBlack.setIcon(iconoantBec9);
        
        ImageIcon antBec7 = new ImageIcon(getClass().getResource("/img/abec9antigold.jpg"));
        Image antBec7Escalado = antBec7.getImage().getScaledInstance(this.jLabelAbecAntiGold.getWidth(), this.jLabelAbecAntiGold.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoantBec7 = new ImageIcon(antBec7Escalado);
        this.jLabelAbecAntiGold.setIcon(iconoantBec7);
        
        ImageIcon arrebec9 = new ImageIcon(getClass().getResource("/img/abec9arrered.jpg"));
        Image arrebec9Escalado = arrebec9.getImage().getScaledInstance(this.jLabelAbecArreRed.getWidth(), this.jLabelAbecArreRed.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoarrebec9 = new ImageIcon(arrebec9Escalado);
        this.jLabelAbecArreRed.setIcon(iconoarrebec9);
    }
    
    public void showDate(){
        Reloj r = new Reloj();
        this.jLabelReloj.setText(r.hfActual());
        this.jLabelReloj1.setText(r.hfActual());
        this.jLabelReloj2.setText(r.hfActual());
        this.jLabelReloj3.setText(r.hfActual());
        this.jLabelReloj4.setText(r.hfActual());
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
    private javax.swing.JLabel Logo3;
    private javax.swing.JLabel Logo4;
    private javax.swing.JLabel Logo5;
    private javax.swing.JPanel asideLabel;
    private javax.swing.JPanel homeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAntiAbec9;
    private javax.swing.JButton jButtonBearings;
    private javax.swing.JButton jButtonBearings2;
    private javax.swing.JButton jButtonBearings3;
    private javax.swing.JButton jButtonBoard;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonRuedas1;
    private javax.swing.JButton jButtonRuedas2;
    private javax.swing.JButton jButtonRuedas3;
    private javax.swing.JButton jButtonShoppingCart;
    private javax.swing.JButton jButtonTablas2;
    private javax.swing.JButton jButtonTablas3;
    private javax.swing.JButton jButtonTrucks;
    private javax.swing.JButton jButtonTrucks1;
    private javax.swing.JButton jButtonTrucks2;
    private javax.swing.JButton jButtonTrucks3;
    private javax.swing.JButton jButtonWheel;
    private javax.swing.JButton jButtonsTabla1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAbecAntiBlack;
    private javax.swing.JLabel jLabelAbecAntiGold;
    private javax.swing.JLabel jLabelAbecArreRed;
    private javax.swing.JLabel jLabelContadorCart;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JLabel jLabelRataCrema;
    private javax.swing.JLabel jLabelRataPelos;
    private javax.swing.JLabel jLabelRataVomito;
    private javax.swing.JLabel jLabelReloj;
    private javax.swing.JLabel jLabelReloj1;
    private javax.swing.JLabel jLabelReloj2;
    private javax.swing.JLabel jLabelReloj3;
    private javax.swing.JLabel jLabelReloj4;
    private javax.swing.JLabel jLabelReloj5;
    private javax.swing.JLabel jLabelSkateDimas;
    private javax.swing.JLabel jLabelSkateSacro;
    private javax.swing.JLabel jLabelSkateUjan;
    private javax.swing.JLabel jLabelTrucksColor;
    private javax.swing.JLabel jLabelTrucksImperial;
    private javax.swing.JLabel jLabelTrucksRaw;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBearings;
    private javax.swing.JPanel jPanelBoards;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelShoppingCart;
    private javax.swing.JPanel jPanelTrucks;
    private javax.swing.JPanel jPanelWheels;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAntiAbec9;
    private javax.swing.JSpinner jSpinnerBearings2;
    private javax.swing.JSpinner jSpinnerBearings3;
    private javax.swing.JSpinner jSpinnerRuedas1;
    private javax.swing.JSpinner jSpinnerRuedas2;
    private javax.swing.JSpinner jSpinnerRuedas3;
    private javax.swing.JSpinner jSpinnerTablas1;
    private javax.swing.JSpinner jSpinnerTablas2;
    private javax.swing.JSpinner jSpinnerTablas3;
    private javax.swing.JSpinner jSpinnerTrucks1;
    private javax.swing.JSpinner jSpinnerTrucks2;
    private javax.swing.JSpinner jSpinnerTrucks3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
