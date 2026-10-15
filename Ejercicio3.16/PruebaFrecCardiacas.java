
public class PruebaFrecCardiacas {

    public static void main(String[] args) {
        FrecCardiacas persona = new FrecCardiacas("Francis", "Almeida", 10, 15, 2007, 19);

        System.out.println("Información Personal");

        System.out.println("Nombre: " + persona.getNombre()
                + " " + persona.getApellido());

        System.out.println("Fecha de nacimiento: "
                + persona.getMesNacimiento() + "/"
                + persona.getDiaNacimiento() + "/"
                + persona.getAnioNacimiento());

        System.out.println("Edad: " + persona.getEdad()
                + " años");

        System.out.println("Frecuencia cardíaca máxima: "
                + persona.calcularFrecuenciaMaxima()
                + " pulsaciones por minuto");

        System.out.println("Frecuencia mínima esperada: "
                + persona.calcularFrecuenciaMinimaEsperada()
                + " pulsaciones por minuto");

        System.out.println("Frecuencia máxima esperada: "
                + persona.calcularFrecuenciaMaximaEsperada()
                + " pulsaciones por minuto");
    }
}
