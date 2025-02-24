/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;

import java.util.Scanner;
public class BAI4 {
    public static void main(String[] args) {
        int n;
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap nam");
        n=kb.nextInt();
        if(n%4==0 && n%100!=0 || n%400==0){
            System.out.println("nam nhuan");
        }else{
            System.out.println("nam khong nhuan");
        }
    }
}
