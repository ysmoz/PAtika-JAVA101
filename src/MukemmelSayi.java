
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int girilenSayi;
        int toplam=0;


        System.out.println("Sayi giriniz: ");
        girilenSayi = inp.nextInt();

        for (int i=1;i<girilenSayi;i++){
            if (girilenSayi%i==0){
                toplam+=i;

            }
        }
        if (girilenSayi==toplam){
            System.out.println("Mükemmel sayıdır: "+girilenSayi);
        }
        if(girilenSayi!=toplam){
            System.out.println("Mükemmel sayı değildir: "+girilenSayi);
        }


    }
}
