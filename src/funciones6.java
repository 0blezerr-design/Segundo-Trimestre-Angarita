import java.util.Scanner;

public class funciones6 {
    //Crear un boolean esMayorDeEdad(int edad) y usar un if en main para mostrar
    // "puedo votar" o "No puedo votar"
    static Scanner entrada= new Scanner(System.in);

    public static boolean esMayorDeEdad(int edad){
        return edad <=18;
    }

    static void main(String[] args) {
        System.out.println("ingresa su edad");
        int edad=entrada.nextInt();
        boolean resultado=esMayorDeEdad(edad);
        if (resultado){
            System.out.println("eres mayor de edad puedes votar");
        }else{
            System.out.println("lo siento todavia eres menor de edad, no puedes votar");
        }
    }
}
