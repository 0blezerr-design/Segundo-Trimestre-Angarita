import java.util.Scanner;

public class while7 {
    static void main(String[] args) {
        //Cree un programa que muestre el promedio de n,numero
        // dejandose de solicitar numeros cuando se introduzca el 0
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        double promedio = 0;
        int suma = 0;
        while (true) {
            System.out.println("ingrese numeros");
            int numeros = entrada.nextInt();

            if (numeros == 0) {
                break;
            }
            suma +=numeros;
            i++;
        }
        promedio=(double)suma/i;
        System.out.println("su promedio de notas es"+promedio);
    }
}