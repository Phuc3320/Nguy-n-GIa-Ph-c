/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI9 {
    public static int tong(int n){
    int s=0;
    while (n>0){
        s=s+(n%10);
        n=n/10;
    }
    return s;
    }
    public static int tich(int n){
    int tich=1;
    if(n==0){
        return 0;
    }while (n>0){
        tich=tich*(n%10);
        n=n/10;
    }
    return tich;
    }
    public static void main(String[] args) {
    int n;
    Scanner kb=new Scanner(System.in);
    System.out.println("nhap n ");
    n=kb.nextInt();
    int s=tong(n);
    int tich=tich(n);
    System.out.println("tong cac chu so "+s);
    System.out.println("tich cac chu so "+tich);
    }
}
