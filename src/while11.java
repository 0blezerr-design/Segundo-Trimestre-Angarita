import java.util.Scanner;

public class while11 {
    static void main() {
        //decir si un numero es capicúa(1231), invirtiéndolo con 10% y /10
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su numero ");
    int numero= entrada.nextInt();
    int original=numero;
        //la variable original guarda el número que introdujo el usuario,
        // porque se modifica en el ciclo
    int invertido=0;
        //empieza en cero porque todavía no hemos cosnt
    while (numero>0){
     int digito =numero % 10;
     invertido = invertido * 10 + digito;
     numero = numero /10;
        System.out.println();
    }
    }
}
