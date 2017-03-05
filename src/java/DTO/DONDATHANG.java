/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author tranl
 */
public class DONDATHANG {

    private int ID;
    private String MaDonDatHang;
    private Date NgayDat;
    private Date NgayGiao;
    private int TinhTrangGiao;
    private int DaThanhToan;
    private int UuDai;
    private int PhiVanChuyen;
    private int DaXoa;
    private int DaHuy;
    private int TongTien;
    private int tb_nhanvien_ID;
    private String tb_nhanvien_MaNhanVien;
    private int tb_khachhang_ID;
    private String tb_khachhang_MaKhachHang;

    public DONDATHANG() {
    }

    public DONDATHANG(int ID, String MaDonDatHang, Date NgayDat, Date NgayGiao, int TinhTrangGiao, int DaThanhToan, int UuDai, int PhiVanChuyen, int DaXoa, int DaHuy, int TongTien, int tb_nhanvien_ID, String tb_nhanvien_MaNhanVien, int tb_khachhang_ID, String tb_khachhang_MaKhachHang) {
        this.ID = ID;
        this.MaDonDatHang = MaDonDatHang;
        this.NgayDat = NgayDat;
        this.NgayGiao = NgayGiao;
        this.TinhTrangGiao = TinhTrangGiao;
        this.DaThanhToan = DaThanhToan;
        this.UuDai = UuDai;
        this.PhiVanChuyen = PhiVanChuyen;
        this.DaXoa = DaXoa;
        this.DaHuy = DaHuy;
        this.TongTien = TongTien;
        this.tb_nhanvien_ID = tb_nhanvien_ID;
        this.tb_nhanvien_MaNhanVien = tb_nhanvien_MaNhanVien;
        this.tb_khachhang_ID = tb_khachhang_ID;
        this.tb_khachhang_MaKhachHang = tb_khachhang_MaKhachHang;
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaDonDatHang() {
        return MaDonDatHang;
    }

    public void setMaDonDatHang(String MaDonDatHang) {
        this.MaDonDatHang = MaDonDatHang;
    }

    public Date getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(Date NgayDat) {
        this.NgayDat = NgayDat;
    }

    public Date getNgayGiao() {
        return NgayGiao;
    }

    public void setNgayGiao(Date NgayGiao) {
        this.NgayGiao = NgayGiao;
    }

    public int getTinhTrangGiao() {
        return TinhTrangGiao;
    }

    public void setTinhTrangGiao(int TinhTrangGiao) {
        this.TinhTrangGiao = TinhTrangGiao;
    }

    public int getDaThanhToan() {
        return DaThanhToan;
    }

    public void setDaThanhToan(int DaThanhToan) {
        this.DaThanhToan = DaThanhToan;
    }

    public int getUuDai() {
        return UuDai;
    }

    public void setUuDai(int UuDai) {
        this.UuDai = UuDai;
    }

    public int getPhiVanChuyen() {
        return PhiVanChuyen;
    }

    public void setPhiVanChuyen(int PhiVanChuyen) {
        this.PhiVanChuyen = PhiVanChuyen;
    }

    public int getDaXoa() {
        return DaXoa;
    }

    public void setDaXoa(int DaXoa) {
        this.DaXoa = DaXoa;
    }

    public int getDaHuy() {
        return DaHuy;
    }

    public void setDaHuy(int DaHuy) {
        this.DaHuy = DaHuy;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public int getTb_nhanvien_ID() {
        return tb_nhanvien_ID;
    }

    public void setTb_nhanvien_ID(int tb_nhanvien_ID) {
        this.tb_nhanvien_ID = tb_nhanvien_ID;
    }

    public String getTb_nhanvien_MaNhanVien() {
        return tb_nhanvien_MaNhanVien;
    }

    public void setTb_nhanvien_MaNhanVien(String tb_nhanvien_MaNhanVien) {
        this.tb_nhanvien_MaNhanVien = tb_nhanvien_MaNhanVien;
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
