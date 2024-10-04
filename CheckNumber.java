import java.util.Scanner;

class CheckNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Find the largest of three numbers");
        System.out.println("2. Check if all three numbers are equal");

        int choice = in.nextInt();
        switch (choice) {
            case 1:
                // Logic to find the largest of three numbers
                int x, y, z;
                System.out.println("Enter three integers: ");
                x = in.nextInt();
                y = in.nextInt();
                z = in.nextInt();

                if (x > y && x > z) {
                    System.out.println("First number is largest.");
                } else if (y > x && y > z) {
                    System.out.println("Second number is largest.");
                } else if (z > x && z > y) {
                    System.out.println("Third number is largest.");
                } else {
                    System.out.println("Entered numbers are not distinct.");
                }
                break;

            case 2:
                System.out.println("Enter three integers: ");
                x = in.nextInt();
                y = in.nextInt();
                z = in.nextInt();

                // Use a boolean condition to check if all numbers are equal
                boolean allEqual = (x == y && y == z);

                if (allEqual) {
                    System.out.println("All three numbers are equal.");
                } else {
                    System.out.println("The numbers are not equal.");
                }
                break;

            default:
                System.out.println("Invalid option! Please choose either 1 or 2.");
        }
    }
}
