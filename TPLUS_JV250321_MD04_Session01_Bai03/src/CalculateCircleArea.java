import java.util.Scanner;

public class CalculateCircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn");
        float circleRadius = Float.parseFloat(scanner.nextLine());
        float pi = (float) Math.PI;
        float circleArea  = pi * (float)Math.pow(circleRadius, 2);
        System.out.printf("Diện tích: %.2f", circleArea);

    }
}
