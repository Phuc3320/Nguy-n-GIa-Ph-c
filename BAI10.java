/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI10 {
    public static int demso(int n){
        int dem=0;
        while(n>0){
            dem++;
            n=n/10;
        }
        return dem;
    }
    public static void main(String[] args) {
        int n;
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap n ");
        n=kb.nextInt();
        int dem=demso(n);
        System.out.println("co "+dem+" chu so");
    }
}
