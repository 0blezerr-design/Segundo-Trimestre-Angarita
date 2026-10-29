import java.util.Scanner;

public class funcional14 {
    //Leer palabras en main con un ciclo; si el usuario escribe "q", salir con un
    //if y break.
    //Por cada palabra, mostrar su longitud y la cantidad de vocales usando
    //contarVocales.(bandera + break + funciones)

// esta funcion sirve para tener un es caner en todas las funciones posteriores

    static Scanner entrada =new Scanner(System.in);

 // creamos una funcion que me permita contar las vocales

    public static int cantidadDeVocales (String letra){

      int contador=0;

       //creamos un for dentro de la funcion con letra.lenght que hace que tomemos la longitud de la
        //palabra anteriror mente
        contador=0;
        for (int i = 0; i <letra.length() ; i++) {

            // esto nos permite también leer las mayusculas y mínusculas
            char carecter=Character.toLowerCase(letra.charAt(i));

            // esta bandera nos hace que si la palabra (letra) mostrara la cantidad de bocales que hay
             boolean esVocal=carecter=='a'||carecter=='e'||carecter=='i'||carecter=='o'||carecter=='u';

             if (esVocal){
                 //si la toma algunas de las vocales tomara este (if) y contara una vocal
                 contador ++;
             }
        }
        //este return hace que nos de la la cantidad de vocales que se hizo en el for
        return contador;
    }

    static void main(String[] args) {


        //este while estara infinitamente hasta que una condición dentro de ella haga salir
        while(true){
            System.out.println("ingresa tu palabras ");

            //hace que ingresemos una letras-frase
            String letras =entrada.nextLine();

            //si la frase tiene una q auntomaticamnete entrara en la condicion para el ciclo
            // y seguiura el proceso, de lo contrario seguida el cucle
            if (letras.equals("q")){
                // esta condición compare si encuntra el programa sigue
                System.out.println("se encontro la palabra ");

                System.out.println("la longitud de su letra es "+letras.length());
                break;
            }
        }

        System.out.println();

    }
}
