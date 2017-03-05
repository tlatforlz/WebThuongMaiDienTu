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
public class CHITIETDATHANG {
    private int ID;
    private String MaChiTiet;
    private int SoLuong;
    private int DonGia;
    private String tb_dondathang_ID;
    private String tb_dondathant_MaDonDatHang;
    private int tb_sanpham_ID;
    private String tn_sanpham_MaSanPham;

    public CHITIETDATHANG() {
    }

    
    public CHITIETDATHANG(int ID, String MaChiTiet, int SoLuong, int DonGia, String tb_dondathang_ID, String tb_dondathant_MaDonDatHang, int tb_sanpham_ID, String tn_sanpham_MaSanPham) {
        this.ID = ID;
        this.MaChiTiet = MaChiTiet;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.tb_dondathang_ID = tb_dondathang_ID;
        this.tb_dondathant_MaDonDatHang = tb_dondathant_MaDonDatHang;
        this.tb_sanpham_ID = tb_sanpham_ID;
        this.tn_sanpham_MaSanPham = tn_sanpham_MaSanPham;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaChiTiet() {
        return MaChiTiet;
    }

    public void setMaChiTiet(String MaChiTiet) {
        this.MaChiTiet = MaChiTiet;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public String getTb_dondathang_ID() {
        return tb_dondathang_ID;
    }

    public void setTb_dondathang_ID(String tb_dondathang_ID) {
        this.tb_dondathang_ID = tb_dondathang_ID;
    }

    public String getTb_dondathant_MaDonDatHang() {
        return tb_dondathant_MaDonDatHang;
    }

    public void setTb_dondathant_MaDonDatHang(String tb_dondathant_MaDonDatHang) {
        this.tb_dondathant_MaDonDatHang = tb_dondathant_MaDonDatHang;
    }

    public int getTb_sanpham_ID() {
        return tb_sanpham_ID;
    }

    public void setTb_sanpham_ID(int tb_sanpham_ID) {
        this.tb_sanpham_ID = tb_sanpham_ID;
    }

    public String getTn_sanpham_MaSanPham() {
        return tn_sanpham_MaSanPham;
    }

    public void setTn_sanpham_MaSanPham(String tn_sanpham_MaSanPham) {
        this.tn_sanpham_MaSanPham = tn_sanpham_MaSanPham;
    }
    
    
}
