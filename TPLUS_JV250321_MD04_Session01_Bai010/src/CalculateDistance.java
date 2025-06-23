import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vận tốc(km/h):");
        float speed = Float.parseFloat(input.nextLine());
        System.out.println("Nhập thời gian(giờ):");
        float time = Float.parseFloat(input.nextLine());
        float distance = time * speed;
        System.out.printf(speed < 0 || time < 0 ? "Thời gian hoặc vận tốc không được nhỏ hơn 0" : "Quãng đường = %.0f (km)", distance);
    }
}
