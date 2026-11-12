public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println(dividirFactoriales(5, 2));
        System.out.println(dividirFactoriales(6, 5));
        System.out.println(dividirFactoriales(8, 3));
        System.out.println(dividirFactoriales(14, 8));
    }
    public static int dividirFactoriales(int dividiendo, int divisor){
        int resultado = 1;
        for (int i = 1; i <= dividiendo - divisor; i++) {
            resultado = resultado * (divisor + i);
        }
        return resultado;
    }
}
