public class A25 {
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
