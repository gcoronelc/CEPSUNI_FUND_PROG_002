package pe.egcc.concytecapp.view;

import javax.swing.JOptionPane;
import pe.egcc.concytecapp.service.ConcytecService;

/**
 *
 * @author Gustavo Coronel
 */
public class PrestamoView extends javax.swing.JFrame {

  /**
   * Método especial llamado CONSTRUCTOR.
   * 
   * Se utiliza para inicializar el objeto.
   */
  public PrestamoView() {
    initComponents();
    this.setLocationRelativeTo(null);
    cargarCategorias();
    cargarProductos();
    cargarFactores();
  }
  
  private void cargarCategorias(){
    
    // Datos
    String[] categorias = ConcytecService.obtenerCategorias();
    
    // Proceso
    cboCategoria.removeAllItems();
    for (String cat : categorias) {
      cboCategoria.addItem(cat);
    }
    cboCategoria.setSelectedIndex(-1);
        
  }
  
  private void cargarProductos(){
    
    // Datos
    String[] productos = ConcytecService.obtenerProductos();
    
    // Proceso
    cboProducto.removeAllItems();
    for (String prod : productos) {
      cboProducto.addItem(prod);
    }
    cboProducto.setSelectedIndex(-1);
        
  }
  
  private void cargarFactores(){
    
    // Datos
    String[] factores = ConcytecService.obtenerFactores();
    
    // Proceso
    cboFactor.removeAllItems();
    for (String factor : factores) {
      cboFactor.addItem(factor);
    }
    cboFactor.setSelectedIndex(-1);
        
  }
  
  private void actualizaImporte(){
    
    // Control
    txtImporte.setText("");
    int index1 = cboCategoria.getSelectedIndex();
    int index2 = cboProducto.getSelectedIndex();
    if(index1 == -1 || index2 == -1){
      return;
    }
    
    // Datos
    String categoria = cboCategoria.getSelectedItem().toString();
    String producto = cboProducto.getSelectedItem().toString();
    
    // Proceso
    double importe = ConcytecService.obtenerImporte(categoria, producto);
    
    // Reporte
    txtImporte.setText( String.valueOf(importe) );

  }
  

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    cboCategoria = new javax.swing.JComboBox<>();
    jLabel2 = new javax.swing.JLabel();
    cboProducto = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    cboFactor = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    txtImporte = new javax.swing.JTextField();
    btnProcesar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("PRESTAMO CONCYTEC");

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel1.setText("Categoría:");

    cboCategoria.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboCategoria.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboCategoriaActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel2.setText("Producto:");

    cboProducto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboProductoActionPerformed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel3.setText("Importe:");

    cboFactor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    cboFactor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel4.setText("Meses:");

    txtImporte.setEditable(false);
    txtImporte.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

    btnProcesar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    btnProcesar.setText("Procesar");
    btnProcesar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcesarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(47, 47, 47)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(txtImporte))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(cboFactor, 0, 284, Short.MAX_VALUE))))
        .addContainerGap(99, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
          .addComponent(txtImporte))
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(54, 54, 54)
        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(40, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed
    actualizaImporte();
  }//GEN-LAST:event_cboCategoriaActionPerformed

  private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
    actualizaImporte();
  }//GEN-LAST:event_cboProductoActionPerformed

  private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
    
    // Control
    int index1 = cboCategoria.getSelectedIndex();
    int index2 = cboProducto.getSelectedIndex();
    int index3 = cboFactor.getSelectedIndex();
    if(index1 == -1 || index2 == -1 || index3 == -1){
      JOptionPane.showMessageDialog(
              rootPane, 
              "Datos incorrectos",
              "ERROR",
              JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    // Datos
    String categoria = cboCategoria.getSelectedItem().toString();
    String producto = cboProducto.getSelectedItem().toString();
    String factor = cboFactor.getSelectedItem().toString();
    
    // Proceso
    double importe = ConcytecService.obtenerImporte(categoria, producto);
    double porcFactor = ConcytecService.obtenerPorcFactor(factor);
    double valorCuota = ConcytecService.obtenerValorCuota(importe, factor);
    
    // Reporte
    String repo = "";
    repo += "Categoria: " + categoria + "\n";
    repo += "Producto: " + producto + "\n";
    repo += "Nro. Meses: " + factor + "\n";
    repo += "Importe: " + importe + "\n";
    repo += "Interes: " + porcFactor + "%\n";
    repo += "Valor Cuota: " + valorCuota + "\n";
    
    JOptionPane.showMessageDialog(
            rootPane, 
            repo,
            "REPORTE",
            JOptionPane.INFORMATION_MESSAGE);
    
  }//GEN-LAST:event_btnProcesarActionPerformed

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
      java.util.logging.Logger.getLogger(PrestamoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PrestamoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PrestamoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PrestamoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PrestamoView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnProcesar;
  private javax.swing.JComboBox<String> cboCategoria;
  private javax.swing.JComboBox<String> cboFactor;
  private javax.swing.JComboBox<String> cboProducto;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField txtImporte;
  // End of variables declaration//GEN-END:variables
}
