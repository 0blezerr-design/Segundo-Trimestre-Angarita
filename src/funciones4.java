import java.util.Scanner;

public class funciones4 {
    //Crear double are Rectaangulo (double base, double altura)
    // que devuelva el are. En main leer la base y la altura y mostrar el resultado (return double dos parametros)
    static Scanner entrada=
            new Scanner(System.in);

    public static double areaRectangulo(double base, double altura) {

        double area = base * altura;

        return area;
    }

    static void main(String[] args) {
        System.out.println("ingrese su base ");

        double base = entrada.nextDouble();

        System.out.println("ingrese su altura ");
        double altura = entrada.nextDouble();

        double area=areaRectangulo(base,altura);

        System.out.println("El su area es "+area);
    }
}
