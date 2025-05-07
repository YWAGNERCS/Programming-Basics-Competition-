import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class A14 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce los números (ej. 4, 6, 1, 8, 2):");
        String[] nums = input.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String num : nums) list.add(Integer.parseInt(num.trim()));

        boolean asc = JOptionPane.showInputDialog("Ascendente (Sí/No):").equalsIgnoreCase("Sí");
        JOptionPane.showMessageDialog(null, "Ordenado: " + sort(list, asc));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> list, boolean asc) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((asc && list.get(i) > list.get(j)) || (!asc && list.get(i) < list.get(j))) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
