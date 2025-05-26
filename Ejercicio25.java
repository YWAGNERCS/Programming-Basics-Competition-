/*
 * Obtener el IGV (18%) de una venta si esta es superior a S/ 150,000.00 aplicar un descuento del 25 %.
validación
Ingresa el valor de venta:  160000
RPTA:
IGV: 28800.0
Descuento: 40000.0
Total: 148800.0
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        int valor=160000;
        double igv=valor*0.18;
        double descuento=valor*0.25;
        double total=valor+igv-descuento;
        System.out.println("IGV: "+igv);
        System.out.println("Descuento: "+descuento);
        System.out.println("Total: "+total);
    }
}
