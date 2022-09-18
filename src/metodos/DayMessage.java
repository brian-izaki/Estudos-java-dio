package metodos;

import java.util.Scanner;

public class DayMessage {
    public DayMessage() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digit the hour (24h format): ");
        int hour = scan.nextInt();

        System.out.println(this.getGreetingMessage(hour));

        System.exit(0);
    }

    public String getGreetingMessage(int hour) {
        if (hour < 12) return "Good Morning";
        else if(hour < 18) return "Good Afternoon";
        else if (hour <= 24) return "Good Evenning";
        else return "Sorry, I don't know this hour.";
    }
}
