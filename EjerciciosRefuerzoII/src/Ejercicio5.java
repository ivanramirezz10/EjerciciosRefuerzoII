import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [] numerosImpares = {5, 7, 4, 3, 1};
        System.out.println(mediana(numerosImpares));

        int[] numerosPares = {5, 7, 4, 3, 1, 6};
    }
    public static double mediana(int numeros[]){
        Arrays.sort(numeros);
        int n = numeros.length;
        if (n % 2 != 0){
            return numeros[n / 2];
        }else {
            return (numeros[(n / 2) -1] + numeros[n / 2]) / 2.0;
        }
    }
}
