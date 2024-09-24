import java.util.Scanner;

public class sdd {
    public static void main(String[] args) {
        int chieudai;
        Scanner sc= new Scanner(System.in);
        int chieurong;
        System.out.print("nhap chieu dai");
        chieudai=sc.nextInt();
        System.out.print("nhap chieu rong");
        chieurong=sc.nextInt();
        System.out.println("chu vi la "+((chieurong + chieudai)*2)) ;
        System.out.println("dien tich la "+(chieurong * chieudai));
        sc.close();
    }
    
}
