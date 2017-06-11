package pe.egcc.ventaappp.service;

public class VentaService {

  /**
   * Calcula el total de una venta.
   *
   * @param precio Precio del producto.
   * @param cant Cantidad vendida.
   * @return Retorna el total de la venta.
   */
  public static double calcTotal(double precio, int cant) {
    double total = precio * cant;
    total = dosDec(total);
    return total;
  }

  public static double calcSubtotal(double total) {
    double subtotal = total / 1.18;
    subtotal = dosDec(subtotal);
    return subtotal;
  }

  public static double calcImpuesto(double total, double subtotal) {
    double impuesto = total - subtotal;
    impuesto = dosDec(impuesto);
    return impuesto;
  }

  public static double dosDec(double valor) {
    valor *= 100.0;
    valor = Math.round(valor);
    valor /= 100.0;
    return valor;
  }

}
