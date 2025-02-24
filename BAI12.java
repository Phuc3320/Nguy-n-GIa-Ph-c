/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI12 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("nhap n ");
        n=kb.nextInt();
        int doixung=0;
        while (n>0){
            int tam=n%10;
            doixung=doixung*10+tam;
            n=n/10;
        }
        System.out.println("so doi xung cua n la "+doixung);
    }
}
