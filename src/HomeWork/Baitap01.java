package HomeWork;

import java.util.Scanner;

public class Baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên người dùng:");
        String name = scanner.nextLine();
        System.out.println("Hello: "+ name);

        scanner.close();
    }
}
