import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        double nota;
        String deberes;

        System.out.println("Introduce tu nota de 0 a 10");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextDouble();
        if (nota < 5){
            System.out.println("Suspenso");
            sc.close();
        }
        System.out.println("Has entregado las prácticas (si/no)");
        deberes = sc.next();

        if (nota >= 5 && deberes.equals("no")){
            System.out.println("Suspenso por prácticas pendientes");
        } else if (nota >= 5 && nota <= 6.9 && deberes.equals("si")) {
            System.out.println("Aprobado");
        } else if (nota >= 7 && nota<= 8.9 && deberes.equals("si")) {
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }
    }
}
