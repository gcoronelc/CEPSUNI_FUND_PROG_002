package pe.egcc.prestamoapp.prueba;

import pe.egcc.prestamoapp.service.PrestamoService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    double capital = 1200.0;
    double tasa = 0.04;
    int meses = 15;
    
    // Proceso
    double cgma[][] = PrestamoService
            .calcPrestamo(capital, tasa, meses);
    
    // Reporte
    for (double[] cuota : cgma) {
      
      System.out.println(
                    cuota[0] + 
                    "\t" + cuota[1] + 
                    "\t" + cuota[2] + 
                    "\t" + cuota[3]);
      
    }
    
    
    
    
    
  }
  
}
