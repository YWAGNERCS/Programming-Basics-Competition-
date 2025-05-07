import javax.swing.*;

public class A20 {
    public static void main(String[] args) {
        String url = JOptionPane.showInputDialog("Introduce una URL con parámetros:");
        System.out.println(extractParameters(url));
    }

    public static String extractParameters(String url) {
        String[] parts = url.split("\\?");  // Divide en dos partes: la base y los parámetros
        if (parts.length < 2) return "[]";  // Si no hay parámetros

        String[] params = parts[1].split("&");  // Separa los parámetros por "&"
        StringBuilder result = new StringBuilder();
        
        for (String param : params) {
            String[] keyValue = param.split("=");  // Separa clave y valor
            if (keyValue.length > 1) {
                result.append(keyValue[1]).append("\n");
            }
        }
        
        return result.length() == 0 ? "[]" : result.toString().trim();
    }
}
