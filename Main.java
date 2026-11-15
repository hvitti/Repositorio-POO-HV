
public class Main {

    public static void main(String[] args) {

        // Creamos un objeto de tipo Gerente
        Gerente gerente1 = new Gerente(
                "Carlos Ramirez",
                35,
                "Gerente General",
                30000,
                "Administracion",
                5000
        );

        // Creamos un objeto de tipo Desarrollador
        Desarrollador desarrollador1 = new Desarrollador(
                "Ana Martinez",
                28,
                "Desarrolladora de Software",
                22000,
                "Java",
                5
        );

        // Mostramos la informacion del gerente
        System.out.println("===== INFORMACION DEL GERENTE =====");
        gerente1.mostrarInformacion();

        System.out.println("Sueldo anual: $"
                + gerente1.calcularSueldoAnual());

        System.out.println("Bono anual: $"
                + gerente1.calcularBonoAnual());

        // Mostramos la informacion del desarrollador
        System.out.println("\n===== INFORMACION DEL DESARROLLADOR =====");
        desarrollador1.mostrarInformacion();

        System.out.println("Sueldo anual: $"
                + desarrollador1.calcularSueldoAnual());

        desarrollador1.mostrarProyectos();
    }
}
