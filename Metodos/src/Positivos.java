public class Positivos {
    public static void main(String[] args) {
        final int num = 10;
        int[] numeros = new int[num];
        int positivos = 0;

        for (int nume: numeros) {
            if (num >= 0){
                positivos++;
            }

        }

        System.out.println("Ha introducido " + positivos + " números positivos");
        System.out.println("Ha introducido " + (num - positivos) + " números negativos");

    }
    public static int cuantosPositivos(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= 0) {
                contador++;
            }
        }
        return contador;
    }


}
