public class PruebaEmpleado {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", "Perez", 500.0);
        Empleado empleado2 = new Empleado("Maria", "Lopez", 600.0);

        System.out.println("ANTES DEL AUMENTO DEL 10 %");

        System.out.println("Empleado: " + empleado1.getNombre() + " " + empleado1.getApellido());
        System.out.println("Salario anual: $"+ (empleado1.getSalarioMensual() * 12));

        System.out.println("\nEmpleado: " + empleado2.getNombre() + " " + empleado2.getApellido());
        System.out.println("Salario anual: $" + (empleado2.getSalarioMensual() * 12));

        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);

        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

        System.out.println("\nDESPUES DEL AUMENTO DEL 10 %");

        System.out.println("Empleado: " + empleado1.getNombre() + " " + empleado1.getApellido());
        System.out.println("Salario anual: $" + (empleado1.getSalarioMensual() * 12));

        System.out.println("\nEmpleado: " + empleado2.getNombre() + " " + empleado2.getApellido());
        System.out.println("Salario anual: $" + (empleado2.getSalarioMensual() * 12));
    }
}
