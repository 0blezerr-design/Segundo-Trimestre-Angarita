import java.util.Scanner;

public class funciones5 {
    //crea String creaSaludo(String nombre) que devuelva el texto
    // "hola"+ nombre sin imprimir nada dentro de la función
    static Scanner entrada=new
           Scanner(System.in);

    public static String creaSaludo(String nombre){

        return "hola" + nombre;
    }

    static void main() {
        System.out.println("ingrese su nombre ");

        String nombre =entrada.nextLine();

        String saludo  = creaSaludo(nombre);

        System.out.println(saludo);
    }
}
