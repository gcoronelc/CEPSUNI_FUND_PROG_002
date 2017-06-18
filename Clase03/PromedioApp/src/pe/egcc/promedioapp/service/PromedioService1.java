package pe.egcc.promedioapp.service;

public class PromedioService1 {
  
  public static int menorNota(int n1, int n2, int n3, int n4){
    int menor = n1; // Punto de partida
    // Proceso - Inicio
    if( menor > n2){
      menor = n2;
    }
    if( menor > n3){
      menor = n3;
    }
    if( menor > n4){
      menor = n4;
    }
    // Proceso - Fin
    return menor;
  }
  
  
  public static int calcPromedio(int n1, int n2, int n3, int n4){
    int prom;
    // Proceso - Inicio
    int menor = menorNota(n1, n2, n3, n4);
    prom = ( n1 + n2 + n3 + n4 - menor) / 3;
    // Proceso - Fin
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
