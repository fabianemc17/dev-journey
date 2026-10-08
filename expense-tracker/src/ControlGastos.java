import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class ControlGastos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorGastos gestor = new GestorGastos();
        boolean corriendo = true;

        while (corriendo) {
            mostrarMenu();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> registrarGasto(scanner, gestor);
                case "2" -> mostrarGastos(gestor);
                case "3" -> mostrarTotal(gestor);
                case "4" -> mostrarGastoMasAlto(gestor);
                case "5" -> mostrarPromedioGastos(gestor);
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

    private static void registrarGasto(Scanner scanner, GestorGastos gestor) {
        String concepto = leerTextoObligatorio(scanner, "Concepto: ");
        String lugar = leerTextoObligatorio(scanner, "Lugar: ");
        double monto = leerMontoValido(scanner, "Monto del gasto: ");
        Categoria categoria = leerCategoria(scanner);
        LocalDate fecha = leerFecha(scanner);

        Gasto nuevoGasto = new Gasto(monto, concepto, lugar, categoria, fecha);
        gestor.agregar(nuevoGasto);
        System.out.println("Gasto registrado ✔");
    }

    private static void mostrarGastos(GestorGastos gestor) {
        if (!hayGastos(gestor)) {
            return;
        }

        ArrayList<Gasto> gastos = gestor.obtenerGastos();
        System.out.println("\n--- Tus gastos ---");

        for (int i = 0; i < gastos.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, gastos.get(i));
        }
    }

    private static void mostrarTotal(GestorGastos gestor) {
        System.out.printf("Total gastado: %.2f €%n", gestor.calcularTotal());
    }

    private static void mostrarGastoMasAlto(GestorGastos gestor) {
        if (!hayGastos(gestor)) {
            return;
        }

        Gasto mayor = gestor.obtenerMasAlto();
        System.out.printf("Gasto más alto: %s%n", mayor);
    }

    private static void mostrarPromedioGastos(GestorGastos gestor) {
        if (!hayGastos(gestor)) {
            return;
        }

        System.out.printf("El promedio de gasto es: %.2f €%n", gestor.calcularPromedio());
    }

    private static boolean hayGastos(GestorGastos gestor) {
        if (gestor.estaVacio()) {
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

    private static double leerMontoValido(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().replace(",", ".");

            try {
                double monto = Double.parseDouble(entrada);

                if (monto <= 0) {
                    System.out.println("El monto tiene que ser mayor que 0.");
                } else {
                    return monto;
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número válido.");
            }
        }
    }

    private static Categoria leerCategoria(Scanner scanner) {
        Categoria[] categorias = Categoria.values();

        System.out.println("Categorías:");
        for (int i = 0; i < categorias.length; i++) {
            System.out.printf("%d. %s%n", i + 1, categorias[i]);
        }

        while (true) {
            System.out.print("Elige una categoría: ");
            String entrada = scanner.nextLine().trim();

            try {
                int opcion = Integer.parseInt(entrada);

                if (opcion >= 1 && opcion <= categorias.length) {
                    return categorias[opcion - 1];
                }
                System.out.println("Elige un número de la lista.");
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número válido.");
            }
        }
    }

    private static LocalDate leerFecha(Scanner scanner) {
        while (true) {
            System.out.print("Fecha (dd/mm/aaaa) [Enter = hoy]: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.isBlank()) {
                return LocalDate.now();
            }

            try {
                return LocalDate.parse(entrada, Gasto.FORMATO_FECHA);
            } catch (DateTimeParseException e) {
                System.out.println("Fecha no válida. Usa el formato dd/mm/aaaa.");
            }
        }
    }
}
