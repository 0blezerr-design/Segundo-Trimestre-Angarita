import java.util.Scanner;

public class while6 {
    static void main(String[] args) {
        //cree un programa que calcule el promedio de 10 numeros
        Scanner entrada =
                new Scanner(System.in);
        System.out.println("Programa que calcula el promedio de 10 notas ");
        double[]numero=new double[10];
        double suma=0;
        int i=0;
        while (i<numero.length){
            System.out.println("ingrese su nota");
            numero[i]=entrada.nextDouble();
            suma+=numero[i];
            i++;
        }
        double promedio= (double)suma/numero.length;
        System.out.println("el promedio de los 10 numeros ingresados son "+promedio);
    }
}
