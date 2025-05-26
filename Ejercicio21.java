/*
 * Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
 * La función recibirá el mes y el año y retornará verdadero o falso.
 (13 de marzo de 2023 NO es viernes)
 (13 de enero de 2023 es viernes)
 */

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejemplo21 {
    public static void main(String[] args) {
        boolean estado=verificarViernes(2023,03);
        System.out.println(estado);
        if (estado) {
            System.out.println("HAY VIERNES 13");
        }else{
            System.out.println("ESTAS A SALVO");
        }
    }

    public static Boolean verificarViernes(int anio,int mes){
        LocalDate fecha=LocalDate.of(anio,mes,13);
        if (fecha.getDayOfWeek()==DayOfWeek.FRIDAY) {
            return true;
        }else{
            return false;
        }
    }
}
