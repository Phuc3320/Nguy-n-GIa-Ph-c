/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI11 {
    public static int daonguoc(int n){
        int tam=0;
        while(n>0){
            int dao=n%10;
            tam=tam*10+dao;
            n=n/10;
        }
        return tam;
    }
    public static void main(String[] args) {
        int n;
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap n ");
        n=kb.nextInt();
        int dao=daonguoc(n);
        System.out.println("so dao nguoc cua n la "+dao);
    }
}
