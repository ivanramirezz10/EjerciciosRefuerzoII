import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int nota;
        int sumar = 0;
        int todas = 0;
        int media;
        boolean num = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus notas");
        nota = sc.nextInt();

        do {
            nota = sc.nextInt();
            sumar += nota;
            todas++;
            if (nota == 10){
                num = true;
            }

        }while (nota != 1);
            media = sumar / todas;
            if (num == true){
                System.out.println("Hay un 10");
            }


    }
}
