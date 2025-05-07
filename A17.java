import javax.swing.*;

public class A17 {
    public static void main(String[] args) {
        String binario1 = JOptionPane.showInputDialog("Introduce el primer número binario:");
        String binario2 = JOptionPane.showInputDialog("Introduce el segundo número binario:");

        JOptionPane.showMessageDialog(null, "Número binario 1: " + binario1 + " -> Decimal: " + binaryToDecimal(binario1));
        JOptionPane.showMessageDialog(null, "Número binario 2: " + binario2 + " -> Decimal: " + binaryToDecimal(binario2));
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        
        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, length - i - 1);
            }
        }
        return decimal;
    }
}
