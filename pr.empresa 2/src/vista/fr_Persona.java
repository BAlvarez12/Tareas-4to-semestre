/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import modelo.Cliente;
//import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;




/**
 *
 * @author WILMER
 */
public class fr_Persona extends javax.swing.JFrame {
Cliente cliente;
    //DefaultTableModel tblModelo;

    /**
     * Creates new form fr_Personas
     */
   public fr_Persona() {
        initComponents();
        cliente = new Cliente();
        this.tbl_clientes.setModel(cliente.leer());
   }
        /*tblModelo = new DefaultTableModel();
        String encabezado [] = {"nit","nombres","apellidos","direccion","telefono","FechaNacimeinto"};
            tblModelo.setColumnIdentifiers(encabezado);
            tbl_clientes.setModel(tblModelo);
            
    }*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_principal = new javax.swing.JTabbedPane();
        panel_clientes = new javax.swing.JPanel();
        lbl_nit = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        lbl_apellidos = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefon = new javax.swing.JTextField();
        lbl_nacimiento = new javax.swing.JLabel();
        txt_nacimiento = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jspanel_tabla = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab_principal.setBackground(new java.awt.Color(0, 0, 0));
        tab_principal.setForeground(new java.awt.Color(255, 255, 255));

        panel_clientes.setBackground(new java.awt.Color(204, 204, 255));

        lbl_nit.setText("Nit:");

        txt_nit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nombres.setText("Nombres:");

        txt_nombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_apellidos.setText("Apellidos:");

        txt_apellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_direccion.setText("Direccion:");

        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_telefono.setText("Numero de telefono:");

        txt_telefon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nacimiento.setText("Fecha de nacimiento:");

        txt_nacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_guardar.setBackground(new java.awt.Color(0, 0, 255));
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        tbl_clientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_clientes.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        tbl_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_clientesKeyReleased(evt);
            }
        });
        jspanel_tabla.setViewportView(tbl_clientes);

        jLabel1.setText("id");

        lbl_id.setText("0");

        actualizar.setBackground(new java.awt.Color(51, 204, 255));
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_clientesLayout = new javax.swing.GroupLayout(panel_clientes);
        panel_clientes.setLayout(panel_clientesLayout);
        panel_clientesLayout.setHorizontalGroup(
            panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientesLayout.createSequentialGroup()
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_nombres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_nacimiento)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nit)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_id)
                                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_clientesLayout.createSequentialGroup()
                                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbl_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panel_clientesLayout.createSequentialGroup()
                                        .addComponent(lbl_telefono)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_eliminar)
                                    .addComponent(actualizar)
                                    .addComponent(btn_guardar)))))
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jspanel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_clientesLayout.setVerticalGroup(
            panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientesLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_id))
                .addGap(18, 18, 18)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_apellidos)
                    .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_guardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_direccion)
                    .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(actualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nacimiento)
                    .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jspanel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        tab_principal.addTab("Clientes", panel_clientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tab_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente(0,txt_nit.getText(),txt_nombres.getText(),txt_apellidos.getText(),txt_direccion.getText()
            ,txt_telefon.getText(),txt_nacimiento.getText());
        cliente.crear();
        this.tbl_clientes.setModel(cliente.leer());

        /* cliente.setNit(txt_nit.getText());
        cliente.setNombres(txt_nombres.getText());
        cliente.setApellidos(txt_apellidos.getText());
        cliente.setDireccion(txt_direccion.getText());
        cliente.setTelefono(txt_telefon.getText());
        cliente.setFecha_nacimiento(txt_nacimiento.getText());

        cliente.crear();
        tblModelo.addRow(cliente.crear());
        tbl_clientes.setModel(tblModelo);*/

    }//GEN-LAST:event_btn_guardarActionPerformed

    public void selec_datos(){
        int fila = tbl_clientes.getSelectedRow();
        lbl_id.setText(tbl_clientes.getValueAt(fila, 0).toString());
        txt_nit.setText(tbl_clientes.getValueAt(fila, 1).toString());
        txt_nombres.setText(tbl_clientes.getValueAt(fila, 2).toString());
        txt_apellidos.setText(tbl_clientes.getValueAt(fila, 3).toString());
        txt_direccion.setText(tbl_clientes.getValueAt(fila, 4).toString());
        txt_telefon.setText(tbl_clientes.getValueAt(fila, 5).toString());
        txt_nacimiento.setText(tbl_clientes.getValueAt(fila, 6).toString());
    }
    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        // TODO add your handling code here:
        selec_datos();
    }//GEN-LAST:event_tbl_clientesMouseClicked

    private void tbl_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_clientesKeyReleased
        // TODO add your handling code here:
        selec_datos();
    }//GEN-LAST:event_tbl_clientesKeyReleased

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente(Integer.parseInt(lbl_id.getText()),txt_nit.getText(),txt_nombres.getText(),txt_apellidos.getText(),txt_direccion.getText(),txt_telefon.getText(),txt_nacimiento.getText());
        cliente.actualizar();
        this.tbl_clientes.setModel(cliente.leer());
    }//GEN-LAST:event_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente();
        cliente.setId(Integer.parseInt(lbl_id.getText()));
        cliente.eliminar();
        this.tbl_clientes.setModel(cliente.leer());
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(fr_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new fr_Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jspanel_tabla;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nacimiento;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JPanel panel_clientes;
    private javax.swing.JTabbedPane tab_principal;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefon;
    // End of variables declaration//GEN-END:variables
}
