/*
 * Algoritmo que lea dos números, calculando y escribiendo el valor de su 
 * suma, resta, producto y división.
 */

import javax.swing.JOptionPane;

public class Ejercicio23 {
    public static void main(String[] args) {
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa primer numero: "));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa segundo numero: "));
        int suma=numero1+numero2;
        int resta=numero1-numero2;
        int producto=numero1*numero2;
        double division=numero1/numero2;
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Producto: "+producto);
        System.out.println("División: "+division);
    }
}
