package HomeWork;

import java.util.Scanner;

public class Baitap05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính của đường tròn:");
        double radius = scanner.nextDouble();

        final double PI = Math.PI;

        double circumference = 2 * PI * radius;

        double area = PI * radius * radius;

        System.out.println("Chu vi của đường tròn: "+ circumference);
        System.out.println("Diện tích của đường tròn: "+ area);

        scanner.close();
    }
}
