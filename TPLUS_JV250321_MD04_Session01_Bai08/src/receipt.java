import java.util.Scanner;

public class receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm:");
        String productName = input.nextLine();
        System.out.println("Nhập số lượng sản phẩm:");
        int productQuantity = Integer.parseInt(input.nextLine());
        System.out.println("Nhập giá sản phẩm:");
        float price = Float.parseFloat(input.nextLine());
        float totalPrice = price * productQuantity;
        System.out.println("---- HÓA ĐƠN ----");
        System.out.printf("Tên sản phẩm: %s\n", productName);
        System.out.printf("Số lượng: %d\n", productQuantity);
        System.out.printf("Đơn giá: %.0f\n", price);
        System.out.printf("Thành tiền: %.0f", totalPrice);
    }
}
