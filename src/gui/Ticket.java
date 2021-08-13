package gui;

import clases.ClassProductos;
import clases.Reloj;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Ticket extends javax.swing.JFrame implements Printable {
    String name;
    ArrayList <ClassProductos> products = new ArrayList();
    public static double total, IVA, ToPay;
    
    public Ticket() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        resIMG();
        showData();
    }
    
    public void showData(){
        Reloj rj = new Reloj();
        this.jLabelFecha.setText(rj.hfActual());
        this.jLabelHora.setText(rj.horaActual());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelToPay = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelIVA = new javax.swing.JLabel();
        jLabelQr = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Hour:");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 10, 100, 100));

        jLabelHora.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(0, 0, 0));
        jLabelHora.setText("hh:mm:ss");
        jPanel1.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Date:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabelFecha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFecha.setText("dd/mm/yyy");
        jPanel1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Hour:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Custumer Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabelName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName.setText("Ibrahim Ramirez");
        jPanel1.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("**************************************************");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CASH RECEIPT");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 140, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("**************************************************");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total: $");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        jLabelToPay.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelToPay.setForeground(new java.awt.Color(0, 0, 0));
        jLabelToPay.setText("0.00");
        jPanel1.add(jLabelToPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("IVA: $");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 40, -1));

        jLabelTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotal.setText("0.00");
        jPanel1.add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Total To Pay: $");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jLabelIVA.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelIVA.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIVA.setText("0.00");
        jPanel1.add(jLabelIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));
        jPanel1.add(jLabelQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 510, 150, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 30, 30));

        jButtonPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printing.png"))); // NOI18N
        jButtonPrint.setContentAreaFilled(false);
        jButtonPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, 30, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setFocusable(false);
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            job.printDialog();
            job.print();
        }catch (PrinterException ex) {
            
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed
    
    public void resIMG(){
        ImageIcon logo = new ImageIcon(getClass().getResource("/img/logoTicket.png"));
        Image logoEscalado = logo.getImage().getScaledInstance(this.jLabelLogo.getWidth(), this.jLabelLogo.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoLogo = new ImageIcon(logoEscalado);
        this.jLabelLogo.setIcon(iconoLogo);
        
        ImageIcon qr = new ImageIcon(getClass().getResource("/img/QrCode.jpeg"));
        Image qrEscalado = qr.getImage().getScaledInstance(this.jLabelQr.getWidth(), this.jLabelQr.getHeight(),
        Image.SCALE_SMOOTH);
        Icon iconoQr = new ImageIcon(qrEscalado);
        this.jLabelQr.setIcon(iconoQr);
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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    public static javax.swing.JLabel jLabelIVA;
    private javax.swing.JLabel jLabelLogo;
    public static javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelQr;
    public static javax.swing.JLabel jLabelToPay;
    public static javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex > 0){
            return NO_SUCH_PAGE;
        }
        
        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        jPanel1.printAll(graphics);
        return PAGE_EXISTS;
    }
}
