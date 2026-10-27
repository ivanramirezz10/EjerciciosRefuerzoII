import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int num;

        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num % 10 == 0){
            System.out.println("Es múltiplo de 10");
            System.out.println("Introduce otro valor");
            int num2 = sc.nextInt();
            if (num2 % 10 == 0){
                System.out.println("También es múltiplo de 10");
            } else {
                System.out.println("No es multiplo de 10");
            }
        }else{
            System.out.println("No es multiplo de 10");
        }


        }
    }

