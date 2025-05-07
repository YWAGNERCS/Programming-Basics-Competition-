public class A15 {
    public static void main(String[] args) {
        thirtyLeapYears(1999);
    }

    public static void thirtyLeapYears(int startYear) {
        for (int i = 0, year = startYear + (startYear % 4 == 0 ? 4 : 4 - startYear % 4); i < 30; year += 4) {
            System.out.print(year + " ");
            i++;
        }
    }
}
