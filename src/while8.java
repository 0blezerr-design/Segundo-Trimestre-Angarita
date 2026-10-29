import java.util.Scanner;

public class while8 {
    static void main() {
    //cree un programa que calcule la suma de
    // los cuadrados de los numeros entre 1 y n
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese el rango el rango de numeros ");
        int numero=entrada.nextInt();
        int i=1;
        int suma=0;
        double cuadrado =0;
        while (i<=numero){
            suma=suma+i*i;
            i++;
        }

    }
}
