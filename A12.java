import javax.swing.*;

public class A12 {
    public static void main(String[] args) {
        String tipo = JOptionPane.showInputDialog("Figura (SQUARE o TRIANGLE):").toUpperCase();
        int size = Integer.parseInt(JOptionPane.showInputDialog("Tamaño:"));

        StringBuilder sb = new StringBuilder();
        if (tipo.equals("SQUARE"))
            for (int i = 0; i < size; i++) sb.append("*".repeat(size)).append("\n");
        else if (tipo.equals("TRIANGLE"))
            for (int i = 1; i <= size; i++) sb.append("*".repeat(i)).append("\n");
        else
            sb.append("Tipo inválido.");

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
