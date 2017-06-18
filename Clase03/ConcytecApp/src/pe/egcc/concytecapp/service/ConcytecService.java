package pe.egcc.concytecapp.service;

public class ConcytecService {

  // Datos de Categorias
  private static final String CAT_01 = "Estudio";
  private static final String CAT_02 = "Tesis";
  
  // Datos de Productos
  private static final String PROD_01 = "Pregrado";
  private static final String PROD_02 = "Mestria";
  private static final String PROD_03 = "Doctorado";

  // Datos de Factores
  private static final String FACT_01 = "06 Meses";
  private static final String FACT_02 = "12 Meses";
  private static final String FACT_03 = "18 Meses";
  
  // Valores de los factores
  private static final double FACT_01_VALOR = 0.07;
  private static final double FACT_02_VALOR = 0.12;
  private static final double FACT_03_VALOR = 0.17;
  
  public static double obtenerImporte(String categoria, String producto){
    double importe = 0.0;
    // Inicio del proceso
    if(categoria.equals(CAT_01)){
      switch(producto){
        case PROD_01:
          importe = 10000.0;
          break;
        case PROD_02:
          importe = 15000.0;
          break;
        case PROD_03:
          importe = 25000.0;
          break;
      }
    }
    if(categoria.equals(CAT_02)){
      switch(producto){
        case PROD_01:
          importe = 5000.0;
          break;
        case PROD_02:
          importe = 8000.0;
          break;
        case PROD_03:
          importe = 12000.0;
          break;
      }
    }
    // Fin del proceso
    return importe;
  }
  
  
}
