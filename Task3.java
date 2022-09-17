import java.util.Scanner;
public class Task3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Waga w kilogramach: ");
        double weight = scanner.nextFloat();
        System.out.print("\nWzrost w metrach: ");
        double height = scanner.nextFloat();
        double BMI = weight / (height * height);
        System.out.print("\nTwój Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}