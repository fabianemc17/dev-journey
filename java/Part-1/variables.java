import java.util.Scanner;
public class variables {
    static void main(String[] args) {
            Scanner userGuest = new Scanner(System.in);

            System.out.println("Give a number: ");
            int value = Integer.valueOf(userGuest.nextLine());
                System.out.println("You gave the number " + value);
    }
}


class readingDoubles{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a doube value: ");

        double value = Double.valueOf(sc.nextLine());
         System.out.println("You wrote the number:  " + value);

    }
}


class readingBooleans{
    static void main(String[] args) {
        // Escribimos nuestra funcion para leer respuesta del user
        Scanner sc = new Scanner(System.in);

        // Le pedimos al user un boolean...
        System.out.println("Write something: ");

        // Convertimos la respuesta del user a un boolean ya que se recibe como String..
        boolean answer = Boolean.valueOf(sc.nextLine());

        // Imprimimos respuesta del user
            System.out.println("True or False: " + answer);
    }
}

class exercises{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a String: ");
        var text = sc.nextLine();

        System.out.println("Give an integer: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Give a double: ");
        double num1 = Double.valueOf(sc.nextLine());

        System.out.println("Give a boolean: ");
        boolean userAnswer = Boolean.parseBoolean(sc.nextLine());

        System.out.println("You gave the String " + text);
        System.out.println("you gave the integer " + num);
        System.out.println("You gave the double " + num1);
        System.out.println("You gave the boolean " + userAnswer);
    }
}