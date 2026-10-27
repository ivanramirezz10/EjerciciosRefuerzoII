import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int num;
        int elegir = 0;
        System.out.println("Elije una de las opciones");
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Se mostrará la tabla de multiplicar del número");
        System.out.println("2.¿Se puede dividir el número entre 2 de fora exacta?");
        System.out.println("3.Se sumará 1 + 2 + 3 … hasta que la suma supere el número, indicando en qué término se ha\n" +
                "detenido y cuál es la suma alcanzada.");
        elegir = sc.nextInt();
        num = sc.nextInt();



    }
}
