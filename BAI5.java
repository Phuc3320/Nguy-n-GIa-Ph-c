/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap so a: ");
        a=kb.nextInt();
        System.out.println("nhap so b: ");
        b=kb.nextInt();
        System.out.println("nhap so c: ");
        c=kb.nextInt();
        int m=a;
        if(m>b){
            m=b;                
        }if(m>c){
            m=c;
        }
        System.out.println("so nho nhat la: "+m);
    }
}
