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
public class LOAISANPHAM {
    private int ID;
    private String MaLoaiSanPham;
    private String TenLoaiSanPham;

    public LOAISANPHAM(int ID, String MaLoaiSanPham, String TenLoaiSanPham) {
        this.ID = ID;
        this.MaLoaiSanPham = MaLoaiSanPham;
        this.TenLoaiSanPham = TenLoaiSanPham;
    }

    public LOAISANPHAM() {
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaLoaiSanPham() {
        return MaLoaiSanPham;
    }

    public void setMaLoaiSanPham(String MaLoaiSanPham) {
        this.MaLoaiSanPham = MaLoaiSanPham;
    }

    public String getTenLoaiSanPham() {
        return TenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String TenLoaiSanPham) {
        this.TenLoaiSanPham = TenLoaiSanPham;
    }
    
    
}
