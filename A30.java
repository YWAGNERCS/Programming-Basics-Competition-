public class A30 {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        if (num1%num2==0){
            System.out.println(num1+" es divisible por "+num2);
        }else{
            System.out.println(num1+" no es divisible por "+num2);
        }

        if (num2%num1==0) {
            System.out.println(num2+" es divisible por "+num1);
        }else{
            System.out.println(num2+" no es divisible por "+num1);
        }

        if (num1==num2){
            System.out.println(num1+"y"+num2+" son iguales");
        }else if (num1>num2) {
            System.out.println(num1+" es mayor que "+num2);
        }else{
            System.out.println(num2+" es mayor que "+num1);
        }

        if(num1%2==0 && num2%2==0){
            System.out.println("Ambos son impares");
        }else{
            System.out.println("Ambos no son impares");
        }
    }
}
