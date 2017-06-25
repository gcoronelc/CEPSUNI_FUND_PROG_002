package pe.egcc.concytecapp.prueba;

import pe.egcc.concytecapp.service.ConcytecService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    String categoria = "Tesis";
    String producto = "Pregrado";
    String factor = "12 Meses";
    
    // Proceso
    double importe = ConcytecService.obtenerImporte(categoria, producto);
    double valorFactor = ConcytecService.obtenerValorFactor(factor);
    double valorCuota = ConcytecService.obtenerValorCuota(importe, factor);
    double porcFactor = ConcytecService.obtenerPorcFactor(factor);
    
    // Reporte
    System.out.println("Importe: " + importe);
    System.out.println("Valor Factor: " + valorFactor);
    System.out.println("Valor Cuota: " + valorCuota);
    System.out.println("Porc. Factor: " + porcFactor);
    
  }
  
}
