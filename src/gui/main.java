
package gui;

import clases.Reloj;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class main extends javax.swing.JFrame {
    public int cont;
    
    public main() {
        initComponents();
        resIMG();
        setLocationRelativeTo(null);
        showDate();
        imgMenu();
        setLabelShopping();
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
        Logo = new javax.swing.JLabel();
        jLabelReloj = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonBoard = new javax.swing.JButton();
        jButtonWheel = new javax.swing.JButton();
        jButtonTrucks = new javax.swing.JButton();
        jButtonBearings = new javax.swing.JButton();

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
        asideLabel.add(jLabelContadorCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, 20));

        getContentPane().add(asideLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 490));

        homeLabel.setBackground(new java.awt.Color(242, 242, 242));
        homeLabel.setLayout(null);
        homeLabel.add(Logo);
        Logo.setBounds(6, 6, 100, 100);

        jLabelReloj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelReloj.setForeground(new java.awt.Color(62, 63, 64));
        jLabelReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReloj.setText("dd/mm/yyyy");
        jLabelReloj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeLabel.add(jLabelReloj);
        jLabelReloj.setBounds(500, 50, 100, 19);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 63, 64));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date:");
        homeLabel.add(jLabel3);
        jLabel3.setBounds(530, 30, 36, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 63, 64));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¡Welcome!");
        homeLabel.add(jLabel4);
        jLabel4.setBounds(175, 30, 260, 47);

        jButtonBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBoard.setDefaultCapable(false);
        jButtonBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBoardActionPerformed(evt);
            }
        });
        homeLabel.add(jButtonBoard);
        jButtonBoard.setBounds(350, 140, 200, 140);

        jButtonWheel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonWheel.setDefaultCapable(false);
        jButtonWheel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWheelActionPerformed(evt);
            }
        });
        homeLabel.add(jButtonWheel);
        jButtonWheel.setBounds(60, 140, 200, 140);

        jButtonTrucks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTrucks.setDefaultCapable(false);
        jButtonTrucks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrucksActionPerformed(evt);
            }
        });
        homeLabel.add(jButtonTrucks);
        jButtonTrucks.setBounds(60, 310, 200, 140);

        jButtonBearings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBearings.setDefaultCapable(false);
        jButtonBearings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBearingsActionPerformed(evt);
            }
        });
        homeLabel.add(jButtonBearings);
        jButtonBearings.setBounds(350, 310, 200, 140);

        getContentPane().add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 610, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShoppingCartActionPerformed
        PanelShoppingCart pshopping = new PanelShoppingCart();
        pshopping.setSize(610,490);
        pshopping.setLocation(0, 0);
        homeLabel.removeAll();
        homeLabel.revalidate();
        homeLabel.repaint();
        homeLabel.add(pshopping);
    }//GEN-LAST:event_jButtonShoppingCartActionPerformed

    private void jButtonWheelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWheelActionPerformed
        PanelWheels pwheels = new PanelWheels();
        pwheels.setSize(610,490);
        pwheels.setLocation(0, 0);
        homeLabel.removeAll();
        homeLabel.revalidate();
        homeLabel.repaint();
        homeLabel.add(pwheels);
    }//GEN-LAST:event_jButtonWheelActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        PanelMenu pmenu = new PanelMenu();
        pmenu.setSize(610,490);
        setLocation((screenSize.width/2)-(getWidth()/2), (screenSize.height/2)-(this.getHeight()/2)-15);
        homeLabel.removeAll();
        homeLabel.revalidate();
        homeLabel.repaint();
        homeLabel.add(pmenu);
        
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBoardActionPerformed
        PanelBoard pboard = new PanelBoard();
        pboard.setSize(610,490);
        pboard.setLocation(0, 0);
        homeLabel.removeAll();
        homeLabel.revalidate();
        homeLabel.repaint();
        homeLabel.add(pboard);
    }//GEN-LAST:event_jButtonBoardActionPerformed

    private void jButtonTrucksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrucksActionPerformed
        PanelTrucks ptrucks = new PanelTrucks();
        ptrucks.setSize(610,490);
        ptrucks.setLocation(0, 0);
        homeLabel.removeAll();
        homeLabel.revalidate();
        homeLabel.repaint();
        homeLabel.add(ptrucks);
    }//GEN-LAST:event_jButtonTrucksActionPerformed

    private void jButtonBearingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBearingsActionPerformed
        PanelBearings pbearings = new PanelBearings();
        pbearings.setSize(610,490);
        pbearings.setLocation(0, 0);
        homeLabel.removeAll();
        homeLabel.revalidate();
        homeLabel.repaint();
        homeLabel.add(pbearings);
    }//GEN-LAST:event_jButtonBearingsActionPerformed
    
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
    }
    
    public void showDate(){
        Reloj r = new Reloj();
        this.jLabelReloj.setText(r.hfActual());
    }
    
    public void setLabelShopping(){
        this.jLabelContadorCart.setText(String.valueOf(this.cont));
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
    private javax.swing.JPanel asideLabel;
    private javax.swing.JPanel homeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBearings;
    private javax.swing.JButton jButtonBoard;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonShoppingCart;
    private javax.swing.JButton jButtonTrucks;
    private javax.swing.JButton jButtonWheel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelContadorCart;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JLabel jLabelReloj;
    // End of variables declaration//GEN-END:variables
}
