import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int valor;
        System.out.println("Introduce un valor");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();

        if (valor >= 0){
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

    }
}
