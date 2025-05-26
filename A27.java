public class A27 {
    public static void main(String[] args) {
        int[] notas={18,13,10,15};
        int mayor=notas[0];
        for (int i = 1; i < notas.length; i++) {
            if(mayor<notas[i]){
                mayor=notas[i];
            }
        }
        System.out.println("La nota mayor es "+mayor);
    }
}
