public class Student extends Person {
    private String maSv;
    private String chuyenNganh;

    Student() {
        super();
    }

    Student(String hoTen, int tuoi, String maSv, String chuyenNganh) {
        super(hoTen, tuoi);
        this.maSv = maSv;
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return super.toString() + " Ma sv: " + this.maSv + " Chuyen nganh: " + this.chuyenNganh;
    }

}
