/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon;

import java.util.Scanner;

/**
 *
 * @author trpho
 */
public class NhanVienChinhThuc extends NhanVien implements Interface{
    private  static final float PCCV1 = 0;
    private static final float PCTN1=0;
    
    public NhanVienChinhThuc(){
        
    }
    @Override
    public void Nhap(){
        super.Nhap();
        luongnv=TinhLuong();
        
    }
    @Override
    public float MucLuong(){
       return  (((lcb*hsl)/26)*songaydilam);
       
    }
    @Override
    public float TienLamThem(){
        return (float) (((lcb*hsl)/(26*8))*1.5*sogiolamthem);
       
    }
    @Override
    public float TinhLuong(){
      return MucLuong()+TienLamThem();
        }
    @Override
    public void Hien(){
        super.Hien();
        System.out.printf("%15s|%15s|%15s",PCTN1,PCCV1,TinhLuong());
        
    }
}
