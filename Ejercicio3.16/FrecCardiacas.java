
public class FrecCardiacas {private String nombre; private String apellido; private int mesNacimiento; private int diaNacimiento; private int anioNacimiento;

    public FrecuenciasCardiacas(String nombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

//No se realizo la parte de calcular edad porque no dominamos aún la libreria de java.time

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public double calcularFrecuenciaMinimaEsperada() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    public double calcularFrecuenciaMaximaEsperada() {
        return calcularFrecuenciaMaxima() * 0.85;
    }
}
