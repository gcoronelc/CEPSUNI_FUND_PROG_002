package pe.egcc.ventaappp.prueba;

import pe.egcc.ventaappp.service.VentaService;


public class Prueba01 {
  
  public static void main(String[] args) {
    
    // Datos
    double precio = 450.30;
    int cant = 4;
    
    // Proceso 
    double total = VentaService.calcTotal(precio, cant);
    double subtotal = VentaService.calcSubtotal(total);
    double impuesto = VentaService.calcImpuesto(total, subtotal);
    
    // Reporte
    System.out.println("Subtotal: " + subtotal);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
    
  }
  
  
}
