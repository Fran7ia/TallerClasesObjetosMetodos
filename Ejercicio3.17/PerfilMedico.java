
public class PerfilMedico {private String nombre; private String apellido; private String sexo; private int diaNacimiento; private int mesNacimiento; private int anioNacimiento;
                           private int edad; private double altura; private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, int diaNacimiento, int mesNacimiento, int anioNacimiento, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

//Se usa la edad recibida en el constructor ya que no se puede calcular la edad automáticamente por falta de conocimiento

    public int calcularFrecuenciaMaxima() {
        return 220 - getEdad();
    }

    public double calcularFrecuenciaMinimaEsperada() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    public double calcularFrecuenciaMaximaEsperada() {
        return calcularFrecuenciaMaxima() * 0.85;
    }


    public double calcularIMC() {
        double alturaMetros = getAltura() / 100.0;
        return getPeso() / Math.pow(alturaMetros, 2);
    }

