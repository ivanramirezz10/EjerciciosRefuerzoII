import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int num1;
        int num2;

        System.out.println("Introduce dos número entero");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Son iguales");
        } else if (num1 > num2){
            System.out.println("El número más grande es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número más grande es: " + num2);
        }

    }
}
