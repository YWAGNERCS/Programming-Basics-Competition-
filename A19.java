import javax.swing.*;

public class A19 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce un texto:");
        System.out.println(mostRepeatedVowel(input));
    }

    public static String mostRepeatedVowel(String text) {
        int[] counts = new int[5];  // Contadores para a, e, i, o, u
        for (char c : text.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a': counts[0]++; break;
                case 'e': counts[1]++; break;
                case 'i': counts[2]++; break;
                case 'o': counts[3]++; break;
                case 'u': counts[4]++; break;
            }
        }

        int max = 0;
        for (int count : counts) max = Math.max(max, count);
        
        if (max == 0) return "[]"; // Si no hay vocales

        StringBuilder result = new StringBuilder();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == max) result.append(vowels[i]).append(" ");
        }

        return "[" + result.toString().trim() + "]";
    }
}

