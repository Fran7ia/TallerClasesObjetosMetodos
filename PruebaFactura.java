public class PruebaFactura {

    public static void main(String[] args) {

        Factura factura1 = new Factura("M01", "Martillo", 5, 8.50);

        System.out.println("FACTURA");
        System.out.println("Numero de pieza: " + factura1.getNumeroPieza());
        System.out.println("Descripcion: " + factura1.getDescripcionPieza());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio por articulo: $" + factura1.getPrecioArticulo());
        System.out.println("Monto total: $" + factura1.obtenerMontoFactura());

        System.out.println("\n=== PRUEBA DE VALIDACION ===");

        factura1.setCantidad(-3);
        factura1.setPrecioArticulo(-10.0);

        System.out.println("Cantidad despues de validar: " + factura1.getCantidad());
        System.out.println("Precio despues de validar: $" + factura1.getPrecioArticulo());
        System.out.println("Monto total despues de validar: $" + factura1.obtenerMontoFactura());
    }
}
