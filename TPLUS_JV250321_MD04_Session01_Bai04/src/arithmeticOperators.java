public class arithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.printf("a = %d và b = %d\n", a, b);
        System.out.printf("Tồng 2 số a+b = %d\n", sum);
        System.out.printf("Hiệu 2 số a-b = %d\n", difference);
        System.out.printf("Tích 2 số a*b = %d\n", product);
        System.out.printf("Thương 2 số a/b = %d\n", quotient);
        System.out.printf("Số dư khi chia số a cho b = %d\n", remainder);
    }
}
