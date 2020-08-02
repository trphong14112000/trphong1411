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
public class TruongPhong extends NhanVien implements Interface{
   private static final float PCTN2=0;
   private float PCCV2;
   public  TruongPhong(){
   }
   public TruongPhong(int manv,String hoten,String ngaysinh,String gioitinh ,float hsl,String phongban,float songaydilam,float sogiolamthem,float PCCV2){
    super(manv,hoten,ngaysinh,gioitinh,hsl,phongban,songaydilam,sogiolamthem);
    this.PCCV2=PCCV2;
   
   }
   public boolean setPCCV2(float PCCV2){
       if(PCCV2>0 && PCCV2<=3){
       this.PCCV2=PCCV2;
       return true;
        }
       else
       System.out.println("PHU CAP CONG VIEC PHAI TU (2-3).NHAP LAI!!");
       return false;
   }
       
   public float getPCCV2(){
       return PCCV2;
   }
   @Override
   public void Nhap(){
       super.Nhap();
       Scanner sc= new Scanner(System.in);
       System.out.println("NHAP PHU CAP CHUC VU");
       while(true){
           float scPCCV2 = sc.nextFloat();
           boolean  check= setPCCV2(scPCCV2);
           if(check){
               break;
           }
       }
        luongnv=TinhLuong();
       
   }
   @Override
   public float MucLuong(){
       return ((lcb*(hsl+PCCV2))/26*songaydilam);
       
   }
   @Override
   public float TienLamThem(){
       return (float) ((lcb*hsl)/(26*8)*1.5*sogiolamthem);
       
   }
   @Override
   public float TinhLuong(){
       return  MucLuong()+TienLamThem();
   }
   @Override
   public void Hien(){
       super.Hien();
       System.out.printf("%15s|%15s|%15s",PCTN2,PCCV2,TinhLuong());
   }
    
}
