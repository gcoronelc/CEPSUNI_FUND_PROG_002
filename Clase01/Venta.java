class Venta{
	
	public static void main(String[] args) {
		// Datos
		double precio = 680.50;
		int cant = 6;
		// Proceso
		double total = calcTotal(precio, cant);
		double subtotal = calcSubtotal(total);
		double impuesto = calcImpuesto(total, subtotal);
		// Reporte
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total: " + total);

	}

	private static double calcTotal
	(double precio, int cant){
		return (precio * cant);
	}

	private static double calcSubtotal(double total){
		return (total / 1.18);
	}

	private static double calcImpuesto
	(double total, double subtotal){
		return (total - subtotal);
	}

}