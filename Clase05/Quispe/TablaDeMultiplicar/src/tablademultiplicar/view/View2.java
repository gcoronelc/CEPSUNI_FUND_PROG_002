package tablademultiplicar.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablademultiplicar.service.Service;


public class View2 extends javax.swing.JFrame {
  
  DefaultTableModel model;

  public View2() {
    initComponents();
    this.setLocationRelativeTo(null);
    cboNumero.removeAllItems();
    cargarCombo();
    cboNumero.setSelectedIndex(-1);
    model = new DefaultTableModel(12,5);
    Tabla.setModel(model);    
  }

  private void cargarCombo() {
    int[] numeros = Service.obtenerNumeros();

    for (int num : numeros) {
      cboNumero.addItem(String.valueOf(num));
    }
  }
  
  private void limpiarTabla(){
    for (int i = 11; i >= 0; i--) {
      model.removeRow(i);
    }
  }
  
  private void cargarTabla(){
    limpiarTabla();
    String numero = cboNumero.getSelectedItem().toString();
    String[] cadena = new String[5];
    cadena[0] ="   "+numero;
    cadena[1] ="    x    ";
    cadena[3] ="    =    ";
    for (int i = 1; i <= 12; i++) {
      cadena[2] ="    "+i; 
      cadena[4] ="   "+(Integer.parseInt(numero)*i);
      model.addRow(cadena);
    }    
  }
    
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cboNumero = new javax.swing.JComboBox<>();
    jLabel1 = new javax.swing.JLabel();
    btnMostrar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    Tabla = new javax.swing.JTable();

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

    btnMostrar.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
    btnMostrar.setText("MOSTRAR");
    btnMostrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMostrarActionPerformed(evt);
      }
    });

    Tabla.setBackground(new java.awt.Color(255, 255, 255));
    Tabla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    Tabla.setForeground(new java.awt.Color(0, 0, 0));
    Tabla.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
      }
    ));
    Tabla.setToolTipText("");
    Tabla.setColumnSelectionAllowed(false);
    Tabla.setGridColor(new java.awt.Color(255, 255, 255));
    Tabla.setRowHeight(25);
    Tabla.setRowMargin(-1);
    Tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
    jScrollPane1.setViewportView(Tabla);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(cboNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGap(90, 90, 90)
            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(81, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cboNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(40, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
    int index = cboNumero.getSelectedIndex();
    if (index == -1) {
      JOptionPane.showMessageDialog(rootPane,
              "Seleccione un numero",
              "ERROR", JOptionPane.ERROR_MESSAGE);
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
      java.util.logging.Logger.getLogger(View2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(View2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(View2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(View2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new View2().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTable Tabla;
  private javax.swing.JButton btnMostrar;
  private javax.swing.JComboBox<String> cboNumero;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables
}
