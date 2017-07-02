
package tablademultiplicar.service;

public class Service {
  
  public static int[] obtenerNumeros(){
    int[] numeros = new int[12];
    for (int i = 0; i < 12; i++) {
      numeros[i]=i+1;
    }
    return numeros;
  }
  
  public static String obtenerTabla(int numero){
    String texto=""; 
    for (int i = 1; i <= 12; i++) {
      texto+="        "+numero+"    x    "+i+"    =    "+(numero*i)+"\n";
    }
    return texto;
  }
  
}
