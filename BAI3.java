/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAPTUAN1;
import java.util.Scanner;
public class BAI3 {
    public static void main(String[] args) {
        double f;
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap nhiet do F: ");
        f=kb.nextDouble();
        double c=(f-32)/1.8;
        System.out.printf("nhiet do C la: %1.1f",c);
    }
}
