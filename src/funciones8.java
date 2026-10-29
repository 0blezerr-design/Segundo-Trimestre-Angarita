import java.util.Scanner;

public class funciones8 {
    //crear int menorDeDos (int a, int b) que devuelva el menor de dos numeros


    static Scanner entrada= new Scanner(System.in);

    public static int menorDeDos (int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }

    static void main(String[] args) {
        System.out.println("ingrese tu primer numero ");
        int a =entrada.nextInt();
        System.out.println("ingrese su segundo numero ");
        int b = entrada.nextInt();

        int elMenor= menorDeDos(a,b);

        System.out.println("el numero menor es" + elMenor);
    }
}
