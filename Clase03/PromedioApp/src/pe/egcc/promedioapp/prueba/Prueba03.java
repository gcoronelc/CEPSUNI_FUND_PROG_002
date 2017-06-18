package pe.egcc.promedioapp.prueba;

import pe.egcc.promedioapp.service.PromedioService1;
import pe.egcc.promedioapp.service.PromedioService2;

public class Prueba03 {
  
  public static void main(String[] args) {
    
    // Datos
    int n1 = 18;
    int n2 = 17;
    int n3 = 16;
    int n4 = 10;
    
    // Proceso
    int[] validas = PromedioService2.eliminarMenor(n1, n2, n3, n4);
    int prom = PromedioService2.promedio(validas);
    String cond = PromedioService2.condicion(prom);
    
    // Reporte
    System.out.println("Promedio: " + prom);
    System.out.println("Condición: " + cond);
    
  }
}
