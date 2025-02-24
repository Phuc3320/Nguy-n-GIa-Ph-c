/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap canh a: ");
        a=kb.nextInt();
        System.out.println("nhap canh b: ");
        b=kb.nextInt();
        System.out.println("nhap canh c: ");
        c=kb.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("tam giac hop le");
        }else{
            System.out.println("tam giac khong hop le");
        }
    }   
}
