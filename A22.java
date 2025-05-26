/*
 * Crea una función que reciba un número decimal y lo trasforme a Octal y Hexadecimal.
 - No está permitido usar funciones propias del lenguaje de programación que realicen esas operaciones directamente..
validación
100 en octal es 144
100 en hexadecimal es 64
960 en hexadecimal es 3C0
 */
public class A22 {
    public static void main(String[] args) {
        int numero=960;
        convertirOctal(numero);
        convertirHexadecimal(numero);
    }

    public static void convertirOctal(int numero){
        String resultado="";
        while (numero>0) {
            int resto=numero%8;
            //System.out.print(resto);
            resultado=resto+resultado;
            numero=numero/8;
        }
        System.out.println(resultado);
    }

    public static void convertirHexadecimal(int numero){
        String resultado="";
        while (numero>0)  {
            int resto=numero%16;
            if (resto==10) {
                resultado="A"+resultado;
            }else if (resto==11) {
                resultado="B"+resultado;
            }else if (resto==12) {
                resultado="C"+resultado;
            }else if (resto==13) {
                resultado="D"+resultado;
            }else if (resto==14) {
                resultado="E"+resultado;
            }else if (resto==15){
                resultado="F"+resultado;
            }else{
                resultado=resto+resultado;      
            }
            numero=numero/16;
        }
        System.out.print(resultado);
    }
}
