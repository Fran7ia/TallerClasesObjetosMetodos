
public class PruebaFrecCardiacas {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(
                "Ingrese su primer nombre:");

        String apellido = JOptionPane.showInputDialog(
                "Ingrese su apellido:");

        int mes = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Mes de nacimiento:"));

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Día de nacimiento:"));

        int anio = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Año de nacimiento:"));

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        String mensaje = "INFORMACIÓN PERSONAL\n";

        mensaje += "Nombre: " + persona.getNombre()
                + " " + persona.getApellido();

        mensaje += "\nFecha de nacimiento: "
                + persona.getMesNacimiento() + "/"
                + persona.getDiaNacimiento() + "/"
                + persona.getAnioNacimiento();

        mensaje += "\nEdad: " + persona.calcularEdad()
                + " años";

        mensaje += "\nFrecuencia cardíaca máxima: "
                + persona.calcularFrecuenciaMaxima()
                + " pulsaciones por minuto";

        mensaje += "\nRango esperado: "
                + persona.calcularFrecuenciaMinimaEsperada()
                + " - "
                + persona.calcularFrecuenciaMaximaEsperada()
                + " pulsaciones por minuto";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
