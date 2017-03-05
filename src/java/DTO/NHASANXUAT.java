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
public class NHASANXUAT {

    private int ID;
    private String MaNSX;
    private String TenNSX;
    private String ThongTin;

    public NHASANXUAT() {
    }

    
    public NHASANXUAT(int ID, String MaNSX, String TenNSX, String ThongTin) {
        this.ID = ID;
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.ThongTin = ThongTin;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getThongTin() {
        return ThongTin;
    }

    public void setThongTin(String ThongTin) {
        this.ThongTin = ThongTin;
    }
    
    
}
