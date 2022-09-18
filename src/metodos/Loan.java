package metodos;

import java.util.Scanner;

public class Loan {
    public Loan() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digit loan value: ");
        double loanValue = scan.nextDouble();

        System.out.print("Digit loan installments: ");
        int installmentsValue = scan.nextInt();

        System.out.print("Digit loan interest: ");
        double interestValue = scan.nextDouble();

        System.out.printf("Total: %.2f", calcTotalLoan(loanValue, interestValue, installmentsValue));

        System.exit(0);
    }

    public double calcTotalLoan(double value, double interest, int installment) {
        double interestValue = 0;
        for (int i = 1; i < installment; i++) {
            interestValue += value * (interest / 100);
        }

        return value + interestValue;
    }
}
