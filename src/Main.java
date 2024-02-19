//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;
        do {
            System.out.print("Please give measurement in meters: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please reenter a valid number.");
                scanner.next();
            }
            meters = scanner.nextDouble();
        } while (meters < 0);
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;
        System.out.println("Converted measurements:");
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
        scanner.close();
    }
}