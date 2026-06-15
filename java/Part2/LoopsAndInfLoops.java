import java.util.Scanner;

/* Write a program by using the loop example that asks "Shall we carry on?"
 until the user inputs the string "no". */
public class LoopsAndInfLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Shall we carry on?");
            String input = sc.nextLine();
            // Salida del bucle:
            if (input.equals("no")){
                break;
            }
        }
    }
}


/*Write a program, according to the preceding example,
that asks the user to input values until they input the value 4.*/
class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Escribe un numero, 4 para salir");
            int num = Integer.parseInt(sc.nextLine());
            // Salida del bucle
            if (num == 4){
                break;
            }
            System.out.println("No es 4, seguimos...");
        }

        System.out.println("Okay es 4, bye!");
    }
}



/* Write a program that asks the user for numbers.
If the number is negative (smaller than zero), the program prints for user "Unsuitable number"
and asks the user for a new number.
 If the number is zero, the program exits the loop.
 If the number is positive, the program prints the number to the power of two.*/
class loops2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Escribe un numero, 0 para salir");
            int num = Integer.parseInt(sc.nextLine());

            // If the number is zero, the program exits the loop.
            if(num == 0) {
                break;
                // If the number is negative: "Unsuitable number", prompt another num...
            } else if (num < 0){
                System.out.println("Numero invalido");
                continue;
            } else {
                // If the number is positive, the program prints the number to the power of two.
                System.out.println(num * num);
            }
        }
    }
}

/*Write a program that reads values from the user until they input a 0.
After this, the program prints the total number of inputted values.
The zero that's used to exit the loop should not be included in the total number count.*/
class CalculationWithLoops{
    public static void main(String[] args) {
        // Creamos el Scanner
        Scanner teclado = new Scanner(System.in);

        // Declaramos una variable para llevar la cuenta de cuantos nums se ingresaron
        int num = 0;

        // Creamos el Loop
        while(true){
            // Solicitamos un num al user
            System.out.println("Escribe un numero (0 para salir): ");
            // Pasamos el input a int
            int value = Integer.parseInt(teclado.nextLine());
            // Si el user escribe 0, finish.
            if (value == 0){
                break;
            }
            // sumamos la cantidad de inputs sin incluir el 0.
                num++;
        }
        // Imprimos el total de num sin contar el 0...
        System.out.println("La cantidad de numeros ingresados es: " + num);
    }
}


/**Write a program that reads values from the user until they input a 0.
After this, the program prints the total number of inputted values that are negative.
The zero that's used to exit the loop should not be included in the total number count. */
class NegativesNums{
    public static void main(String[] args) {
        // Creamos Scanner
        Scanner input = new Scanner(System.in);

        // Declaramos variable para llevar la cuenta
        int negativesValues = 0;

        // Creamos el loops
        while(true){
            // Pedimos al user un num
            System.out.println("Escribe un num (0 to exit): ");
            // Leemos el user´s input
            int num = Integer.parseInt(input.nextLine());

            // Si el user escribe 0, finish.
            if (num == 0){
                break;
            }
            // Contamos los valores negativos ingresados...
            if (num < 0){
                negativesValues++;
            }
        }
        // Imprimos el total de num negativos sin contar el 0...
        System.out.println("La cantidad de numeros negativos ingresados es: " + negativesValues);
    }
}



/* Write a program that reads numbers from the user until the user inputs a number 0.
After this the program outputs the sum of the numbers.
The number zero does not need to be added to the sum,
even if it does not change the results.
*/
class SumOfNums{
    public static void main(String[] args) {
        // Creamos Scanner
        Scanner teclado = new Scanner(System.in);
        // Declaramos variable a contar
        int numSum = 0;

        // Creamos Loop
        while (true) {
            // Solicitamos num al user
            System.out.println("Escribe un num: (0 to exit)");
            // Transformamos el Input a Integer
            int input = Integer.parseInt(teclado.nextLine());

            // Si es 0, finish!
            if (input == 0){
                break;
            }
            numSum += input;
        }
        // Imprimos la suma total
        System.out.println("El total de la suma de los num ingresados es: " + numSum);
    }
}

/* Write a program that asks the user for input until the user inputs 0.
After this the program prints the amount of numbers inputted and the sum of the numbers.
The number zero does not need to be added to the sum,
but adding it does not change the results. */

class NumAndSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInputted = 0;
        int sumOfNums = 0;

        while(true){
            System.out.println("Escribe un num: (0 to exit)");
            int input = Integer.parseInt(sc.nextLine());

            if (input == 0){
                break;
            }
            numInputted++;
            sumOfNums += input;
        }
        System.out.println("La cantidad total de num es: " + numInputted);
        System.out.println("La suma total de los numeros es: " + sumOfNums);
    }
}



/* Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the numbers.
The number zero does not need to be counted to the average.
You may assume that the user inputs at least one number. */
class AverageOfNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amountNum = 0;
        int sumOfNum = 0;


        while(true){
            System.out.println("Escribe un num: ");
            int input = Integer.parseInt(sc.nextLine());

            if(input == 0){
                break;
            }
            amountNum++;
            sumOfNum += input;
        }
        if (amountNum > 0){
            double averageNum =  (double) sumOfNum / amountNum;
            System.out.println("El average de los num es: " + averageNum);
        }
    }
}


/* Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the positive numbers
(numbers that are greater than zero).
If no positive number is inputted, the program prints "Cannot calculate the average" */


class AverageOfPositivesNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveNum = 0;
        int sumOfNum = 0;

        while(true){
            System.out.println("Escribe un num: ");
            int input = Integer.parseInt(sc.nextLine());

            if (input == 0) {
                break;
            }
            if (input > 0) {
                positiveNum++;
                sumOfNum += input;
            }

        }

        if (positiveNum > 0){
            double averagePosNum = (double) sumOfNum / positiveNum;
            System.out.println("El average de num positivos es: " + averagePosNum);
        } else{
            System.out.println("Cannot calculate the average");
        }
    }
}
