public class Ejercicio8 {
    public static void main(String[] args) {
        int [] numeros = {4, 3, 6, 2};
        System.out.println(cualFalta(numeros));
    }
    public static int cualFalta(int[] numeros){
        int menor = numeros[0];
        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < menor){
                menor = numeros[i];
            }
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        int sumaTotal = (menor + mayor) * (mayor - menor + 1) / 2;
        int falta = sumaTotal - suma;
        if(falta > 0){
            return falta;
        }else {
            return -1;
        }
    }
}
