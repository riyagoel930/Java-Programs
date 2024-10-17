
public class SquareCheck {

    public static boolean sqr(int num) {
        if (num < 0) {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 25;
        if (sqr(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}