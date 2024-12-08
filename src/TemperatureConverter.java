import java.util.Scanner;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        // The formula for converting Fahrenheit to Celsius is (°F - 32) × 5/9.
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        // The formula for converting Celsius to Fahrenheit is (°C × 9/5) + 32.
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        // Create a new Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        // Read the user's choice.
        int option = scanner.nextInt();

        // Handle the user's choice.
        if (option == 1) {
            // Convert Celsius to Fahrenheit.
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = converter.celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        } else if (option == 2) {
            // Convert Fahrenheit to Celsius.
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = converter.fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        }

        scanner.close();
    }
}