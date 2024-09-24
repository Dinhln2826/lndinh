import java.util.Scanner;

public class dtb {
    public static void main(String[] args) {
        duoble toan;
        duoble van;
        duoble anh;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap diem toan:");
        toan=Math.toRadians(sc.nextDouble());
        System.out.print("nhap diem van:");
        van=Math.toRadians(sc.nextDouble());
        System.out.print("nhap diem anh:");       
        anh=Math.toRadians(sc.nextDouble());
        System.out.println("trung binh ba mon tva:"+((toan + van + anh ) / 3));
        sc.close();



    }

    
}
