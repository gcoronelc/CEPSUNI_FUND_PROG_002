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

  // Meses de los Factores
  private static final int FACT_01_MESES = 6;
  private static final int FACT_02_MESES = 12;
  private static final int FACT_03_MESES = 18;

  // Valores de los factores
  private static final double FACT_01_VALOR = 0.07;
  private static final double FACT_02_VALOR = 0.12;
  private static final double FACT_03_VALOR = 0.17;

  public static double obtenerImporte(String categoria, String producto) {
    double importe = 0.0;
    // Inicio del proceso
    if (categoria.equals(CAT_01)) {
      switch (producto) {
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
    if (categoria.equals(CAT_02)) {
      switch (producto) {
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

  public static double obtenerValorFactor(String factor) {
    double valorFactor = 1;
    // Inicio de proceo
    switch (factor) {
      case FACT_01:
        valorFactor = FACT_01_VALOR;
        break;
      case FACT_02:
        valorFactor = FACT_02_VALOR;
        break;
      case FACT_03:
        valorFactor = FACT_03_VALOR;
        break;
    }
    // Fin de proceso
    return valorFactor;
  }

  public static double obtenerPorcFactor(String factor) {
    double porcFactor = 1;
    // Inicio de proceo
    double valorFactor = obtenerValorFactor(factor);
    porcFactor = valorFactor * 100;
    // Fin de proceso
    return porcFactor;
  }

  public static double obtenerValorCuota(double importe, String factor) {
    double cuota;
    // Inicio de proceo
    int meses = 0;
    switch (factor) {
      case FACT_01:
        meses = FACT_01_MESES;
        break;
      case FACT_02:
        meses = FACT_02_MESES;
        break;
      case FACT_03:
        meses = FACT_03_MESES;
        break;
    }
    double valorFactor = obtenerValorFactor(factor);
    cuota = importe * (1 + valorFactor) / meses;
    // Fin de proceso
    return redondear(cuota);
  }
  
  
  
  private static double redondear(double valor){
    valor *= 100.0;
    valor = Math.round(valor);
    valor /= 100.0;
    return valor;
  }
  
}
