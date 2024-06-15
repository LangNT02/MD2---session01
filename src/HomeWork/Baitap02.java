package HomeWork;

import java.util.Scanner;

public class Baitap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị tiền USD:");
        double amountInUSD = scanner.nextDouble();

        System.out.println("Nhập tỷ giá chuyển đổi từ USD sang VND:");
        double exchangeRate = scanner.nextDouble();

        double amountInVND = amountInUSD * exchangeRate;

        System.out.println("Hiển thị giá trị tiền VND: "+ amountInVND);

        scanner.close();
    }
}
