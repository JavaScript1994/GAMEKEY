/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import apps.Utilidades;
import java.awt.Dimension;

/**
 *
 * @author Nasa
 */
public class frmprincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmprincipal
     */
    public frmprincipal() {
        initComponents();
        jDesktopPane1.setBorder(new Utilidades());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnjugar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuDescripcion = new javax.swing.JMenuItem();
        menuAgradecimiento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRABALL");
        setResizable(false);

        btnjugar.setBackground(new java.awt.Color(1, 168, 9));
        btnjugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnjugar.setForeground(new java.awt.Color(255, 255, 255));
        btnjugar.setText("JUGAR");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnjugar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(825, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addComponent(btnjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        jMenu1.setText("PANEL PRINCIPAL");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("ACERCA");

        menuDescripcion.setText("Descripcion");
        menuDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDescripcionActionPerformed(evt);
            }
        });
        jMenu2.add(menuDescripcion);

        menuAgradecimiento.setText("Agradecimiento");
        menuAgradecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgradecimientoActionPerformed(evt);
            }
        });
        jMenu2.add(menuAgradecimiento);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDescripcionActionPerformed
        frmacerca acerca = new frmacerca();
        frmprincipal.jDesktopPane1.add(acerca);
        jDesktopPane1.moveToFront(acerca);
    }//GEN-LAST:event_menuDescripcionActionPerformed

    private void menuAgradecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgradecimientoActionPerformed
        frmagradecimiento agradecimiento = new frmagradecimiento();
        frmprincipal.jDesktopPane1.add(agradecimiento);
        jDesktopPane1.moveToFront(agradecimiento);
    }//GEN-LAST:event_menuAgradecimientoActionPerformed

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        // TODO add your handling code here:
        frmpaneljuego panel = new frmpaneljuego();
        frmprincipal.jDesktopPane1.add(panel);
        jDesktopPane1.moveToFront(panel);
        //System.out.println("validar");
    }//GEN-LAST:event_btnjugarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnjugar;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAgradecimiento;
    private javax.swing.JMenuItem menuDescripcion;
    // End of variables declaration//GEN-END:variables
}
