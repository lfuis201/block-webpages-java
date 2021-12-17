package vista;

import controlador.Controlador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Modelo;

public class Editar extends javax.swing.JFrame {
    
    Controlador c;
    Modelo m;
    
    public Editar() {
        initComponents();
        setLocationRelativeTo(null);
        c = new Controlador(this);
        m = new Modelo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Atras_Edicion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ruta_URL = new javax.swing.JTextField();
        Ingresar_valor = new javax.swing.JButton();
        Borrar_valor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        Atras_Edicion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Atras_Edicion.setText("Atras");
        Atras_Edicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Atras_EdicionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Atras_Edicion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Atras_Edicion)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Edicion de URL");

        Ruta_URL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Ingresar_valor.setBackground(new java.awt.Color(51, 153, 255));
        Ingresar_valor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ingresar_valor.setText("Ingresar");
        Ingresar_valor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingresar_valorMouseClicked(evt);
            }
        });
        Ingresar_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_valorActionPerformed(evt);
            }
        });

        Borrar_valor.setBackground(new java.awt.Color(51, 153, 255));
        Borrar_valor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Borrar_valor.setText("Borrar");
        Borrar_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar_valorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Ingresar_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Borrar_valor)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(Ruta_URL, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Ruta_URL, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingresar_valor)
                    .addComponent(Borrar_valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Atras_EdicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Atras_EdicionMouseClicked
        Principal primero = new Principal();
        primero.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Atras_EdicionMouseClicked

    private void Ingresar_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_valorActionPerformed
        
        borrar b = new borrar();
        b.start();
    }//GEN-LAST:event_Ingresar_valorActionPerformed

    private void Borrar_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_valorActionPerformed
        // TODO add your handling code here:
        borrar_txt t = new borrar_txt();
        t.start();

    }//GEN-LAST:event_Borrar_valorActionPerformed

    private void Ingresar_valorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresar_valorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresar_valorMouseClicked

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
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_Edicion;
    public javax.swing.JButton Borrar_valor;
    public javax.swing.JButton Ingresar_valor;
    public javax.swing.JTextField Ruta_URL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private class borrar extends Thread {
        
        public void run() {
            Ruta_URL.setText("");
        }
    }
    
    private class borrar_txt extends Thread {
        
        public void run() {
            
            try {
                // Implementacion

                FileReader archivo = new FileReader("C:/Windows/System32/drivers/etc/hosts");
                BufferedReader mostrar = new BufferedReader(archivo);
                // almacenamos los valores 
                ArrayList<String> guardar = new ArrayList<String>();
                String valor = "";
                while ((valor = mostrar.readLine()) != null) {
                    
                    guardar.add(valor);
                    
                }
                
                String ruta = "127.0.0.1 " + Ruta_URL.getText();
                boolean encontrado = false;
                for (String url : guardar) {
                    if (url.equals(ruta)) {
                        guardar.remove(url);
                        encontrado = true;
                        break;
                    }
                    
                }
                
                if (encontrado) {
                    JOptionPane.showMessageDialog(null, "Si se encontro la URL");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro la URL");
                }
                
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Windows/System32/drivers/etc/hosts"));
                bw.write("");
                bw.close();
                
                for (String actual : guardar) {
                    
                    m.blockSite2(actual);
                    
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Listado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Listado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            borrar b = new borrar();
            b.start();
            
        }
    }
}
