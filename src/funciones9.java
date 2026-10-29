import java.util.Scanner;

public class funciones9 {
    //Crear boolean esMultiplo(int n, int m) y usarla para contar cuántos múltiplos de
    //7 hay entre 1 y 500. (boolean + contador)

     public static boolean esMultiplo(int n, int m){
         return n % m == 0;
     }

     public static int Contador(){

         int multiplos7=0;
         for (int i = 1; i <=500 ; i++) {
             if (esMultiplo(i,7)){
                multiplos7++;
             }
         }
         return multiplos7;
     }

    static void main(String[] args) {

        int resultado = Contador();
        System.out.println("la cantidad de multiplos d 7 entre 1 y 500 es "+resultado);


    }


}
