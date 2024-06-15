package RA;

public class OutputDemo {
    public static void main(String[] args) {
        //1. In chuỗi và xuống dòng
        System.out.println("Rikkei  Academy chào đón cadc bạn lớp JV240416");
        //2. In chuỗi và không xuống dòng (con trỏ nằm ở cuối dòng)
        System.out.println("Chúc các bạn thành công");
        //3. System.out.printf("Control String", Value1, Value2...)
        String studentName = "Phuong Thu";
        int age = 26;
        float md1Mark = 4.9F;
        //-- In ra thông tin sinh viên với 1 câu lệnh
        // \n: xuống dòng
        // \t: lùi vào 1 tab
        System.out.printf("\nSinh viên %s với tuổi %d\t có đểm module 01 là: %f", studentName, age, md1Mark);
        //4. System.err.println("String"): in nội dung lỗi
        System.err.println("Đã có lỗi xảy ra trong chương trình");

    }
}