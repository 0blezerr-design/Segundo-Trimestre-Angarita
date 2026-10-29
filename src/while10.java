import java.util.Scanner;

public class while10 {
    static void main(String[] args) {
        //leer numeros has que llegue un cero y decir cuando fueron pares
        System.out.println("programa que muestra los numeros");
        Scanner entrada= new Scanner(System.in);
        int i=0;
        int suma=0;
        double contador=0;
        while (true){
            int numeros = entrada.nextInt();
            if (numeros==0){
                break;

            }
            if(numeros%2==0){
                contador++;
            }

        }



        System.out.println("la cantidad de numeros pares son "+ contador );
    }
}
