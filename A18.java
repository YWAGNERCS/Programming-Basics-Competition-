import javax.swing.*;

public class A18 {
    public static void main(String[] args) {
        // Pedimos la entrada del usuario con JOptionPane
        String input = JOptionPane.showInputDialog("Introduce un array de números separados por comas (ej. 2, 1, 2, 3, 3, 4, 2, 4):");
        String[] inputArray = input.split(",");
        int[] nums = new int[inputArray.length];

        // Convertimos el input a un array de enteros
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i].trim());
        }

        // Llamamos a la función para encontrar los bumeranes
        numberOfBoomerangs(nums);
    }

    public static void numberOfBoomerangs(int[] array) {
        int count = 0;
        
        // Iteramos por el array buscando bumeranes
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 2] && array[i] != array[i + 1]) {
                // Si encontramos un bumerán, lo imprimimos
                System.out.println("[" + array[i] + ", " + array[i + 1] + ", " + array[i + 2] + "]");
                count++;
            }
        }
        
        // Mostramos la cantidad total de bumeranes
        System.out.println("Total de bumeranes: " + count);
    }
}
