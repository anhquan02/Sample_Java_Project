import java.util.ArrayList;
import java.util.Scanner;

public class ChucNang {

    private ArrayList<Student> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    ChucNang() {

    }

    public void nhap() {
        System.out.println("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ma sv: ");
        String masv = sc.nextLine();
        System.out.println("Nhap chuyen nganh: ");
        String chuyenNganh = sc.nextLine();

        Student student = new Student(hoTen, tuoi, masv, chuyenNganh);
        list.add(student);

    }

    public void xuat() {
        System.out.println("Danh sach sinh vien:");
        for (Student x : list) {
            System.out.println(x.toString());
        }
    }

}
