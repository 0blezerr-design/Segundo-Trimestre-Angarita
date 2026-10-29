import java.util.Scanner;

public class while5 {
    static void main(String[] args) {
//cree un programa que pregunte al usuario si desea salir, si o no si el usuario ingresa s
        Scanner entrada = new
                Scanner(System.in);

        System.out.println("ingrese S si quieres salir del programa si no ingresa N");

        char respuesta='m';

        while (respuesta !='s'){

             respuesta =entrada.next().charAt(0);
            if (respuesta=='s'){

                break;
            }else {
                continue;

            }
        }
    }
}
