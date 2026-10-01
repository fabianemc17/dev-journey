import java.util.Scanner;
import java.util.ArrayList;

public class ControlGastos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gasto> gastos = new ArrayList<>();
        boolean corriendo = true;

        while (corriendo) {
            mostrarMenu();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> registrarGasto(scanner, gastos);
                case "2" -> mostrarGastos(gastos);
                case "3" -> mostrarTotal(gastos);
                case "4" -> mostrarGastoMasAlto(gastos);
                case "5" -> mostrarPromedioGastos(gastos);
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
        System.out.println("4. Ver gasto más alto");
        System.out.println("5. Ver promedio de gastos");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void registrarGasto(Scanner scanner, ArrayList<Gasto> gastos) {
        String concepto = leerTextoObligatorio(scanner, "Concepto: ");
        String lugar = leerTextoObligatorio(scanner, "Lugar: ");

        System.out.print("Monto del gasto: ");
        String entrada = scanner.nextLine().replace(",", ".");

        try {
            double monto = Double.parseDouble(entrada);

            if (monto <= 0) {
                System.out.println("El monto tiene que ser mayor que 0.");
                return;
            }

            Gasto nuevoGasto = new Gasto(monto, concepto, lugar);
            gastos.add(nuevoGasto);

            System.out.println("Gasto registrado ✔");
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }
    }

    private static void mostrarGastos(ArrayList<Gasto> gastos) {
        if (!hayGastos(gastos)) {
            return;
        }

        System.out.println("\n--- Tus gastos ---");
        for (int i = 0; i < gastos.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, gastos.get(i));
        }
    }

    private static void mostrarTotal(ArrayList<Gasto> gastos) {
        System.out.printf("Total gastado: %.2f €%n", calcularTotal(gastos));
    }

    private static void mostrarGastoMasAlto(ArrayList<Gasto> gastos) {
        if (!hayGastos(gastos)) {
            return;
        }

        Gasto mayor = gastos.get(0);
        for (Gasto gasto : gastos) {
            if (gasto.getMonto() > mayor.getMonto()) {
                mayor = gasto;
            }
        }
        System.out.printf("Gasto más alto: %s%n", mayor);
    }

    private static void mostrarPromedioGastos(ArrayList<Gasto> gastos) {
        if (!hayGastos(gastos)) {
            return;
        }

        double promedio = calcularTotal(gastos) / gastos.size();
        System.out.printf("El promedio de gasto es: %.2f €%n", promedio);
    }

    private static double calcularTotal(ArrayList<Gasto> gastos) {
        double total = 0;
        for (Gasto gasto : gastos) {
            total += gasto.getMonto();
        }
        return total;
    }

    private static boolean hayGastos(ArrayList<Gasto> gastos) {
        if (gastos.isEmpty()) {
            System.out.println("No hay gastos registrados todavía.");
            return false;
        }
        return true;
    }

    private static boolean esTextoValido(String texto) {
        if (texto.isBlank()) {
            System.out.println("Este campo no puede ir vacío.");
            return false;
        }
        return true;
    }

    private static String leerTextoObligatorio(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();

            if (esTextoValido(texto)) {
                return texto;
            }
        }
    }
}
