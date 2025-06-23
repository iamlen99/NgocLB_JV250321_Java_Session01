import java.time.Year;
import java.util.Scanner;

public class findYearOfBirth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(input.nextLine());
        boolean isValidAge = age >= 0;
        int birthYear = Year.now().getValue() - age;
        System.out.printf(isValidAge ? "Năm sinh = %d" : "Số tuổi không hợp lệ",  birthYear);
    }
}
