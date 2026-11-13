import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comportamientos = sc.nextInt();
        int maxlitros =  sc.nextInt();
        int diferencia = sc.nextInt();
        System.out.println(litros(comportamientos, maxlitros, diferencia));
    }
    public static int litros(int comportamientos, int maxlitros, int diferencia) {
        int total = 0;
        for (int i = 0; i < comportamientos; i++) {
            total = total + maxlitros;
            maxlitros = maxlitros - diferencia;
        }
        return total;
    }
}
