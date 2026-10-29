import java.util.Scanner;

public class while4 {
    static void main(String[] args) {
        //cree un programa que muestre los numeros impares entre 1 y n
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese su numero");
        int numero=entrada.nextInt();
        int i=1;
        while (i<=numero){
            System.out.println(i);
            i++;
            if (i%2==0) {
                System.out.println("el numero es impar");
            }else{
                System.out.println("el numero es par");
            }
        }
    }
}
