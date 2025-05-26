/*
 * Dado un número natural de dos cifras, diseñe un algoritmo que permita obtener el número invertido. Ejemplo si se ingresa 23 que se muestre 32.
validación :
Ingresa un número natural de dos cifras:  45
45 -->  54
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        int numero=45;
        int invertido=numero%10*10+numero/10;
        System.out.println(invertido);

    }
}