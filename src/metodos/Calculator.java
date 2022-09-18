package metodos;

import java.util.Scanner;

public class Calculator {
    public Calculator() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digit the operation symbol do you want (add(+), subtract(-), multiply(*) or divide(/)): ");
        String operation = scan.nextLine();

        System.out.print("Digit value 1: ");
        double v1 = scan.nextDouble();

        System.out.print("Digit value 2: ");
        double v2 = scan.nextDouble();

        double result = 0;

        switch (operation) {
            case "+" -> result = this.add(v1, v2);
            case "-" -> result = this.subtract(v1, v2);
            case "*" -> result = this.multiply(v1, v2);
            case "/" -> result = this.divide(v1, v2);
            default -> {
                System.out.println("Symbol not found.");
                System.exit(0);
            }
        }

        System.out.printf("result = %.2f", result);

        System.exit(0);
    }

    public double add(double v1, double v2) {
        return v1 + v2;
    }

    public double subtract(double v1, double v2) {
        return v1 - v2;
    }

    public double multiply(double v1, double v2) {
        return v1 * v2;
    }

    public double divide(double v1, double v2) {
        return v1 / v2;
    }
}
