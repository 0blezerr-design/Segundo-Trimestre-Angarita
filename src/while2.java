import java.util.Scanner;

public class while2 {
    static void main(String[] args) {
      //cree un programa que calcule la suma de los numeros primos n numeros naturales
      Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese un numero");

        int numero= entrada.nextInt();
        int i=0;

        while(i<=numero){
            System.out.println(i);
            i++;
            if (i%2==0) {
                System.out.println("su numero es primo");
            }else{
                System.out.println("Su numero no es primo ");
            }
        }
    }
}