
package tablademultiplicar.prueba;

import javax.swing.JOptionPane;
import tablademultiplicar.service.Service;

public class Prueba {
  public static void main(String[] args) {
    int numero=5;
    int[] arreglo = Service.obtenerNumeros();
    String texto = Service.obtenerTabla(numero);
    
    for (int num : arreglo) {
      System.out.print(num+" ");
    }
    JOptionPane.showMessageDialog(null,texto);
  }

}
