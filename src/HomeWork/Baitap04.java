package HomeWork;

import java.util.Scanner;

public class Baitap04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Toán:");
        double mathScore = scanner.nextDouble();

        System.out.println("Nhập vào điểm môn Văn:");
        double literatireScore = scanner.nextDouble();

        System.out.println("Nhập vào điểm môn Anh:");
        double englishScore = scanner.nextDouble();

        double totalScore = mathScore + literatireScore + englishScore;

        double averageScore  = totalScore / 3;

        System.out.println("Tổng điểm 3 môn: "+ totalScore);
        System.out.println("Điểm trung bình 3 môn: "+ averageScore);

        scanner.close();
    }
}
