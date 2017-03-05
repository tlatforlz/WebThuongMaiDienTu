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
public class BINHLUAN {
    private int ID;
    private String MaBinhLuan;
    private String NoiDung;
    private int tb_sanpham_ID;
    private String tb_sanpham_MaSanPham;
    private int tb_khachhang_ID;
    private String tb_khachhang_MaKhachHang;

    public BINHLUAN() {
    }

    
    public BINHLUAN(int ID, String MaBinhLuan, String NoiDung, int tb_sanpham_ID, String tb_sanpham_MaSanPham, int tb_khachhang_ID, String tb_khachhang_MaKhachHang) {
        this.ID = ID;
        this.MaBinhLuan = MaBinhLuan;
        this.NoiDung = NoiDung;
        this.tb_sanpham_ID = tb_sanpham_ID;
        this.tb_sanpham_MaSanPham = tb_sanpham_MaSanPham;
        this.tb_khachhang_ID = tb_khachhang_ID;
        this.tb_khachhang_MaKhachHang = tb_khachhang_MaKhachHang;
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaBinhLuan() {
        return MaBinhLuan;
    }

    public void setMaBinhLuan(String MaBinhLuan) {
        this.MaBinhLuan = MaBinhLuan;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public int getTb_sanpham_ID() {
        return tb_sanpham_ID;
    }

    public void setTb_sanpham_ID(int tb_sanpham_ID) {
        this.tb_sanpham_ID = tb_sanpham_ID;
    }

    public String getTb_sanpham_MaSanPham() {
        return tb_sanpham_MaSanPham;
    }

    public void setTb_sanpham_MaSanPham(String tb_sanpham_MaSanPham) {
        this.tb_sanpham_MaSanPham = tb_sanpham_MaSanPham;
    }

    public int getTb_khachhang_ID() {
        return tb_khachhang_ID;
    }

    public void setTb_khachhang_ID(int tb_khachhang_ID) {
        this.tb_khachhang_ID = tb_khachhang_ID;
    }

    public String getTb_khachhang_MaKhachHang() {
        return tb_khachhang_MaKhachHang;
    }

    public void setTb_khachhang_MaKhachHang(String tb_khachhang_MaKhachHang) {
        this.tb_khachhang_MaKhachHang = tb_khachhang_MaKhachHang;
    }
    
    
}
