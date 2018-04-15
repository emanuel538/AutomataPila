package Vista;

import Control.ArchivoC;
import Control.Utilidades; // Importa Utilidades Del Controlador

public class General_Window extends javax.swing.JFrame {
    private ArchivoC archivo;
    
    public General_Window() {
        initComponents();
        
        
    }

    //Generar Codigo
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        txtGeneral = new java.awt.TextArea();
        txtpath = new javax.swing.JTextField();
        btnVerMatriz = new javax.swing.JButton();
        btnInteractivo = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 90, 40));

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 90, 40));
        getContentPane().add(txtGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 450, 280));

        txtpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpathActionPerformed(evt);
            }
        });
        getContentPane().add(txtpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 340, 40));

        btnVerMatriz.setText("Ver Matriz");
        btnVerMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 140, 40));

        btnInteractivo.setText("Interactivo");
        btnInteractivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteractivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInteractivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 140, 40));

        jToggleButton1.setText("Generar Ilera");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 140, 40));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Blue.png"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        Utilidades UT = new Utilidades(); //Instancia De La Clase Utilidades
        archivo = new ArchivoC(UT.cargar_Archivo(txtpath, txtGeneral)); // Ejecuat El Metodo Para Cargar El Archivo
        
    }//GEN-LAST:event_btnCargarActionPerformed

    private void txtpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpathActionPerformed

    private void btnVerMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMatrizActionPerformed
        Ver_Matriz_Window mg = new Ver_Matriz_Window(archivo,this); // Declarar Matriz Generada
        mg.setVisible(true);  // Mostrar Matriz Generada
        dispose();
    }//GEN-LAST:event_btnVerMatrizActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Pila_Window p = new Pila_Window(archivo.getExpresion().getOperacion());
        p.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnInteractivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteractivoActionPerformed
       Interactivo_Window inte = new Interactivo_Window();
       inte.setVisible(true);
    }//GEN-LAST:event_btnInteractivoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnInteractivo;
    private javax.swing.JButton btnVerMatriz;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_Fondo;
    private java.awt.TextArea txtGeneral;
    private javax.swing.JTextField txtpath;
    // End of variables declaration//GEN-END:variables
}
