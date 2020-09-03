package Models;

public class NhanVienFullTime extends NhanVien {

    private double tienThuong;
    private double tienPhat;
    private double luongCung;

    public NhanVienFullTime(int idNhanvien, String hoTen, int tuoi, int sdt, String email,  double tienThuong, double tienPhat, double luongCung) {
        super(idNhanvien, hoTen, tuoi, sdt, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThucLinh() {
        double luongThucLinh = luongCung + (tienThuong - tienPhat);
        return luongThucLinh;
    }


    public String toString() {
        return "Nhân viên fullTime: " + getHoTen() +"\n"
                + "id: " + getIdNhanvien() + "\n"
                + " Lương cứng: " + luongCung + "\n"
                + " Tiền thưởng: " + tienThuong + "\n"
                + "Tiền phạt: " + tienPhat + "\n"
                  + "Tuổi: " + getTuoi() + "\n"
                + "Số điện thoại: " + getSdt() + "\n"
                + "Email: " + getEmail() + "\n"
                + "Lương thực lĩnh: " + getLuongThucLinh()+ "\n";

    }
}
