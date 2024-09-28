import java.util.Scanner;

class TempConvertor {
    public static void main(String[] args) {
        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your choice (\n1 - Fahrenheit to Celsius \n2 - Celsius to Fahrenheit): ");
        int a = in.nextInt();  
        switch (a) {
            case 1: 
                System.out.println("Enter temperature in Fahrenheit: ");
                temperature = in.nextDouble();  // Use nextDouble for better precision
                temperature = ((temperature - 32) * 5) / 9;
                System.out.println("Temperature in Celsius = " + temperature);
                break;  
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = in.nextDouble();  // Use 'in' instead of 'scanner'
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;  
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        in.close();  // Close the scanner
    }
}
