
public class Empleado {

    // Atributos del empleado
    private String nombre;
    private int edad;
    private String puesto;
    private double sueldo;

    // Constructor
    public Empleado(String nombre, int edad, String puesto, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo mensual: $" + sueldo);
    }

    // Calcular sueldo anual
    public double calcularSueldoAnual() {
        return sueldo * 12;
    }

    // Obtener nombre
    public String getNombre() {
        return nombre;
    }

    // Obtener sueldo
    public double getSueldo() {
        return sueldo;
    }
}
