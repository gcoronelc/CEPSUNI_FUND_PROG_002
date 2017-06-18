package pe.egcc.concytecapp.prueba;

import pe.egcc.concytecapp.service.ConcytecService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    String categoria = "Tesis";
    String producto = "Pregrado";
    
    // Proceso
    double importe = ConcytecService.obtenerImporte(categoria, producto);
    
    // Reporte
    System.out.println("Importe: " + importe);
    
  }
  
}
