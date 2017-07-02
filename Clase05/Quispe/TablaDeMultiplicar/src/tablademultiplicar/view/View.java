
package tablademultiplicar.view;

import javax.swing.JOptionPane;
import tablademultiplicar.service.Service;

public class View extends javax.swing.JFrame {

  public View() {
    initComponents();
    this.setLocationRelativeTo(null);
    cboNumero.removeAllItems();
    cargarCombo();
    cboNumero.setSelectedIndex(-1);
   }
  
  private void cargarCombo(){
    int[] numeros = Service.obtenerNumeros();

    for (int num : numeros) {  
      cboNumero.addItem(String.valueOf(num));
    }
  }
  
  private void cargarTabla(){
    TEXTO.setText("");
    int numero=Integer.parseInt(cboNumero.getSelectedItem().toString());
    String texto = Service.obtenerTabla(numero);
    TEXTO.setText(texto);
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cboNumero = new javax.swing.JComboBox<>();
    jLabel1 = new javax.swing.JLabel();
    btnMostrar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    TEXTO = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("TABLA DE MULTIPLICAR");

    cboNumero.setFont(new java.awt.Font("Dialog", 0, 19)); // NOI18N
    cboNumero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
    cboNumero.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboNumeroActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
    jLabel1.setText("TABLA:");

    btnMostrar.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
    btnMostrar.setText("MOSTRAR");
    btnMostrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMostrarActionPerformed(evt);
      }
    });

    TEXTO.setColumns(20);
    TEXTO.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
    TEXTO.setLineWrap(true);
    TEXTO.setRows(5);
    jScrollPane1.setViewportView(TEXTO);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(91, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(cboNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGap(69, 69, 69)
            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(79, 79, 79))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(9, 9, 9)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cboNumero)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(17, 17, 17)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
    int index=cboNumero.getSelectedIndex();
    if(index == -1){
      JOptionPane.showMessageDialog(rootPane,
              "Seleccione un numero",
              "ERROR",JOptionPane.ERROR_MESSAGE);
      return;
    }
    cargarTabla();
  }//GEN-LAST:event_btnMostrarActionPerformed

  private void cboNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNumeroActionPerformed

  }//GEN-LAST:event_cboNumeroActionPerformed
  public static void main(String args[]) {

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
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

 
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new View().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextArea TEXTO;
  private javax.swing.JButton btnMostrar;
  private javax.swing.JComboBox<String> cboNumero;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables
}
