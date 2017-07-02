package tablademultiplicar.service;

public class TablaService {
  
  public static int[] obtenerNumeros(){
    int[] numeros = new int[12];
    for (int i = 0; i < 12; i++) {
      numeros[i]=i+1;
    }
    return numeros;
  }
  
  public static int[][] obtenerTabla(int numero){
    int[][] tabla = new int[12][3];
    for (int i = 1; i <= 12; i++) {
      // Calculo
      int r = i * numero;
      // Grabando en la tabla
      tabla[i-1][0] = numero;
      tabla[i-1][1] = i;
      tabla[i-1][2] = r;
    }
    return tabla;
  }
  
}
