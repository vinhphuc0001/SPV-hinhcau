package N20DCVT038_OOP_TH4_04;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the radius
        System.out.print("Nhap ban kinh cua hinh cau: ");
        double banKinh = scanner.nextDouble();

        // Create a HinhCau object
        HinhCau hinhCau = new HinhCau(banKinh);

        // Calculate and print the area, perimeter, and volume of the sphere
        System.out.println("Dien tich cua hinh cau: " + hinhCau.tinhDienTich());
        System.out.println("Chu vi cua hinh cau: " + hinhCau.tinhChuVi());
        System.out.println("The tich cua hinh cau: " + hinhCau.tinhTheTich());

        // Close the scanner
        scanner.close();
    }
}