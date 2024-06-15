package RA;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        /*
        * 1. Khai báo và khởi tạo đối tượng Scanner (java.util.Scanner)
        * 2. Thông báo nhập dư liệu (sử dụng các câu lệnh output)
        * 3. lấy dữ liệu nhập từ bàn phím (các phương thc của Scanner: nextLine(), nextLine()...) và
        *
        * */
        //1. Khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);
        //2. Thông báo nhập
        System.out.println("Nhập vào mã sinh viên");
        //3. Lấy dữ liệu từ bàn phím và lưu vào biến
        String studentId = scanner.nextLine();
        // Nhập tên sinh viên
        System.out.println("Nhập tên sinh viên:");
        String studentName = scanner.nextLine();
        // Nhập vào tuổi sinh viên
        System.out.println("Nhập vào tuổi sinh viên:");
        int age = scanner.nextInt();
        //C1: Xóa enter
        //scanner.nextLine();
        //C2: coi như lấy dữ liệu vào là chuỗi rồi chuyển sang kiểu dữ liệu mong muốn
        /*
        * String --> int: Integer.pareInt("String")
        * String --> float: Float.pareFloat("String")
        * Sting --> double: Double.pareDouble("String")
        * String --> boolean: Boolean.pareBoolean("String")
        * */
        //Nhập vào địa chỉ sinh viên
        System.out.println("Nhập vào địa chỉ sinh viên:");
        String address = scanner.nextLine();
        //Nhập vào điểm sinh viên
        System.out.println("Nhập vào điểm trung bình sinh viên");
        float avgMark = Float.parseFloat(scanner.nextLine());





        // Thông tin sinh viên
        System.out.println("Mã sinh viên: "+ studentId);
        System.out.println("Tên sinh viên: "+ studentName);
        System.out.println("Tuổi sinh viên: "+ age);
        System.out.println("Địa chỉ sinh viên: "+ address);
        System.out.println("Điểm TB: "+avgMark);



    }
}
