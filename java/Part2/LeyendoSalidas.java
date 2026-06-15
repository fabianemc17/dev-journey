package Part2;// Hacemos que el Scanner esté disponible en el programa...
import java.util.Scanner;

/* Write a program that reads an integer from the user and prints the square of the given integer,
 i.e. the integer multiplied by itself. */

public class LeyendoSalidas {
    public static void main(String[] args) {
        // Creamos el Scanner...
        Scanner reader = new Scanner(System.in);

        // Pedimos un int al usuario y convertimos el String a Integer...
        System.out.println("Escribe un numero: ");
        int num = Integer.parseInt(reader.nextLine());

        // Declaramos la variable cuadrado para obtener nuestra operacion...
        int cuadrado = num * num;

        // Imprimimos el resultado en consola
        System.out.println("El resultado de tu numero es: " + cuadrado);
    }
}


/* Write a program that reads two integers from the user
and prints the square root of the sum of these integers.
The program does not need to work with negative values.
 */

class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Escribe otro numero: ");
        int num2 = Integer.parseInt(sc.nextLine());

        int suma = num1 + num2;
        System.out.println("La raiz cuadrada de tus numeros es: " + Math.sqrt(suma));
    }
}


/*Write a program that reads an integer from the user.
If the number is less than 0, the program prints the given integer multiplied by -1.
In all other cases, the program prints the number itself. */

class ConditionalLogic{
    public static void main(String[] args) {
        // Creamos el Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos al usuario un numero y lo convertimos a Integer...
        System.out.println("Escribe un numero: ");
        int num = Integer.parseInt(reader.nextLine());

        // Creamos las condiciones para imprimir en consola...
        if (num < 0){
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }

    }
}

/*Write a program that reads two integers from the user.
If the first number is greater than the second,
the program prints "(first) is greater than (second)."
If the first number is less than the second,
the program prints "(first) is smaller than (second)."
Otherwise, the program prints "(first) is equal to (second)."
The (first) and (second) should always be replaced with the actual numbers
that were provided by the user.
 */

class ComparantingNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 0;

        System.out.println("Escribe un numero: ");
        first = Integer.parseInt(sc.nextLine());

        System.out.println("Escribe otro numero: ");
        second = Integer.parseInt(sc.nextLine());

        if (first > second){
            System.out.println(first + " es mayor a " + second );
        } else if (first < second){
            System.out.println(first + " es menor a " + second);
        } else {
            System.out.println(first + " es igual a " + second);
        }
    }
}


