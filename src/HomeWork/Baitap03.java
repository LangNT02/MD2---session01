package HomeWork;

import java.util.Scanner;

public class Baitap03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh của hình vuông");
        double sideLength = scanner.nextDouble();
        double perimeter = 4 * sideLength;
        double area = sideLength * sideLength;
        System.out.println("Chu vi của hình vuông: "+ sideLength);
        System.out.println("Diện tích của hình vuông: "+ area);

        scanner.close();
    }
}
