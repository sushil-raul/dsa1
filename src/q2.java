import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25.0) {
            category = "Normal Weight";
        } else if (bmi < 30.0) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.println("Your BMI is: " + bmi);
        System.out.println("Category: " + category);
    }
}
