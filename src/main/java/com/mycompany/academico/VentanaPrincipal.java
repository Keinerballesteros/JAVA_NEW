/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.academico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-17
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    ArrayList<Integer> listMayores = new ArrayList<>();
    ArrayList<Integer> listMenores  = new ArrayList<>();
    ArrayList<Integer> listMayoresDeEdad = new ArrayList<>();
    
    int sizeDeMenores;
    int sizeDeMayores;
    int sizeDeAdultosMayores;
    
    
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("SISTEMA ACADEMICO");

        create.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        create.setForeground(new java.awt.Color(0, 102, 255));
        create.setText("Crear");
        create.setEnabled(false);
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(153, 255, 0));
        search.setText("Consultar");
        search.setEnabled(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Tamaños");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(create)
                .addGap(59, 59, 59)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(search)
                    .addComponent(jButton1))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        boolean state = true;
        search.setEnabled(true);
   
        String input = JOptionPane.showInputDialog(rootPane, "Ingrese su edad");
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                state = false;
                break;
            }
            state = true;
        }
        if(state){
        int age =  Integer.parseInt(input);
        
        if(age>0 && age<18){
             
             if(listMenores.size() <sizeDeMenores){
                 JOptionPane.showMessageDialog(rootPane, "Usted es menor de edad");
                 listMenores.add(age);
             }
             else{
                 JOptionPane.showMessageDialog(rootPane, "No se pueden ingresar mas edades de menores de edad");
             }
        }
        else if(age>=18 && age<=60){
            
            
            if(listMayores.size() <sizeDeMayores){
                JOptionPane.showMessageDialog(rootPane, "Usted es mayor de edad");
               listMayores.add(age);
             }
             else{
                 JOptionPane.showMessageDialog(rootPane, "No se pueden ingresar mas edades de mayores de edad");
             }
        }
        else{
            
            if(listMayoresDeEdad.size() <sizeDeAdultosMayores){
                JOptionPane.showMessageDialog(rootPane, "Usted es un adulto mayor");
               listMayoresDeEdad.add(age);
             }
            else{
                 JOptionPane.showMessageDialog(rootPane, "No se pueden ingresar mas edades de adultos mayores");
             }
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Solo se pueden ingresar números");
        }
    }//GEN-LAST:event_createActionPerformed
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       String message = "";

   
    message += "Menores de edad: ";
    for (int age : listMenores) {
        message += age+ ", ";
    }
   
    message += "\n"; 
   
    message += "Mayores de edad: ";
    for (int age : listMayores) {
        message += age + ", ";
    }
    message += "\n"; 

   
    message += "Adultos mayores: ";
    for (int age : listMayoresDeEdad) {
        message += age +", ";
    }
    JOptionPane.showMessageDialog(rootPane, message);
   
    
    }//GEN-LAST:event_searchActionPerformed

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_createMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sizeDeMenores =  Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese cuantas personas quiere recibir de menores de edad"));
        sizeDeMayores =  Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese cuantas personas quiere recibir de mayores de edad"));
        sizeDeAdultosMayores =  Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese cuantas personas quiere recibir de adultos mayores"));
        
        create.setEnabled(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
