import java.util.Scanner;

public class while12 {
    static void main(String[] args) {
        //leer precios hasta un negativo y mostrar el total y el promedio
        Scanner entrada =new Scanner(System.in);
        System.out.println("ingrese su productos");
        double total=0;
        double promedio=0;
        int contador =0;

        while (true){
           int producto=entrada.nextInt();
           if (producto<0){
               break;


           }
            total=total+producto;
            contador++;
        }
        System.out.println("el total de productos "+ total);
        promedio=(double)total/contador;
    }
}
