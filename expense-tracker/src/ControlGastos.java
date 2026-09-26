import java.util.Scanner;

public class ControlGastos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean corriendo = true;

        while (corriendo) {
            mostrarMenu();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1", "2", "3" -> System.out.println("Próximamente...");
                case "0" -> corriendo = false;
                default -> System.out.println("Opción no válida, intenta de nuevo.");
            }
        }

        System.out.println("¡Nos vemos!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== CONTROL DE GASTOS ===");
        System.out.println("1. Registrar gasto");
        System.out.println("2. Ver gastos");
        System.out.println("3. Ver total");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }
}
