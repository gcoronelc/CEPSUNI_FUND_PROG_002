package tablademultiplicar.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablademultiplicar.service.TablaService;

public class TablaView2 extends javax.swing.JFrame {

  DefaultTableModel model;

  public TablaView2() {
    initComponents();
    this.setLocationRelativeTo(null);
    
    cargarCombo();
    

  }

  private void cargarCombo() {
    
    int[] numeros = TablaService.obtenerNumeros();

    cboNumero.removeAllItems();
    for (int num : numeros) {
      cboNumero.addItem(String.valueOf(num));
    }
    cboNumero.setSelectedIndex(-1);
    
  }


  private void cargarTabla() {

    // Dato
    int numero;
    numero = Integer.parseInt(cboNumero.getSelectedItem().toString());

    // Obtener resultado
    int[][] tabla = TablaService.obtenerTabla(numero);

    // Presentación
    DefaultTableModel datos;
    datos = (DefaultTableModel) tblRepo.getModel();
    datos.setRowCount(0);
    for (int[] fila : tabla) {
      Object[] rowData = {
        fila[0], "x", fila[1], "=", fila[2]
      };
      datos.addRow(rowData);
    }
        
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cboNumero = new javax.swing.JComboBox<>();
    jLabel1 = new javax.swing.JLabel();
    btnMostrar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblRepo = new javax.swing.JTable();

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

    tblRepo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    tblRepo.setModel(new javax.swing.table.DefaultTableModel(
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
        "Número 1", "Operador", "Número 2", "Operador", "Resultado"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblRepo.setToolTipText("");
    tblRepo.setGridColor(new java.awt.Color(255, 255, 255));
    tblRepo.setRowHeight(25);
    tblRepo.setRowMargin(-1);
    tblRepo.setSelectionBackground(new java.awt.Color(0, 0, 0));
    jScrollPane1.setViewportView(tblRepo);
    if (tblRepo.getColumnModel().getColumnCount() > 0) {
      tblRepo.getColumnModel().getColumn(0).setResizable(false);
      tblRepo.getColumnModel().getColumn(1).setResizable(false);
      tblRepo.getColumnModel().getColumn(2).setResizable(false);
      tblRepo.getColumnModel().getColumn(3).setResizable(false);
      tblRepo.getColumnModel().getColumn(4).setResizable(false);
    }

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(110, 110, 110)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(cboNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(150, 150, 150)
            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(93, Short.MAX_VALUE))
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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

    // Control
    int index = cboNumero.getSelectedIndex();
    if (index == -1) {
      JOptionPane.showMessageDialog(rootPane,
              "Seleccione un numero",
              "ERROR", JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Proceso
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
      java.util.logging.Logger.getLogger(TablaView2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TablaView2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TablaView2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TablaView2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TablaView2().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnMostrar;
  private javax.swing.JComboBox<String> cboNumero;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblRepo;
  // End of variables declaration//GEN-END:variables
}
