package pe.egcc.promedioapp.service;

import java.util.Arrays;

public class PromedioService2 {

  public static int[] eliminarMenor(int n1, int n2, int n3, int n4){
    int[] notas = {n1,n2,n3,n4};
    // Inicio del proceso
    Arrays.sort(notas);
    notas = Arrays.copyOfRange(notas, 1, notas.length);
    // Fin del proceso
    return notas;
  }
  
  public static int promedio( int[] notas){
    int prom = 0;
    // Inicio de proceso
    for (int nota : notas) {
      prom += nota;
    }
    prom /= notas.length;
    // Fin de proceso
    return prom;
  }
  
  public static String condicion( int prom ){
    String cond = "";
    // Proceso - Inicio
    if(prom >= 14){
      cond = "APROBADO";
    } else if( prom >= 11 ){
      cond = "REZAGADO";
    } else {
      cond = "DESAPROBADO";
    }
    // Proceso - Fin
    return cond;
  }
  
}
