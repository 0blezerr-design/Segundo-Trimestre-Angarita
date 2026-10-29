import java.util.Scanner;

public class funciones7 {
    //crea un double cesiusAfarherenheit(double)c (fromula c*9/5 +32)
    //usarla par mostrar la tabla del0 a 100 grados de 10 en 10 (return +for)
    static Scanner entrada=
            new Scanner(System.in);
    public static double cesiusAfarherenheit(double c){
        double resultado= c*9/5 +32;
        return resultado;
    }

    static void main(String[] args) {
        System.out.println("ingrese su temperatura");
        double c = entrada.nextDouble();

        for (int i = 0; i <=100; i+=10) {
           double faherenhemit=cesiusAfarherenheit(i);
            System.out.println(i+"c="+faherenhemit+"f");
        }

    }
}
