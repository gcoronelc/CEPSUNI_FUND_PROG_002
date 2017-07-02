
package tablademultiplicar.prueba;

import javax.swing.JOptionPane;
import tablademultiplicar.service.TablaService;

public class Prueba {
  public static void main(String[] args) {
    
    // Dato
    int numero=5;
    
    // Proceso
    int[][] tabla = TablaService.obtenerTabla(numero);
    
    // Reporte
    for (int i = 0; i < tabla.length; i++) {
      int[] fila = tabla[i];
      String texto = "";
      texto += fila[0] + " * ";
      texto += fila[1] + " = ";
      texto += fila[2];
      System.out.println(texto);
    }
    
    
  }

}
