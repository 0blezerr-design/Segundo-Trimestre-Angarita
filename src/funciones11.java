import java.util.Scanner;

public class funciones11 {
    // Crear
    //int contarVocales(String texto) . (contador + String)

    static Scanner entrada = new Scanner(System.in);

    public static int contarVocales(String texto) {

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;

            }

        }
        return contador;
    }

    static void main(String[] args) {
        System.out.println("ingresa las bocales que quieras");

        String texto=entrada.nextLine();

        int contador=contarVocales(texto);

        System.out.println("la cantidad de boacales ingresadas son "+contador);
    }
}