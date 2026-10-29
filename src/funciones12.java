import java.util.Scanner;

public class funciones12 {
    //Crear
    //boolean esPerfecto(int n) y mostrar los números perfectos entre 1 y 1000.
    //Un número perfecto es aquel que es igual a la suma de sus divisores propios (todos
    //sus divisores menores que él). Ejemplos: 6 es perfecto porque 1 + 2 + 3 = 6; 28 también,
    //porque 1 + 2 + 4 + 7 + 14 = 28. El 8 no lo es: 1 + 2 + 4 = 7. (acumulador + boolean)

 public static boolean esPerfecto(int n){
   int suma= 0;
     for (int i = 1; i <n; i++) {
         if (n% i==0){
             suma+=i;
         }

     }
   return suma==n;
 }
void main(String[] args) {
    for (int n = 1; n <=1000 ; n++) {


    boolean resultado=esPerfecto(n);

    if(resultado) {
        System.out.println(n);
    }
    }
    }
}