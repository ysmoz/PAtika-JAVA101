import java.sql.SQLOutput;
import java.util.Scanner;

public class HesapMakinasi {

    public static void main(String[] args) {

        int a, b, toplama = 1, cikarma = 2, carpma = 3, bolme = 4, secim, sonuc;
        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz=");
        a = inp.nextInt();

        System.out.println("İkinci sayıyı giriniz=");
        b = inp.nextInt();

        System.out.println("toplama=1");
        System.out.println("cikarma=2");
        System.out.println("carpma=3");
        System.out.println("bolme=4");

        System.out.println("Yapacagınız işlemi giriniz");
        secim = inp.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam:" + (a + b));
                break;
            case 2:
                System.out.println("Cıkarma" + (a -b));
                break;
            case 3:
                System.out.println("Carpma:"+ (a*b));
                break;
            case 4:
                System.out.println("Bölüm:"+ (a/b));
                break;
            default:
                System.out.print("Geçerli deðer giriniz");


        }


    }
}
