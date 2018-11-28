public class Utils {
    public static int computeFactorial(int i) {
        if (i <= 0)
            throw new ArithmeticException();
        if (i == 1) {
            return 1;
        }
        i *= computeFactorial(i - 1);
        return i;
    }

    public static String concatenateWords(String a, String b) {
        return a.concat(b);
    }
}
