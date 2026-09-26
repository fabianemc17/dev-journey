package Part3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class LIstAndArrays {
    public static void main(String[] args) {
        // create the word list for storing strings
        ArrayList<String> wordList = new ArrayList<>();
        // add two values to the word list
        wordList.add("First");
        wordList.add("Second");

        // retrieve the value from position 0 of the word list, and print it
        System.out.println(wordList.get(0));
    }
}

/* The exercise contains a base that asks the user for strings and adds them to a list.
* The program stops reading when the user enters an empty string.
* The program then prints the first element of the list.
* Your assignment is to modify the program so that instead of the first value,
* the third value on the list is printed.
*/
class ThirdElement{
    public static void main(String[] args) {
        // Creamos nuestra Lista
        ArrayList<String> listaDePalabras = new ArrayList<>();

        // Solicitamos al user palabras
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe palabras: (texto en blanco para stop)");


        while(true) {
            String userPalabras = sc.nextLine();
            if (userPalabras.equals("")) {
                break;
            }
            listaDePalabras.add(userPalabras);
        }
            if (listaDePalabras.size() >= 3) {
                System.out.println(listaDePalabras.get(2));
            } else {
                System.out.println("No ingresaste suficientes palabras.");
            }
    }
}

class SecondPlusThird{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listOfNum = new ArrayList<>();

        System.out.println("Escribe numeros: (0 para parar)");

        while(true) {
            int numOfUser = Integer.parseInt(sc.nextLine());
            if (numOfUser == 0) {
                break;
            }

            listOfNum.add(numOfUser);
        }

        System.out.println(listOfNum.get(1) + listOfNum.get(2));
    }
}


/* There is a program that uses a list in the exercise template.
*  Modify it so that its execution always produces the error IndexOutOfBounds.
* The user should not have to give any inputs to the program (e.g. write something on the keyboard)
* */
class IndexOutOfBoundsException{
    public static void main(String[] args) {
        ArrayList<String> xList = new ArrayList<>();
        xList.add("First");
        xList.add("Second");

        System.out.println(xList.get(0));
        System.out.println("Number of values on the list: " + xList.size());
    }
}

class ListSize{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true){
            String userInput = sc.nextLine();

            if( userInput.equals("")){
                break;
            }
            names.add(userInput);
        }
        System.out.println("In total: " + names.size());
    }
}

class LastInList{
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nombre: (espacion en blanco para salir)");

        while(true){
            String userInput = sc.nextLine();
            if(userInput.equals("")){
                break;
            }
            namesList.add(userInput);
        }
        // Imprimir primer indice
        System.out.println(namesList.get(0));
        // Imptimir el ultimo indice leido
        System.out.println(namesList.get(namesList.size() - 1));
    }
}



class RememberThisNum{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> numbers = new ArrayList<>();
       System.out.println("Escribe un num: (-1 para salir)");

       while(true){
           int userInput = Integer.parseInt(sc.nextLine());
           if (userInput == -1){
               break;
           }
           numbers.add(userInput);
       }
       // Imprimir los numeros ingresados por el user
       for (int numero : numbers ){
           System.out.println(numero);
       }

    // Imprime los numeros dentro del rango

       System.out.println("From where? ");
       int start = Integer.parseInt(sc.nextLine());

       System.out.println("To where? ");
       int end = Integer.parseInt(sc.nextLine());

       for (int i = start; i <= end; i++) {
          System.out.println(numbers.get(i));
       }

       // Find the greater number
       int mayor = numbers.get(0);    // Asumimos que el primero es el mayor

       for (int numero : numbers){
           if (numero > mayor) {
               mayor = numero;      // Actualiza si encuentro uno mas grande
           }
       }
        System.out.println("The greater number: " + mayor);

       // Find the number by index
        System.out.println("Search for? ");
        int index = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == index){
                System.out.println(index + " is at index: " + i);
            }
        }
    }
}


class IndexOfSmaller{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Write numbers: (9999 to exit)");
        while(true){
            int userInput = Integer.parseInt(sc.nextLine());

            if (userInput == 9999){
                break;
            }
            numeros.add(userInput);
        }
        int smallest = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
            int num = numeros.get(i);
            if (smallest > num){
                smallest = num;
            }
        }
        System.out.println("The smallest number is: " + smallest);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }
    }
}

// Iterating Over a List with a For-Each Loop





