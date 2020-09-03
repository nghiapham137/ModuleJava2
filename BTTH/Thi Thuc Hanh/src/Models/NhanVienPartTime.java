package Models;

public class NhanVienPartTime extends NhanVien {
    private double gioLamviec;

    public NhanVienPartTime(int idNhanvien, String hoTen, int tuoi, int sdt, String email, double gioLamviec) {
        super(idNhanvien, hoTen, tuoi, sdt, email);
        this.gioLamviec = gioLamviec;
    }

    public double getGioLamviec() {
        return gioLamviec;
    }

    public void setGioLamviec(double gioLamviec) {
        this.gioLamviec = gioLamviec;
    }

    public double getLuongthuclinh() {
        double luongThucLinh = gioLamviec * 100000;
        return luongThucLinh;
    }

    @Override
    public String toString() {
        return "Nhân viên PartTime: " + getHoTen() + "\n"
                + "id: " + getIdNhanvien() + "\n"
                + "Tuổi: " + getTuoi() + "\n"
                + "Số điện thoại: " + getSdt() + "\n"
                + "Email: " + getEmail() + "\n"
                + "Giờ làm việc: " + gioLamviec + "\n"
                + "Lương thực lĩnh: " + getLuongthuclinh();
    }
}
