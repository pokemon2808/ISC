import java.util.Scanner;
public class project20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double radius = scanner.nextDouble();

        double area = calculateSphereSurfaceArea(radius);
        System.out.println("Luas bola adalah: " + area);
    }

    public static double calculateSphereSurfaceArea(double radius) {
        double pi = Math.PI;
        return 4 * pi * Math.pow(radius, 2);
    }
}