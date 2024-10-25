package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
    //declarar variables
    int f,c;
    double venta,sv;
    double mventa[][]=new double[4][4];
    Scanner lectura=new Scanner(System.in);
    //entrada
        for ( f = 0; f < mventa.length; f++) {
            for ( c = 0;  c < mventa[0].length; c++) {
                System.out.print("Ingresar venta: ");
                venta=lectura.nextDouble();
                mventa[f][c]=venta;
            }
        }
        //proceso
        sv=0.0;
            for ( f = 0; f < mventa.length; f++) {
            for ( c = 0;  c < mventa[0].length; c++) {
                sv+=mventa[f][c];
            }
        }
        //salida
        System.out.println("El total de ventas es: " +sv);
    }
}
