import metodos.Calculator;
import metodos.DayMessage;
import metodos.Loan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to DIO exercises projects!!");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digit the project name:");
        String projectName = scan.nextLine();

        switch (projectName) {
            case "calculator":
                new Calculator();
                break;
            case "day-message":
                new DayMessage();
                break;
            case "loan":
                new Loan();
            default:
                System.out.println("This project not found.");
        }
    }
}