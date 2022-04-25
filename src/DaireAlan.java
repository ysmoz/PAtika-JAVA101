import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        int r;
        double pi=3.14,alan,a;
        Scanner inp= new Scanner(System.in);
        System.out.print("dairenin yarıçapını giriniz:");
        r=inp.nextInt();
        System.out.print("dairenin merkez açı ölçusunu giriniz:");
        a=inp.nextInt();

        alan=(pi * (r*r) * a) / 360;
        System.out.println(" DAirenin alanı: "+alan);


    }
}
