import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten = scanner.nextLine();

        System.out.println("Nhap tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap que quan:");
        String que = scanner.nextLine();

        System.out.println("Nhap chuyen nganh: ");
        String nganh = scanner.nextLine();

        System.out.println("Nhap GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.println("Thong tin hoc sinh la: ");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Que quan: " + que);
        System.out.println("Chuyen nganh: " + nganh);
        System.out.println("GPA: " + gpa);
    }
}