/*
 * Determinar si un alumno aprueba o reprueba un curso sabiendo que aprobara si su promedio de tres calificaciones es mayor o igual a 17; reprueba en caso contrario.
validación
primera nota: 18
segunda nota: 17
tercera nota:19
RPTA: Aprobado con 18.0
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        int n1=18;
        int n2=17;
        int n3=19;
        double prom=(n1+n2+n3)/3;
        if (prom>=17){
            System.out.println("Aprobado con "+prom);
        }else{
            System.out.println("Desaprobado con "+prom);
        }
    }
}
