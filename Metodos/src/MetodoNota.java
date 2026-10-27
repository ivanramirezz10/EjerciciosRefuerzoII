import java.util.Scanner;

public class MetodoNota {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introuce una nota");
        nota = sc.nextInt();

        System.out.println(textoNota(nota));
    }
    public static String textoNota(int nota){
        if((nota < 0) || (nota > 10)){
            return ("Error");
        } else if (nota < 3) {
            return ("Muy deficiente");
        }else if (nota < 5) {
            return ("Insuficiente");
        } else if (nota < 6) {
            return ("Suficiente");
        }else if (nota < 7) {
            return ("Bien");
        }else if (nota < 9) {
            return ("Notable");
        }else {
            return ("Sobresaliente");
        }
    }
}
