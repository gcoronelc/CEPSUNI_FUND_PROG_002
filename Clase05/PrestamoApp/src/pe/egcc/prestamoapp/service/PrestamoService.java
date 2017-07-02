package pe.egcc.prestamoapp.service;

public class PrestamoService {


  public static double[][] calcPrestamo(
          double capital, double tasa, int meses ){
    
    double[][] cronograma = new double[meses][4];
    
    // Inicio del proceso
    
    double cuotaCapital = dosDec(capital / meses);
    
    for (int i = 0; i < meses; i++) {
      
      // Se aplica solo para la ultima cuota
      if(i == (meses - 1)){
        cuotaCapital = dosDec( capital );
      }
      
      // Calculo de la cuota
      double cuotaInteres = dosDec( capital * tasa );
      double cuotaTotal = dosDec( cuotaCapital + cuotaInteres );
      
      // Registrar la cuota
      cronograma[i][0] = i+1;
      cronograma[i][1] = cuotaCapital;
      cronograma[i][2] = cuotaInteres;
      cronograma[i][3] = cuotaTotal;
      
      // Nuevo capital
      capital -= cuotaCapital;
    }
    
    // Fin del proceso
    return cronograma;
    
  }
  
  public static double dosDec(double valor){
    valor *= 100.0;
    valor = Math.round(valor);
    valor /= 100.0;
    return valor;
  }

  
}
