import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int num;

        System.out.println("Introduce un valor");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println(num % 0);
        }
    }
}
