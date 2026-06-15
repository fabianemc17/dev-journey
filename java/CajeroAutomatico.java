import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario su saldo inicial (num decimales).
        System.out.println("Ingrese su saldo Inicial: ");
        double saldo = Double.parseDouble(sc.nextLine());

        // En caso de que el usuario ingrese un saldo inicial negativo.
        if(saldo < 0){
            System.out.println("El saldo inicial no puede ser negativo.");
            return;
        }

        // Mostrar un menu que se repite hasta que el user elija salir.
        while(true) {
            System.out.println("Elija una accion: ");
            System.out.println("Opcion 1 -> Depositar dinero ");
            System.out.println("Opcion 2 -> Retirar dinero ");
            System.out.println("Opcion 3 -> Ver saldo actual ");
            System.out.println("Opcion 0 -> Salir ");
            int userEleccion = Integer.parseInt(sc.nextLine());

            if (userEleccion == 0) {
                break;
            } else if (userEleccion == 1) {
                System.out.println("Monto a añadir: ");
                double montoAñadido = Double.parseDouble(sc.nextLine());
                // No se puede añadir montos negativos
                if(montoAñadido > 0) {
                   saldo += montoAñadido;
                } else{
                    System.out.println("¡No se puede añadir montos negativos!");
                }
            } else if (userEleccion == 2) {
                System.out.println("Monto a retirar: ");
                double montoRetirado = Double.parseDouble(sc.nextLine());
                // No se puede retirar mas del dinero en caja. Ni retirar montos negativos
                if (montoRetirado <= 0) {
                    System.out.println("El monto debe ser mayor a cero.");
                } else if (montoRetirado > saldo) {
                    System.out.println("No hay fondos suficientes.");
                } else {
                    saldo -= montoRetirado;
                }
            } else if (userEleccion == 3){
                System.out.printf("Su saldo actual es: %.2f€%n", saldo);
            } else {
                System.out.println("Opción no válida.");
            }
        }
        System.out.printf("Su saldo final es: %.2f€%n" , saldo);
    }
}
