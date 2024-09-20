//import stuff here!
import java.util.Scanner;
//Your code here
 class Program6 {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Constant value for Pi
        final double PI = 3.14159;

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the diameter
        double diameter = 2 * radius;

        // Calculate the circumference
        double circumference = 2 * PI * radius;

        // Calculate the area
        double area = PI * radius * radius;

        // Print the results, formatted to three decimal places
        System.out.printf("Radius: %.3f\n", radius);
        System.out.printf("Diameter: %.3f\n", diameter);
        System.out.printf("Circumference: %.3f\n", circumference);
        System.out.printf("Area: %.3f\n", area);
    }
}
//Paste console output below:
/*


*/
