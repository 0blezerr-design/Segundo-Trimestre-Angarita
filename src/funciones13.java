import java.util.Scanner;

public class funciones13 {
    //Crear boolean esCapicua(int n) usando una función auxiliar
    //int invertirNumero(int n). Un número capicúa es el que se lee igual de izquierda a
    //derecha que de derecha a izquierda, es decir, es igual a su número invertido. 121, 1331
    // 12321 son capicúa; 123 no, porque invertido es 321. (funciones que se
    //combinan)
static Scanner entrada = new Scanner(System.in);

public static int invertirNumero(int n){

     int invertido =0;

    while(n>0){

        int digito =n %10;

        invertido =invertido*10 +digito;

        n=n/10;
    }
    return invertido;
}
public static boolean esCapicua(int n){

    int invertido =invertirNumero(n);

    return invertido==n;
}
public static void main(String[] args) {

    System.out.println("ingresa un numero que quieras que sea invertido:");

    int n = entrada.nextInt();

    int invertido = invertirNumero(n);

    boolean resultado = esCapicua(n);

    System.out.println("el numero original es "+n);

    if (resultado) {

        System.out.println("su numero es capicau" + invertido);

    }else{

        System.out.println("su numero no es capicau"+invertido);

    }
}
}