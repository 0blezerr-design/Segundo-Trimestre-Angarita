public class funciones3 {
    //Crear int restar(int a, int b). En main, llamarla como restar (10,4) y
    // luego como restar (4,10), e imprimir ambos resultados para ver que el orden
    //de los argumentos importa
    public static int restar(int a, int b){
        int resultado = a - b;
        return resultado;
    }

    static void main() {
        System.out.println("el orden de los factores si importa");
        int resultado1=restar(10,4);
        System.out.println("10 - 4 ="+ resultado1);
        int resultado2=restar(4,10);
        System.out.println("4 - 10="+ resultado2);
    }
}
