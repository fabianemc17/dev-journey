package Part2;
import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int userNum = Integer.parseInt(sc.nextLine());

        for(int i = 0; i <= userNum; i++){
            System.out.println(i);
        }
    }
}


/*Write a program, which reads an integer from the user.
Then the program prints numbers from that number to 100.
You can assume that the user always gives a number less than 100.
Below are some examples of the expected functionality.
*/
class CountingToHundred{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a num: ");
        int userInt = Integer.parseInt(sc.nextLine());

        for(int i = userInt; i <= 100; i++ ){
            System.out.println(i);
        }
    }
}

/*
Part 1
Write a program which prints the integers from 1 to a number given by the user.
Part 2
Ask the user for the starting point as well.
 */
class FromWhereToWhere{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: Where to
        System.out.println("Where to?: ");
        int userValue = Integer.parseInt(sc.nextLine());

        // Part 2: Where from
        System.out.println("Where from?: ");
        int startingPoint = Integer.parseInt(sc.nextLine());

        if (userValue < startingPoint){
            System.out.println("El inicio no puede ser mayor al fin...");
        } else {
            for (int i = startingPoint; i <= userValue; i++) {
                System.out.println(i);
            }
        }
    }
}

/*
* Implement a program, which calculates the sum 1+2+3+...+n
* where n is given as user input.
*
**/
class SumOfSequence{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Last number? ");
        int userInput = Integer.parseInt(teclado.nextLine());

        int sum = 0;
        for (int i = 1; i <= userInput; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}



/*
* Implement a program which calculates the sum of a closed interval, and prints it.
* Expect the user to write the smaller number first and then the larger number.
*/
class SumTheSequel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the first num: ");
        int firstNum = Integer.parseInt(sc.nextLine());

        System.out.println("Write the second num: ");
        int secondNum = Integer.parseInt(sc.nextLine());

        int sum = 0;
        if (firstNum > secondNum){
            System.out.println("El primer numero debe ser menor al segundo");
        } else {
            for (int i = firstNum; i <= secondNum; i++) {
                sum += i;
            }
            System.out.println("La suma total es: " + sum);
        }
    }
}

/*
* Implement a program which calculates the factorial of a number given by the user.
Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n.
For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24.
Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.
*/
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un num: ");
        int userNum = Integer.parseInt(sc.nextLine());

        if (userNum < 0) {
            System.out.println("El factorial no existe para números negativos.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= userNum; i++) {
                factorial *= i;
            }
            System.out.println("El factorial es: " + factorial);
        }
    }
}


/*  Part 1
Implement a program that asks the user for numbers
(the program first prints "Write numbers: ")
until the user gives the number -1.
When the user writes -1, the program prints "Thx! Bye!" and ends.
    Part 2
Extend the program so that it prints the sum of the numbers (not including the -1)
the user has written.
    Part 3
Extend the program so that it also prints the number of numbers
(not including the -1) the user has written.
    Part 4
Extend the program so that it prints the mean of the numbers
(not including the -1) the user has written.
    Part 5
 Extend the program so that it prints the number of even and odd numbers
 (excluding the -1).
 */
class ReapeatBreakAndRemember{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask the user for number
        System.out.println("Write numbers: ");

        // Creamos las variables necesarias
        int sumOfInputs = 0;
        int numInputted = 0;
        int pairsNums = 0;
        int impairNums = 0;

        while(true){
            int userInput = Integer.parseInt(sc.nextLine());

            // Si user escribe -1, finish
            if (userInput == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            // La suma de los numeros escritos por el user
            sumOfInputs += userInput;
            // La cantidad total de numeros ingresados
            numInputted++;

            // Numeros Pares e Impares...
            if (userInput % 2 == 0){
                pairsNums++;
            } else {
                impairNums++;
            }
        }
        // Imprimimos la suma y cantidad total de nums ingresados
        System.out.println("Sum: " + sumOfInputs);
        System.out.println(("Numbers: " + numInputted));

        // El average de los numeros escritos
        if (numInputted == 0) {
            System.out.println("Average: no numbers inputted.");
        } else {
            System.out.printf("Average: %.2f%n", (double) sumOfInputs / numInputted);
        }

        // Imprimimos los pares e impares
        System.out.println("Even: " + pairsNums);
        System.out.println("Odd: " + impairNums);
    }
}
