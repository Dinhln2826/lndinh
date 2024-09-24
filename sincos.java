import java.util.Scanner;
public class sincos {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double x;
       System.out.println("nhap so ");
       x = Math.toRadians(sc.nextDouble());
       System.out.println("cos x="+Math.cos(x));
       System.out.println("sin x="+Math.sin(x));
       sc.close();
    } 
    
}
