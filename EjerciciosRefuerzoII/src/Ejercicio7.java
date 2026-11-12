import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int canalA, canalB;
        System.out.println("Introduce el canal A: ");
        canalA = sc.nextInt();
        System.out.println("Introduce el canal B: ");
        canalB = sc.nextInt();
        System.out.println("Pulsaciones necesarias: " + canales(canalA, canalB));
    }
    public static int canales(int canalA, int canalB) {
        int avanzar = 0;
        int retroceder = 0;
        if (canalA >= canalB) {
            avanzar = canalB - canalA;
            retroceder = 99 - canalA + canalB;
        }else {
            avanzar = 99 -canalA + canalB;
            retroceder = canalA - canalB;
        }
        if(avanzar < retroceder){
            return avanzar;
        }else  {
            return retroceder;
        }
    }
}