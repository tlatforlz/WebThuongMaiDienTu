/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author tranl
 */
public class KHACHHANG {
    private int ID;
    private String MaKhachHang;
    private String TenKhachHang;
    private String DiaChi;
    private String Email;
    private int tb_loaikhachhang_ID;
    private String  tb_loaikhachhang_MaLoaiKhachHang;

    public KHACHHANG() {
    }

    public KHACHHANG(int ID, String MaKhachHang, String TenKhachHang, String DiaChi, String Email, int tb_loaikhachhang_ID, String tb_loaikhachhang_MaLoaiKhachHang) {
        this.ID = ID;
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.tb_loaikhachhang_ID = tb_loaikhachhang_ID;
        this.tb_loaikhachhang_MaLoaiKhachHang = tb_loaikhachhang_MaLoaiKhachHang;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTb_loaikhachhang_ID() {
        return tb_loaikhachhang_ID;
    }

    public void setTb_loaikhachhang_ID(int tb_loaikhachhang_ID) {
        this.tb_loaikhachhang_ID = tb_loaikhachhang_ID;
    }

    public String getTb_loaikhachhang_MaLoaiKhachHang() {
        return tb_loaikhachhang_MaLoaiKhachHang;
    }

    public void setTb_loaikhachhang_MaLoaiKhachHang(String tb_loaikhachhang_MaLoaiKhachHang) {
        this.tb_loaikhachhang_MaLoaiKhachHang = tb_loaikhachhang_MaLoaiKhachHang;
    }
    
    
}
