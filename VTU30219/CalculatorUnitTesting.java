import java.util.Scanner;

public class CalculatorUnitTesting {

    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();

        boolean passed = false;

        if (operator.equals("+")) {
            passed = (add(a, b) == a + b);
        } else if (operator.equals("/")) {
            if (b != 0) {
                passed = (divide(a, b) == a / b);
            }
        }

        if (passed)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        sc.close();
    }
}