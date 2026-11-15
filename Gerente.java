
public class Gerente extends Empleado {

    // Atributos exclusivos de Gerente
    private String departamento;
    private double bonoMensual;

    // Constructor de la clase Gerente
    public Gerente(String nombre, int edad, String puesto,
                   double sueldo, String departamento,
                   double bonoMensual) {

        // Llamamos al constructor de la clase base
        super(nombre, edad, puesto, sueldo);

        this.departamento = departamento;
        this.bonoMensual = bonoMensual;
    }

    // Sobrescribimos el método de la clase Empleado
    @Override
    public void mostrarInformacion() {

        // Reutilizamos el método de la clase base
        super.mostrarInformacion();

        System.out.println("Departamento: " + departamento);
        System.out.println("Bono mensual: $" + bonoMensual);
    }

    // Método exclusivo de Gerente
    public double calcularBonoAnual() {
        return bonoMensual * 12;
    }
}
