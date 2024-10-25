package programas;
public class Programa03 {
    public static void main(String[] args) {
    //declarar variables
    int f,c;
    double vmay,vmen;
    double mventa[][]=new double[4][4];
    
    //entrada
        for ( f = 0; f < mventa.length; f++) {
            for ( c = 0;  c < mventa[0].length; c++) {
                mventa[f][c]=Math.random()*4991 +10;
            }
        }
        //proceso
        vmay=0.0;
        vmen=9999999;
        for ( f = 0; f < mventa.length; f++) {
            for ( c = 0;  c < mventa[0].length; c++) {
                if (mventa[f][c]>vmay) {
                    vmay=mventa[f][c];
                }
                if (mventa[f][c]<vmen) {
                    vmen=mventa[f][c];
                }
            }
        }
        //salida
        System.out.println("La venta mayor es: " +vmay);
        System.out.println("La venta menor es: " +vmen);
    }
}
