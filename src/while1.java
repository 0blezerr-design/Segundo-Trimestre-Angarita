import java.util.Scanner;

public class while1 {
    static void main(String[] args) {
        //cree un programa  que muestre los numero naturales de 1 a n
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un el rango de numero ");
        int numero= entrada.nextInt();
        int i = 0;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }
    }
}