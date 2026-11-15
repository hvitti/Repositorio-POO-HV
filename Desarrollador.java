
public class Desarrollador extends Empleado {

    // Atributos exclusivos de Desarrollador
    private String lenguajePrincipal;
    private int proyectosAsignados;

    // Constructor de la clase Desarrollador
    public Desarrollador(String nombre, int edad, String puesto,
                         double sueldo, String lenguajePrincipal,
                         int proyectosAsignados) {

        // Llamamos al constructor de la clase base
        super(nombre, edad, puesto, sueldo);

        this.lenguajePrincipal = lenguajePrincipal;
        this.proyectosAsignados = proyectosAsignados;
    }

    // Sobrescribimos el método de la clase base
    @Override
    public void mostrarInformacion() {

        // Reutilizamos la información del empleado
        super.mostrarInformacion();

        System.out.println("Lenguaje principal: " + lenguajePrincipal);
        System.out.println("Proyectos asignados: " + proyectosAsignados);
    }

    // Método exclusivo de Desarrollador
    public void mostrarProyectos() {
        System.out.println("El desarrollador tiene "
                + proyectosAsignados + " proyectos asignados.");
    }
}
