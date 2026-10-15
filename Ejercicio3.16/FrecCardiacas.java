
public class FrecCardiacas {private String nombre; private String apellido; private int mesNacimiento; private int diaNacimiento; private int anioNacimiento; private int edad;
    public FrecCardiacas(String nombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.edad = edad;
    }

        public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getEdad() {
        return edad;
    }
//Se usa un getter para la edad y no un calculo del sistema ya que no hemos aprendido a usar la libreria de tiempo de java

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - getEdad();
    }

    public double calcularFrecuenciaMinimaEsperada() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    public double calcularFrecuenciaMaximaEsperada() {
        return calcularFrecuenciaMaxima() * 0.85;
    }
}
