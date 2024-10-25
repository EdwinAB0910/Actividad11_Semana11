package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
    //declarar variables
    int f,c,cem;
    double compra,sc,pc;
    double mcompra[][]=new double[4][4];
    Scanner lectura=new Scanner(System.in);
    //entrada
        for ( f = 0; f < mcompra.length; f++) {
            for ( c = 0;  c < mcompra[0].length; c++) {
                System.out.print("Ingresar el valor de la compra: ");
                compra=lectura.nextDouble();
                mcompra[f][c]=compra;
            }
        }
    //proceso
        sc=0.0;
        for ( f = 0; f < mcompra.length; f++) {
            for ( c = 0;  c < mcompra[0].length; c++) {
                sc+=mcompra[f][c];
            }
        }
        cem=mcompra.length*mcompra[0].length;
        pc=sc/cem;
        //salida
        System.out.println("El valor total de compras es: " +sc);
        System.out.println("El promedio de compras es: " +pc);
    }
}
