import java.util.Scanner;
import java.lang.Math;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides for the polygon:");
        int n = scanner.nextInt();

        // Step 2: Calculate the angle B
        double B = 360.0 / n;

        // Step 3: Calculate the angle A
        double A = 0.5 * B;

        // Step 4: Calculate the length of 1 triangle base s
        double s = 2 * Math.sin(Math.toRadians(A));

        // Step 5: Get the polygon perimeter p
        double p = n * s;

        // Step 6: Estimate PI
        double PI = p / 2;

        System.out.println("Estimated value of PI is: " + PI);
    }
}

