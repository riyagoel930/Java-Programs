public class Average {

    public static void printAverage(double num1, double num2, double num3, double num4, double num5) {
        double sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5;

        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        printAverage(10, 20, 30, 40, 50);
    }
}