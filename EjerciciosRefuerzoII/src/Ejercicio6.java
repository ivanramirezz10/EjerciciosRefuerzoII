import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        if (esHyperpar(num)) {
            System.out.println("Es hyperpar");
        } else {
            System.out.println("No es hyperpar");
        }
    }
    public static boolean esHyperpar(int num) {
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}