public class Ejercicio4 {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 3, 4, 4, 4, 5};
        System.out.println(numeros);
    }
    public static int moda(int[] numeros){
        int maxContador = 0;
        int maxValor = 0;
        for(int i = 0; i < numeros.length; i++){
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[j] == numeros[i]){
                    contador++;
                }
            }
            if(contador > maxContador){
                maxContador = contador;
                maxValor = numeros[i];
            }
        }
        return maxValor;
    }
}
