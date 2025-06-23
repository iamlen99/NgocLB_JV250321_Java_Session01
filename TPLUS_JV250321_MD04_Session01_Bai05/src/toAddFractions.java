import java.util.Scanner;

public class toAddFractions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tử số của phân số thứ nhất:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mẫu số của phân số thứ nhất:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tử số của phân số thứ hai:");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mẫu số của phân số thứ hai:");
        int d = Integer.parseInt(scanner.nextLine());
        int numerator  = a*d + b*c;
        int denominator = b*d;
        System.out.printf("Kết quả: %d/%d", numerator, denominator);
    }
}
