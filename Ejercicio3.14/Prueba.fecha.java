public class PruebaFecha {

    public static void main(String[] args) {

        Fecha fecha = new Fecha(10, 15, 2026);

        System.out.println("La fecha es: " + fecha.getMes() + "/"
                + fecha.getDia() + "/" + fecha.getAnio());
    }
}
