public class Utils {
    public static void main(String[] args) {
        System.out.println("strConcat: " + concatenateWords("a", "b") + ". resFact: " + computeFactorial(5));
    }

    public static int computeFactorial(int i) {
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
