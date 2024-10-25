package programas;
public class Programa04 {
    public static void main(String[] args) {
    //declarar variables
    int f,c,cem;
    double sv,pv;
    double mventa[][]=new double[3][3];
    
    //entrada
        for ( f = 0; f < mventa.length; f++) {
            for ( c = 0;  c < mventa[0].length; c++) {
                mventa[f][c]=Math.random()*9001 +1000;
            }
        }
        //proceso
        sv=0.0;
        for ( f = 0; f < mventa.length; f++) {
            for ( c = 0;  c < mventa[0].length; c++) {
                sv+=mventa[f][c];
            }
        }
        cem=mventa.length*mventa[0].length;
        pv=sv/cem;
        //salida
        System.out.println("El total de ventas es: " +sv);
        System.out.println("El promedio de ventas es: " +pv);
    }
}
