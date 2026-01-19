import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sumHours = 0;
        int sumMinutes = 0;

        while (true) {
            System.out.println("Geben Sie eine neue Zahl ein oder ‚summ‘ – um die Summe zu berechnen und das Programm zu beenden.");
            if (!scanner.hasNextDouble()) {
                String command = scanner.next();
                if ("summ".equalsIgnoreCase(command)) {
                    System.out.println("Gesamtsumme: " + sumHours + " часов " + sumMinutes + " минут");
                    break;
                }

                else {
                    System.out.println("Ungültiger Befehl. Verwenden Sie ‚summ‘.");
                }
            } else {
                double number = scanner.nextDouble();
                int hours = (int) number;
                sumHours += hours;

                int minutes = (int) Math.round((number - hours) * 100);
                sumMinutes += minutes;

                if (sumMinutes >= 60) {
                    sumHours += sumMinutes / 60;
                    sumMinutes = sumMinutes % 60;
                }
            }
        }
    }
}























