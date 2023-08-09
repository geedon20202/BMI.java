import java.util.Scanner;

class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String bmiCategory = categorizeBMI(bmi);

        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Category: " + bmiCategory);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return (weight / (height * height))* 10000;
    }

    public static String categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}