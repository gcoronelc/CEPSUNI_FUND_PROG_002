package pe.egcc.promedioapp.prueba;

import pe.egcc.promedioapp.service.PromedioService2;

public class Prueba02 {

  public static void main(String[] args) {
    
    // Datos
    int n1 = 18;
    int n2 = 16;
    int n3 = 10;
    int n4 = 17;
    
    // Proceso
    int[] notas = PromedioService2.eliminarMenor(n1, n2, n3, n4);
    
    // Reporte
    for (int nota : notas) {
      System.out.println(nota);
    }
  }
  
}
