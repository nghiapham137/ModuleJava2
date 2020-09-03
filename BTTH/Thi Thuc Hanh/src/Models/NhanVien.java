package Models;

public class NhanVien {
    private int idNhanvien;
    private String hoTen;
    private int tuoi;
    private int sdt;
    private String email;
    private double luongThuclinh;


    public NhanVien(int idNhanvien, String hoTen, int tuoi, int sdt, String email) {
        this.idNhanvien = idNhanvien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;

    }

    public int getIdNhanvien() {
        return idNhanvien;
    }

    public void setIdNhanvien(int idNhanvien) {
        this.idNhanvien = idNhanvien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String toString() {
        return "id: " + idNhanvien + "\n"
                +"Họ tên: " + hoTen + "\n"
                + "Tuổi: " + tuoi + "\n"
                + "Số điện thoại: " + sdt + "\n"
                + "Email: " + email + "\n";
    }
}
