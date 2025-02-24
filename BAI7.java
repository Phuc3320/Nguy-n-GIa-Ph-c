/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI7 {
    public static void main(String[] args) {
      double l,h,s,t,mt;
      Scanner kb=new Scanner(System.in);
        System.out.println("nhap diem Ly ");
        l=kb.nextDouble();
        System.out.println("nhap diem Hoa ");
        h=kb.nextDouble();
        System.out.println("nhap diem Sinh ");
        s=kb.nextDouble();
        System.out.println("nhap diem Toan ");
        t=kb.nextDouble();
        System.out.println("nhap diem May Tinh ");
        mt=kb.nextDouble();
        double tong=((l+h+s+t+mt)/50)*100;
        System.out.printf("ty le phan tram %1.1f",tong);
        if(tong>=90){
            System.out.println("hang A");
        }if(tong>=80 && tong<90){
            System.out.println("hang B");
        }if(tong>=70 && tong<80){
            System.out.println("hang C");
        }if(tong>=60 && tong<70){
            System.out.println("hang D");
        }if(tong>=40 && tong<60){
            System.out.println("hang E");
        }if(tong<40){
            System.out.println("hang F");
        }
    }               
}

