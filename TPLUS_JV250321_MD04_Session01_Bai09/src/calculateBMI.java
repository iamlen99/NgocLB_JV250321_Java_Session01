import java.util.Scanner;
public class calculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cân nặng(kg):");
        int weight = Integer.parseInt(input.nextLine());
        System.out.println("Nhập chiều cao(m):");
        float height = Float.parseFloat(input.nextLine());
        float bmi = weight / (height * height);
        System.out.printf("Chỉ số BMI = %.2f\n", bmi);
    }
}
