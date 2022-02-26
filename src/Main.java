import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ChucNang cn = new ChucNang();

        do {
            System.out.println("----------------------------------------");
            System.out.println("1. Nhap SV");
            System.out.println("2. Xuat SV");
            System.out.println("0. Thoat");
            System.out.println("----------------------------------------");

            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    cn.nhap();
                    break;
                case 2:
                    cn.xuat();
                    break;
                case 0:
                    System.out.println("Hen gap lai");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai gia tri:");
                    break;
            }
        } while (true);
    }
}
