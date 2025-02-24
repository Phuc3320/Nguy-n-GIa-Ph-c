package LAPTUAN1;
import java.util.Scanner;

public class BAI1 {
    public static void main(String[] args) {
        String ten;
        String ngaysinh;
        int maso;
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap ho ten");
        ten=kb.nextLine();
        System.out.println("nhap ngay sinh");
        ngaysinh=kb.nextLine();
        System.out.println("nhap ma so");
        maso=kb.nextInt();
        System.out.println("ho ten: "+ten);
        System.out.println("ngay sinh: "+ngaysinh);
        System.out.println("ma so: "+maso); 
    }
}