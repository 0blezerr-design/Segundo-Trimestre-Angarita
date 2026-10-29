import java.util.Scanner;

public class funciones2 {
    //cree "int double(int n)" que devuelva el doble del número
    //En "main" leer número, llamar la función, guardarla el resultado en una variable e imprimirlo
    public static int doble (int n) {

        return n*2;
    }

    static void main() {
        Scanner entrada= new Scanner(System.in);
        System.out.print("ingrese un numero ");
        int numero =entrada.nextInt();
        int resultado = doble(numero);
        System.out.println("el doble es "+ resultado);
    }
}
