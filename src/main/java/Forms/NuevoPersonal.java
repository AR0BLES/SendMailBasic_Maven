/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Clases.Usuario;
import Clases.cUsuarioCrud;
import Clases.conexion;
import java.sql.Connection;
import Clases.Personal;
import Clases.cPersonalCrud;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

/**
 *
 * @author HP
 */
public class NuevoPersonal extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    String Tipo="";
    String IdPersonal="";
    public NuevoPersonal() {
        initComponents();
    }
    void Tipo(String Tipo2){
       Tipo=Tipo2; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBlanco1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        PanelNuevoPersonal = new javax.swing.JPanel();
        PanelLetrero = new javax.swing.JPanel();
        Letrero1 = new javax.swing.JLabel();
        PanelPersonales = new javax.swing.JPanel();
        LabelDatosPersonales = new javax.swing.JLabel();
        LabelNombres = new javax.swing.JLabel();
        LabelApellidos = new javax.swing.JLabel();
        LabelDNI = new javax.swing.JLabel();
        LabelNacimiento = new javax.swing.JLabel();
        LabelHijos = new javax.swing.JLabel();
        LabelBancaria = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();
        jtextNombres = new javax.swing.JTextField();
        jtextDNI = new javax.swing.JTextField();
        jtextApellidos = new javax.swing.JTextField();
        jtextHijos = new javax.swing.JTextField();
        jtextBancaria = new javax.swing.JTextField();
        jtextCorreo = new javax.swing.JTextField();
        jdateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        PanelBlanco2 = new javax.swing.JPanel();
        PanelAdministrativos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jpClave = new javax.swing.JPasswordField();
        jcDeduccion = new javax.swing.JComboBox<>();
        jcCategoria = new javax.swing.JComboBox<>();
        jcEstado = new javax.swing.JComboBox<>();
        jcPuesto = new javax.swing.JComboBox<>();
        jcNivel = new javax.swing.JComboBox<>();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        LabelFondo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBlanco1.setBackground(new java.awt.Color(255, 255, 255));
        PanelBlanco1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("CERRAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelBlanco1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 150, 30));

        getContentPane().add(PanelBlanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));

        PanelNuevoPersonal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLetrero.setBackground(new java.awt.Color(0, 2, 17));

        Letrero1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        Letrero1.setForeground(new java.awt.Color(255, 255, 255));
        Letrero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Letrero1.setText("NUEVO PERSONAL");

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

        PanelNuevoPersonal.add(PanelLetrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 80));

        LabelDatosPersonales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelDatosPersonales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDatosPersonales.setText("DATOS PERSONALES");

        LabelNombres.setText("Nombres");

        LabelApellidos.setText("Apellidos");

        LabelDNI.setText("DNI");

        LabelNacimiento.setText("Fecha de Nacimiento");

        LabelHijos.setText("N� de Hijos");

        LabelBancaria.setText("Cuenta Bancaria");

        LabelCorreo.setText("Correo Electr�nico");

        jtextNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextNombresActionPerformed(evt);
            }
        });

        jtextHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextHijosActionPerformed(evt);
            }
        });

        jtextBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextBancariaActionPerformed(evt);
            }
        });

        jtextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPersonalesLayout = new javax.swing.GroupLayout(PanelPersonales);
        PanelPersonales.setLayout(PanelPersonalesLayout);
        PanelPersonalesLayout.setHorizontalGroup(
            PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelDatosPersonales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelBancaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelHijos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtextNombres)
                    .addComponent(jtextApellidos)
                    .addComponent(jtextDNI)
                    .addComponent(jtextCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jtextHijos, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jtextBancaria, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jdateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        PanelPersonalesLayout.setVerticalGroup(
            PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPersonalesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LabelDatosPersonales)
                .addGap(62, 62, 62)
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombres)
                    .addComponent(jtextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelApellidos)
                    .addComponent(jtextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDNI)
                    .addComponent(jtextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNacimiento)
                    .addComponent(jdateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHijos)
                    .addComponent(jtextHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBancaria)
                    .addComponent(jtextBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCorreo)
                    .addComponent(jtextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        PanelNuevoPersonal.add(PanelPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 360, 430));

        PanelBlanco2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelBlanco2Layout = new javax.swing.GroupLayout(PanelBlanco2);
        PanelBlanco2.setLayout(PanelBlanco2Layout);
        PanelBlanco2Layout.setHorizontalGroup(
            PanelBlanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        PanelBlanco2Layout.setVerticalGroup(
            PanelBlanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        PanelNuevoPersonal.add(PanelBlanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 40, 150));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DATOS ADMINISTRATIVOS");

        jLabel1.setText("C�digo");

        jLabel2.setText("Contrase�a");

        jLabel3.setText("Categor�a");

        jLabel4.setText("Deducci�n");

        jLabel5.setText("Estado");

        jLabel6.setText("Puesto");

        jLabel8.setText("Nivel");

        jpClave.setText("jPasswordField1");

        jcDeduccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SNP", "SPP" }));

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4ta", "5ta" }));

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        jcPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Administrador" }));
        jcPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPuestoActionPerformed(evt);
            }
        });

        jcNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicial", "Primaria", "Secundaria" }));

        javax.swing.GroupLayout PanelAdministrativosLayout = new javax.swing.GroupLayout(PanelAdministrativos);
        PanelAdministrativos.setLayout(PanelAdministrativosLayout);
        PanelAdministrativosLayout.setHorizontalGroup(
            PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpClave))
                    .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcDeduccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelAdministrativosLayout.setVerticalGroup(
            PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdministrativosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(57, 57, 57)
                .addGroup(PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAdministrativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        PanelNuevoPersonal.add(PanelAdministrativos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 360, 430));

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        PanelNuevoPersonal.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 260, 40));

        jbLimpiar.setText("LIMPIAR TODO");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        PanelNuevoPersonal.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 260, 40));
        PanelNuevoPersonal.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ColegioCompleto.jpg"))); // NOI18N
        PanelNuevoPersonal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PanelNuevoPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextCorreoActionPerformed

    private void jtextHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextHijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextHijosActionPerformed

    private void jtextBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextBancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextBancariaActionPerformed

    private void jtextNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextNombresActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
       jtextNombres.setText("");
       jtextApellidos.setText("");
       jtextDNI.setText("");
       jtextHijos.setText("");
       jtextBancaria.setText("");
       jtextCorreo.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed
   void ListarData(String Nombre,String Apellido,String DNI,String Hijos,String Bancaria,String Correo,String IdPersonal2){
        jtextNombres.setText(Nombre);
       jtextApellidos.setText(Apellido);
       jtextDNI.setText(DNI);
       jtextHijos.setText(Hijos);
       jtextBancaria.setText(Bancaria);
       jtextCorreo.setText(Correo);
       IdPersonal=IdPersonal2;
       jbGuardar.setText("Editar");
    }
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int IdUsuario=0;
        conexion con= new conexion();
         Connection conectar=con.establecerConexion();
         //Usuario variables
         String Codigo =jtCodigo.getText();
        String Clave =String.valueOf(jpClave.getPassword());
        //Personal Variables
          String Nombres =jtextNombres.getText();
      String Apellidos =jtextApellidos.getText();
      String DNI =jtextDNI.getText();
      SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String FechaNacimiento = dcn.format(jdateFechaNacimiento.getDate() );
   //   String FechaNacimiento =String.valueOf(jdateFechaNacimiento.getdate());
      String NroHijos =jtextHijos.getText();
      String CuentaBancaria =jtextBancaria.getText();
      String Correo =jtextCorreo.getText();
      String Deduccion =String.valueOf(jcDeduccion.getSelectedItem());
       String Categoria =String.valueOf(jcCategoria.getSelectedItem());
      String Estado =String.valueOf(jcEstado.getSelectedItem());
      String Puesto =String.valueOf(jcPuesto.getSelectedItem());
      String Nivel =String.valueOf(jcNivel.getSelectedItem());

      //Metodos
       JOptionPane.showMessageDialog(null,Tipo); 
       if (jbGuardar.getText()=="Editar"){
            //Conexiones
              Personal personal=new Personal(Nombres,Apellidos,DNI,FechaNacimiento,
                    NroHijos,CuentaBancaria,Correo,Deduccion,
                    Categoria,Estado,Puesto,Nivel,Integer.valueOf(IdPersonal));
       cPersonalCrud p=new cPersonalCrud();
         p.actualizarPersonal(conectar, personal);
        JOptionPane.showMessageDialog(null,"Se actualizo la persona correctamente"); 
       }else{
           
                 Usuario usuario=new Usuario(Codigo,Clave);
       cUsuarioCrud val= new cUsuarioCrud();
       val.insertarUsuario(conectar, usuario);
      IdUsuario=val.ObtenerIdUsuario(conectar, Codigo);
      
        Personal personal=new Personal(Nombres,Apellidos,DNI,FechaNacimiento,NroHijos,CuentaBancaria,Correo,Deduccion,Categoria,Estado,Puesto,Nivel,IdUsuario);
       cPersonalCrud p=new cPersonalCrud();
         p.insertarPersonal(conectar, personal);
        JOptionPane.showMessageDialog(null,"Se registro la persona correctamenta"); 
     

     
       }
             
           Principal principal =new Principal();
       principal.setVisible(true);
       principal.ListarDatos();
       
       // FrmMenu menu =new FrmMenu();
     
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPuestoActionPerformed
        if (String.valueOf(jcPuesto.getSelectedItem())=="Administrador"){
        jcNivel.setEnabled(false);
        }else{
           jcNivel.setEnabled(true); 
        }
        
    }//GEN-LAST:event_jcPuestoActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelApellidos;
    private javax.swing.JLabel LabelBancaria;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDNI;
    private javax.swing.JLabel LabelDatosPersonales;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelHijos;
    private javax.swing.JLabel LabelNacimiento;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel Letrero1;
    private javax.swing.JPanel PanelAdministrativos;
    private javax.swing.JPanel PanelBlanco1;
    private javax.swing.JPanel PanelBlanco2;
    private javax.swing.JPanel PanelLetrero;
    private javax.swing.JPanel PanelNuevoPersonal;
    private javax.swing.JPanel PanelPersonales;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JComboBox<String> jcDeduccion;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JComboBox<String> jcNivel;
    private javax.swing.JComboBox<String> jcPuesto;
    private com.toedter.calendar.JDateChooser jdateFechaNacimiento;
    private javax.swing.JPasswordField jpClave;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtextApellidos;
    private javax.swing.JTextField jtextBancaria;
    private javax.swing.JTextField jtextCorreo;
    private javax.swing.JTextField jtextDNI;
    private javax.swing.JTextField jtextHijos;
    private javax.swing.JTextField jtextNombres;
    // End of variables declaration//GEN-END:variables
}
