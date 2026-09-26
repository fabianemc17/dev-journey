package Part2;

import java.util.Scanner;
public class Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask the user for the number of times that the phrase will be printed
        System.out.println("How many times? ");
        int numsOfTimes = Integer.parseInt(sc.nextLine());

        // Declaramos variables necesarias
        int i = 0;

        // use the while command to call the method a suitable number of times
        while (i < numsOfTimes) {
            printText();
            i++;
        }
    }

    // You own methods here
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}


class MethodsParameters {
    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}


class FromParameterToOne{
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number){
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}


class MultiplesParametros{
    public static void main(String[] args) {
        division(3, 5);
    }
    public static void division(int numerator, int denominator){
        System.out.println((double) numerator/denominator);
    }
}


class DivisibleByThree{
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}


class MetodosVarios {
    public static void main(String[] args) {
        int numUno = numberOne();
        String palabra = word();

        System.out.println(palabra + " " + numUno);

    }
    public static int numberOne(){
        return 1;
    }
    public static String word(){
        return "Hello";
    }
}


class Sumation {

    public static int sum(int number1, int number2, int number3, int number4) {
        int suma = number1 + number2 + number3 + number4;
        return suma;
    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}

class Smallest{
    public static int smallest(int number1, int number2) {
        // write your code here
        if (number1 <= number2){
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {
        int answer =  smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }
}


class Greates{
    public static int greatest(int number1, int number2, int number3) {
        // write some code here
        if (number1 >= number2 && number1 >= number3){
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
}


/* Create a method called average that calculates
the average of the numbers passed as parameters.
The previously created method sum must be used inside this method!
*/
class Averaging{
    public static int sum(int number1, int number2, int number3, int number4) {
        // you can copy your implementation of the method sum here
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        // write your code here
        // calculate the sum of the elements by calling the method sum
        int averag = sum(number1, number2, number3, number4);
        return (double) averag / 4;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}



class PrintingStars{
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17, 3);
        printTrianle(4);
    }
    /* Part 1: Printing Stars
    * Define a method called printStars that prints the given
    * number of stars and a line break.
    * */
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            // you can print one star with the command
            System.out.print("*");
            // call the print command n times
        }
        // in the end print a line break with the comand
        System.out.println("");
    }

    /* Part 2: Printing a square
    Define a method called printSquare(int size)
    that prints a suitable square with the help of the printStars method.
    */
    public static void printSquare(int size){
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    /* Part 3: Write a method
    called printRectangle(int width, int height)
    that prints the correct rectangle by using the printStars method.
    * */
    public static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    /* Part 4: Printing a triangle
    Create a method called printTriangle(int size)
    that prints a triangle by using the printStars method.
    */
    public static void printTrianle(int size){
        int num = 0;
        while (num <= size) {
            printStars(num);
            num++;
        }
    }
}




class AdavancedAstrology{
    public static void main(String[] args) {
        christmasTree(10);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    /* Part 1:Printing stars and spaces
    Define a method called printSpaces(int number)
    that produces the number of spaces specified by number.
    The method does not print the line break.
    */
    public static void printSpaces(int number){
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    /* Part 2: Printing a right-leaning triangle
    Create a method called printTriangle(int size)
    that uses printSpaces and printStars to print the correct triangle.
    */
    static void printTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    /* Part 3: Printing a Christmas tree
    Define a method called christmasTree(int height)
    that prints the correct Christmas tree.
    The Christmas tree consists of a triangle with
    the specified height as well as the base.
    The base is two stars high and three stars wide,
    and is placed at the center of the triangle's bottom.
    The tree is to be constructed by using the methods printSpaces and printStars.
    */
    public static void christmasTree(int height) {
        // Triángulo
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        // Base centrada
        int anchoTriangulo = 2 * height - 1;
        int espaciosBase = (anchoTriangulo - 3) / 2;

        for (int i = 0; i < 2; i++) {
            printSpaces(espaciosBase);
            printStars(3);
        }
    }
}