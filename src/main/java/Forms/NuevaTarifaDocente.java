/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Clases.TarifaDoc;
import Clases.cTarifaDocCrud;
import Clases.conexion;
import java.sql.Connection;

/**
 *
 * @author Rosario
 */
public class NuevaTarifaDocente extends javax.swing.JFrame {

    /**
     * Creates new form NuevaTarifaDocente
     */
    public NuevaTarifaDocente() {
        initComponents();
    }
    String CodigoDocente;
    String CodigoTarifa;
    String Categoria;
    int IdPersonal;
    String IdTarifa;
    String IdTarifaDoc;
    
    conexion con= new conexion();
    Connection conectar=con.establecerConexion();
     void ListarTarifaDetalle(String IdTarifa2,String Tarifa){
       IdTarifa=IdTarifa2;
       CodigoTarifa=Tarifa;
       jtextCodigoTarifa.setText(CodigoTarifa);
     }
    
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBlanco = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        PanelNuevoHorario = new javax.swing.JPanel();
        PanelLetrero = new javax.swing.JPanel();
        Letrero1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtextCodigoDocente = new javax.swing.JTextField();
        jtextCodigoTarifa = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        PanelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("CERRAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelBlanco.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 150, 30));

        PanelNuevoHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLetrero.setBackground(new java.awt.Color(0, 2, 17));

        Letrero1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        Letrero1.setForeground(new java.awt.Color(255, 255, 255));
        Letrero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Letrero1.setText("NUEVA TARIFA DOCENTE");

        javax.swing.GroupLayout PanelLetreroLayout = new javax.swing.GroupLayout(PanelLetrero);
        PanelLetrero.setLayout(PanelLetreroLayout);
        PanelLetreroLayout.setHorizontalGroup(
            PanelLetreroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Letrero1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        PanelLetreroLayout.setVerticalGroup(
            PanelLetreroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLetreroLayout.createSequentialGroup()
                .addComponent(Letrero1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelNuevoHorario.add(PanelLetrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 80));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código de docente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, 20));

        jLabel3.setText("Código de tarifa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 160, 20));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\apsenior\\Downloads\\ProyectoCasiCasiFinal\\SendMailBasic_Maven-main\\src\\main\\java\\Imagenes\\LogoPrincipalColegio.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 270, 250));
        jPanel1.add(jtextCodigoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 180, 50));

        jtextCodigoTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextCodigoTarifaActionPerformed(evt);
            }
        });
        jPanel1.add(jtextCodigoTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 180, 50));

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 260, 40));

        jbLimpiar.setText("LIMPIAR");
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 260, 40));

        PanelNuevoHorario.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 740, 440));

        LabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\apsenior\\Downloads\\ProyectoCasiCasiFinal\\SendMailBasic_Maven-main\\src\\main\\java\\Imagenes\\ColegioCompleto.jpg")); // NOI18N
        PanelNuevoHorario.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelNuevoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(PanelNuevoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
          CodigoDocente=jtextCodigoDocente.getText();
          CodigoTarifa=jtextCodigoTarifa.getText();
               cTarifaDocCrud tdc =new cTarifaDocCrud();
         IdPersonal=tdc.ObtenerIdPersonal(conectar, CodigoDocente);
         TarifaDoc tarifadoc =new TarifaDoc("",Integer.parseInt(IdTarifa),IdPersonal,"","","","","");
  
         tdc.insertarTarifaDoc(conectar, tarifadoc);
          Principal p =new Principal();
           NuevaTarifaDocente nt=new NuevaTarifaDocente();
           nt.setVisible(false);
           p.ListarDatosTarifa();
           p.ListarDatosTarifaDoc();
           p.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtextCodigoTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextCodigoTarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextCodigoTarifaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(NuevaTarifaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaTarifaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaTarifaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaTarifaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaTarifaDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel Letrero1;
    private javax.swing.JPanel PanelBlanco;
    private javax.swing.JPanel PanelLetrero;
    private javax.swing.JPanel PanelNuevoHorario;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JTextField jtextCodigoDocente;
    private javax.swing.JTextField jtextCodigoTarifa;
    // End of variables declaration//GEN-END:variables
}
