
import javax.swing.JOptionPane;

public class PruebaEmpleado {

    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog(
                "Nombre del primer empleado:");
        String apellido1 = JOptionPane.showInputDialog(
                "Apellido del primer empleado:");
        double salario1 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Salario mensual del primer empleado:"));

        String nombre2 = JOptionPane.showInputDialog(
                "Nombre del segundo empleado:");
        String apellido2 = JOptionPane.showInputDialog(
                "Apellido del segundo empleado:");
        double salario2 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Salario mensual del segundo empleado:"));

        Empleado empleado1 = new Empleado(
                nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(
                nombre2, apellido2, salario2);

        String mensaje = "ANTES DEL AUMENTO\n";

        mensaje += empleado1.getNombre() + " "
                + empleado1.getApellido()
                + "\nSalario anual: $"
                + (empleado1.getSalarioMensual() * 12);

        mensaje += "\n\n" + empleado2.getNombre() + " "
                + empleado2.getApellido()
                + "\nSalario anual: $"
                + (empleado2.getSalarioMensual() * 12);

        empleado1.setSalarioMensual(
                empleado1.getSalarioMensual() * 1.10);

        empleado2.setSalarioMensual(
                empleado2.getSalarioMensual() * 1.10);

        mensaje += "\n\nDESPUÉS DEL AUMENTO DEL 10 %";

        mensaje += "\n" + empleado1.getNombre() + " "
                + empleado1.getApellido()
                + "\nSalario anual: $"
                + (empleado1.getSalarioMensual() * 12);

        mensaje += "\n\n" + empleado2.getNombre() + " "
                + empleado2.getApellido()
                + "\nSalario anual: $"
                + (empleado2.getSalarioMensual() * 12);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
