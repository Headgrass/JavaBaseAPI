public class ThousandSimpleDigits {
    public static void main(String[] args) {
        digits(1, 1000);

    }

    public static void digits(int x, int y) {
        while (x < y) {
            if (simple(x)) {
                System.out.println(x);
                x++;
            }
            x++;
        }
    }

    public static boolean simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}