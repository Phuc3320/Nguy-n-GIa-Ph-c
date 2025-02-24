/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI8 {
    public static int sodau(int n){
        while(n>=10){
            n=n/10;
        }
        return n;
    }
    public static int socuoi(int n){
        return n%10;
    }
    public static void main(String[] args) {
        int n;
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap n ");
        n=kb.nextInt();
        int dau=sodau(n);
        int cuoi=socuoi(n);
        System.out.println("so dau la "+dau);
        System.out.println("so cuoi la "+cuoi);
    }
}
