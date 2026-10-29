import java.util.Scanner;

public class funciones10 {
    // Crear int sumaPares(int n) que devuelva la suma de los pares de 1 a n.
    //(acumulador)
    static Scanner entrada = new Scanner(System.in);

    public static int sumaPares(int n){
        int acomuladora=0;

        for (int i = 1; i <=n ; i++) {
            if(i%2==0){
                acomuladora++;
            }


        }
        return acomuladora;
    }

    static void main() {
        System.out.println("ingresa tu numero");
        int n = entrada.nextInt();

        int acomulacion=sumaPares(n);

        System.out.println("los numero pares entre 1 y"+n+",y la suma de los numeros pares es "+acomulacion);



    }
}
