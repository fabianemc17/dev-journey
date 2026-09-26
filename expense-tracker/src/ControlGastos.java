import java.util.Scanner;
import java.util.ArrayList;

public class ControlGastos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> gastos = new ArrayList<>();
        boolean corriendo = true;

        while (corriendo) {
            mostrarMenu();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> registrarGasto(scanner, gastos);
                case "2", "3" -> System.out.println("Próximamente...");
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
    private static void registrarGasto(Scanner scanner, ArrayList<Double> gastos) {
        System.out.print("Monto del gasto: ");
        String entrada = scanner.nextLine().replace(",", ".");

        try {
            double monto = Double.parseDouble(entrada);

            if (monto <= 0) {
                System.out.println("El monto tiene que ser mayor que 0.");
                return;
            }

            gastos.add(monto);
            System.out.println("Gasto registrado ✔");
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }
    }
}
