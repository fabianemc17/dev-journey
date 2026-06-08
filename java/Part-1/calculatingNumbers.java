import java.util.Scanner;
public class calculatingNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos dias te gustaria convertir a segundos? ");
            int dias = Integer.valueOf(sc.nextLine());
              System.out.println(dias + " dias son " + (dias * 86400)+ " segundos");
    }
}

class sum{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num1 = Integer.valueOf(sc.nextLine());

        System.out.println("Dime otro numero ");
        int num2 = Integer.valueOf(sc.nextLine());
        System.out.println("La suma de tus numeros es: " + (num1 + num2));
    }
}


class sum1{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num1 = Integer.valueOf(sc.nextLine());

        System.out.println("Dime un segundo numero ");
        int num2 = Integer.valueOf(sc.nextLine());

        System.out.println("Dime un tercer numero ");
        int num3 = Integer.valueOf(sc.nextLine());

        System.out.println("La suma de tus numeros es: " + (num1 + num2 + num3));
    }
}


class sum3{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num1 = Integer.valueOf(sc.nextLine());

        System.out.println("Dime otro numero ");
        int num2 = Integer.valueOf(sc.nextLine());

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
}

class averageNum{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Dime otro numero: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Dime un tercer numero: ");
        int num3 = Integer.parseInt(sc.nextLine());

        double promedio = ((double) num + num2 + num3) / 3;

        System.out.println("El promedio es: " + promedio);

    }
}





class numeros{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num1 = Integer.valueOf(sc.nextLine());

        System.out.println("Dime otro numero ");
        int num2 = Integer.valueOf(sc.nextLine());

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));



    }
}