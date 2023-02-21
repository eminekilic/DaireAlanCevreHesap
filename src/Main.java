import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       int yaricap;
       double PI=3.14,alan,cevre;
       Scanner okuyucu = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz--> ");
        yaricap = okuyucu.nextInt();
        cevre = 2*PI*yaricap;
        alan = PI* yaricap*yaricap;
        System.out.println("Çevre="+cevre+"Alan="+alan);

    }
}