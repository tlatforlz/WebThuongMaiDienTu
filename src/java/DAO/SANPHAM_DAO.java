/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.SANPHAM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tranl
 */
public class SANPHAM_DAO {
     public ArrayList<SANPHAM> get_ND() throws SQLException {
        IODatabase io = new IODatabase();
        io.conn();
        String sql = "select * from tb_sanpham";
        ResultSet rs = io.getResultSet(sql);
        ArrayList<SANPHAM> list = new ArrayList<SANPHAM>();
        try {
            while (rs.next()) {
                int ID = rs.getInt("ID");
                String MaSanPham = rs.getString("MaSanPham");
                String TenSanPham = rs.getString("TenSanPham");
                int DonGia = rs.getInt("DonGia");
                int GiamGia = rs.getInt("GiamGia");
                //Date NgayCapNhap = rs.getDate("NgayCapNhap");
                //String MoTa = rs.getString("MoTa");
                String HinhAnh = rs.getString("HinhAnh");
                int LuotXem = rs.getInt("LuotXem");
                int LuotBinhLuan = rs.getInt("LuotBinhLuan");
                int SoLanMua = rs.getInt("SoLanMua");
                int tb_loaisanpham_ID = rs.getInt("tb_loaisanpham_ID");
                String tb_loaisanpham_MaLoaiSanPham = rs.getString("tb_loaisanpham_MaLoaiSanPham");
                int tb_nhasanxuat_ID = rs.getInt("tb_nhasanxuat_ID");
                String tb_nhasanxuat_MaNSX = rs.getString("tb_nhasanxuat_MaNSX");
                HinhAnh = "Image/" + HinhAnh;
                SANPHAM sp = new SANPHAM(ID, MaSanPham, TenSanPham, DonGia, GiamGia, HinhAnh, LuotXem, LuotBinhLuan, SoLanMua, tb_loaisanpham_ID, tb_loaisanpham_MaLoaiSanPham, tb_nhasanxuat_ID, tb_nhasanxuat_MaNSX);
                list.add(sp);
            }
        } catch (SQLException e) {
        }
        //io.close();
        return list;
    }
}
