import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero: ");
            int userNum = Integer.parseInt(sc.nextLine());

                if (userNum > 50){
                    System.out.println("Speeding ticket!");
                }
    }
}

class promtsUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Dime un numero: ");
          int userPrompts = Integer.valueOf(sc.nextLine());

          if (userPrompts > 0 ){
              System.out.println("El numero es positivo.");
          } else {
              System.out.println("El numero es negativo");
          }

    }
}


class userAge{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Escribe tu edad: ");
            int edad = Integer.parseInt(sc.nextLine());

                if (edad >= 18){
                    System.out.println("Eres un adulto.");
                } else{
                    System.out.println("Eres menor de edad.");
                }
    }
}


class greaterNum{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero: ");
            int num1 = Integer.valueOf(sc.nextLine());
            System.out.println("Dime otro numero: ");
            int num2 = Integer.parseInt(sc.nextLine());

                if (num1 > num2){
                    System.out.println("EL numero mas grande es " + num1);
                } else if (num1 < num2){
                    System.out.println("El numero mas grande es: " + num2);
                } else {
                    System.out.println("Los numeros son iguales");
                }

    }
}

class GradesAndPoints{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Escribe tus puntos [0-100]: ");
       int nota = Integer.parseInt(sc.nextLine());

       if (nota < 0){
            System.out.println("Imposible!");

       } else if (nota <= 49){
           System.out.println("Has Reprobado");
       } else if (nota <= 59){
           System.out.println("Tu calificacion es 1");
       } else if (nota <= 69){
           System.out.println("Tu calificacion es 2");
       } else if (nota <= 79){
           System.out.println("Tu calificacion es 3");
       } else if (nota <= 89){
           System.out.println("Tu calificacion es 4");
       } else if (nota <= 100){
           System.out.println("Tu calificacion es 5");
       } else {
           System.out.println("Increible!");
       }
   }
}

class LosBooleans{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int guest = Integer.parseInt(sc.nextLine());

        if (guest % 2 == 0){
            System.out.println("El numero " + guest + " es par.");
        } else {
            System.out.println("El numero " + guest + " es impar.");
        }

    }
}

class Igualdad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una contraseña: ");
        String answer = sc.nextLine();


        if (answer.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}

class Same{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un Primer String: ");
        var primero = sc.nextLine();
        System.out.println("Escribe un segundo String: ");
        var segundo = sc.nextLine();

        if (primero.equals(segundo)){
            System.out.println("Iguales!");
        } else {
            System.out.println("Diferentes!");
        }
    }
}

class OperadoresLogicos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu edad: ");
        var age = Integer.parseInt(sc.nextLine());

        if (age >= 0 && age <= 120){
            System.out.println("OK!");
        } else {
            System.out.println("Imposible!");
        }

    }
}


class Order{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero entre 1-100");
        int num = Integer.parseInt(sc.nextLine());

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0){
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}


class Years{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un año: ");
        int year = Integer.parseInt(sc.nextLine());

        if (year % 400 == 0) {
            System.out.println("Es un año bisiesto.");
        } else if (year % 100 == 0) {
            System.out.println("No es un año bisiesto.");
        } else if (year % 4 == 0) {
            System.out.println("Es un año bisiesto.");
        } else {
            System.out.println("No es un año bisiesto.");
        }

    }
}

class GiftTax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que valor tiene el regalo? ");
        double value = Double.parseDouble(sc.nextLine());

        if (value < 5000){
            System.out.println("No tax!");
        } else if (value <= 25000){
            System.out.println("El tax es: " + (100 + (value - 5000) * 0.08));
        } else if (value <= 55000) {
            System.out.println("El tax es: " + (1700 + (value - 25000) * 0.10));
        } else if (value <= 200000) {
            System.out.println("El tax es: " + (4700 + (value - 55000) * 0.12));
        } else if (value <= 1000000) {
            System.out.println("El tax es: " + (22100 + (value - 200000) * 0.15));
        } else {
            System.out.println("El tax es: " + (142100 + (value - 1000000) * 0.17));
        }
    }
}