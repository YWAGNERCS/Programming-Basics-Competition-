/*
 * Calcular el total que una persona debe pagar en una llantera, si el precio de cada llanta 
 * es de S/ 800 si se compran menos de 5 llantas y de S/ 700 si se compran 5 o más.
Validación
Ingrese la cantidad de llantas 1 : 5
Ingrese la cantidad de llantas 2 : 54 
RPTA1 : 5x Llantas, Total: 3500, 700 c/u
RPTA2: 4x Llantas, Total: 3200, 800 c/u
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        int cantidad=4;
        int total=0;
        if (cantidad>=5) {
            total=cantidad*700;
        }else{
            total=cantidad*800;
        }
        System.out.println(cantidad+"x Llantas, Total: "+total);
    }
}
