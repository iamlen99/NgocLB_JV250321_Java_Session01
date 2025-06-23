import java.util.Scanner;

public class findAreaAndCircumferenceOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập chiều rộng:");
        float width = Float.parseFloat(scanner.nextLine());
        float area = height * width;
        float circumference = (height + width) * 2;
        System.out.printf("Diện tích: %.2f\n", area);
        System.out.printf("Chu vi: %.2f", circumference);
    }
}
