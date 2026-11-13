import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println(orden(numeros));
    }
    public static String orden(int[] numeros){
        boolean ascendente = true;
        boolean descendente = true;
        boolean iguales = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if(numeros[i] < numeros[i + 1]){
                descendente = false;
                iguales = false;
            }else if(numeros[i] > numeros[i + 1]){
                ascendente = false;
                iguales = false;
            }else {
                ascendente = false;
                descendente = false;
            }
        }
        if(iguales){
            return "Iguales";
        }else if(ascendente){
            return "Ascendente";
        } else if (descendente) {
            return "Desecendente";
        }else  {
            return "Desordenado";
        }
    }
}
