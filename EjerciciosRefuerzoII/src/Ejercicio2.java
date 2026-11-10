import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.println("Faltan " + diasHastaNochevieja(dia, mes) + " días para Nochevieja");
    }
    public static int diasHastaNochevieja(int dia, int mes) {
        int[] diasMes = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        int diasRestantes = 0;
        diasRestantes += diasMes[mes - 1] - dia;
        for (int i = mes; i < diasMes.length; i++) {
            diasRestantes += diasMes[i];
        }
        return diasRestantes;
    }
}

