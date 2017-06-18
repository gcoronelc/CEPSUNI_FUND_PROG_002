package pe.egcc.promedioapp.prueba;

import pe.egcc.promedioapp.service.PromedioService1;

/**
 * Prueba rezagado
 * @author Master
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    
    // Datos
    int n1 = 5;
    int n2 = 10;
    int n3 = 15;
    int n4 = 11;
    
    // Proceso
    int menor = PromedioService1.menorNota(n1, n2, n3, n4);
    int prom = PromedioService1.calcPromedio(n1, n2, n3, n4);
    String cond = PromedioService1.condicion(prom);
    
    // Reporte
    System.out.println("Nota eliminada: " + menor);
    System.out.println("Promedio: " + prom);
    System.out.println("Condición: " + cond);
    
  }
}
