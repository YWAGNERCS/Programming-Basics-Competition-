/*
 * Ingresar 4 notas de un alumno y mostrar la mejor nota.
Validación:  
nota 1: 18
nota 2: 13
nota 3: 10
nota 4: 15
RPTA: La nota mayor es 18
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        int[] notas={18,13,10,15};
        int mayor=notas[0];
        for (int i = 1; i < notas.length; i++) {
            if(mayor<notas[i]){
                mayor=notas[i];
            }
        }
        System.out.println("La nota mayor es "+mayor);
    }
}
