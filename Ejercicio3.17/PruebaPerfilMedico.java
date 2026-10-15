
public class PruebaPerfilMedico {

    public static void main(String[] args) {
      //Los datos se ingresan directamente al constructor ya que aún no hemos aprendido como usar funciones para agregar escanear lo que diga el usuario
        PerfilMedico persona = new PerfilMedico(
                "Francis", "Almeida", "Masculino",
                15, 10, 2007, 19, 184, 100);

        System.out.println("PERFIL MÉDICO");

        System.out.println("Nombre: " + persona.getNombre()
                + " " + persona.getApellido());

        System.out.println("Sexo: " + persona.getSexo());

        System.out.println("Fecha de nacimiento: "
                + persona.getDiaNacimiento() + "/"
                + persona.getMesNacimiento() + "/"
                + persona.getAnioNacimiento());
      
        System.out.println("Edad: " + persona.getEdad()
                + " años");

        System.out.println("Altura: " + persona.getAltura()
                + " cm");

        System.out.println("Peso: " + persona.getPeso()
                + " kg");

        System.out.println("IMC: " + persona.calcularIMC());

        System.out.println("Frecuencia cardíaca máxima: "
                + persona.calcularFrecuenciaMaxima()
                + " pulsaciones por minuto");

        System.out.println("Frecuencia mínima esperada: "
                + persona.calcularFrecuenciaMinimaEsperada()
                + " pulsaciones por minuto");

        System.out.println("Frecuencia máxima esperada: "
                + persona.calcularFrecuenciaMaximaEsperada()
                + " pulsaciones por minuto");

        System.out.println("\nCLASIFICACIÓN DEL IMC");

        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obesidad: 30 o más");

        double imc = persona.calcularIMC();

        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc < 25) {
            System.out.println("Clasificación: Normal");
        } else if (imc < 30) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
    }
}
