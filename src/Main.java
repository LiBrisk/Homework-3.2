public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int bmiIndex = bmiService.calculate(75.5, 1.75);
        System.out.println("BMI index: " + bmiIndex);
    }
}