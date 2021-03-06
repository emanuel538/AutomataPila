/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ArchivoC;
import Control.Utilidades;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maraton
 */
public class Ver_Matriz_Window extends javax.swing.JFrame {
    private ArchivoC archivo;
    private DefaultTableModel modelo;
    public Ver_Matriz_Window(ArchivoC c,JFrame t) {
        initComponents();
        this.archivo = c;
        generar();
       
    }
    void generar(){
        Utilidades u = new Utilidades();
        u.generarCombobox(jComboBox1,archivo);
        
    }
    public void crearTabla(String simbolos){
        modelo = new DefaultTableModel();
        for(int i = 0; i < simbolos.length(); i++){
            modelo.addColumn(simbolos.charAt(i));
        }
        this.jTable1.setModel(modelo);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 190, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 320));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Blue.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        crearTabla(archivo.getExpresion().getSimboloEntrada());
        if(evt.getStateChange() == ItemEvent.SELECTED){
            String seleccionado = jComboBox1.getSelectedItem().toString();
            Utilidades u = new Utilidades();
            u.generarTabla(modelo, archivo, seleccionado);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
