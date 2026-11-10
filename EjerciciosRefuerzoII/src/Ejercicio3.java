public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(sumaDigitos("3433"));
        System.out.println(sumaDigitos("5188"));
    }
    public static String sumaDigitos(String Digitos) {
        int suma = 0;
        String resultado = "";

        for (int i = 0; i < Digitos.length(); i++) {
            int digito = Integer.parseInt("" + Digitos.charAt(i));
            suma += digito;
            resultado += digito;
            if(i < Digitos.length() - 1) {
                resultado += " + ";
            }
        }
        resultado += " = " + suma;
        return resultado;
    }
}
