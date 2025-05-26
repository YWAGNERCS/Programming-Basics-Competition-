import java.time.DayOfWeek;
import java.time.LocalDate;

public class A21 {
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
