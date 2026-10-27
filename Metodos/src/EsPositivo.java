import java.util.Scanner;

public class EsPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int num = sc.nextInt();

        if(espositivo(num)){
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero es negativo");
        }

    }
    public static boolean espositivo(int n){
        if (n >= 0){
            return true;
        }else {
            return false;
        }
    }
}
