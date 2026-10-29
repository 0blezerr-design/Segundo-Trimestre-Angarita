import java.util.Scanner;

public class funciones {
    //crear void mostrarDatos(String nombre, int edad) que imprima un saludo con nombre y edad.
    public static void mostrarDatos(String nombre, int edad) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("hola "+ nombre+"edad"+edad);


    }

    static void main() {
        mostrarDatos("carlos ",20);
    }
}
