/*
 * Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso actual. Diseñar un algoritmo para este propósito
   (recuerda que para calcular el porcentaje puedes hacer una regla de 3).
validacion :
Ingresa la cantidad de niños : 20
Ingrese la cantidad de niñas: 30
RPTA:
Porcentaje niños: 40.0%
Porcentaje niñas: 60.0%
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        int hombres=20;
        int mujeres=30;
        double porcentajeHombres=(hombres*100)/50;
        double porcentajeMujeres=(mujeres*100)/50;
        System.out.println("Porcentaje niños: "+porcentajeHombres+"%");
        System.out.println("Porcentaje niñas: "+porcentajeMujeres+"%");
    }
}
