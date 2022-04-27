import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int yas, mesafe, yon;
        double ntutar, yasindirim, indirimtutar, yonindirim;
        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();

        System.out.println("Yaşınızı giriniz :");
        yas = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yon = inp.nextInt();


        if  ((mesafe > 0 && yas > 0) && (yon== 1 || yon ==2)) {



            if (yas < 12) {
                ntutar = mesafe * 0.10;
                yasindirim = ntutar * 0.50;
                indirimtutar = ntutar - yasindirim;
                if (yon == 2) {
                    yonindirim = indirimtutar * 0.20;
                    System.out.println("Toplam tutar:" + (indirimtutar - yonindirim) * 2);
                }
               else{System.out.println("Toplam tutar:" + indirimtutar);}
            } else if (yas > 12 && yas < 24) {
                ntutar = mesafe * 0.10;
                yasindirim = ntutar * 0.10;
                indirimtutar = ntutar - yasindirim;
                if (yon == 2) {
                    yonindirim = indirimtutar * 0.20;
                    System.out.println("Toplam tutar:" + (indirimtutar - yonindirim) * 2);
                }
                else{System.out.println("Toplam tutar:" + indirimtutar);}
            } else if (yas > 65) {
                ntutar = mesafe * 0.10;
                yasindirim = ntutar * 0.30;
                indirimtutar = ntutar - yasindirim;
                if (yon == 2) {
                    yonindirim = indirimtutar * 0.20;
                    System.out.println("Toplam tutar:" + (indirimtutar - yonindirim) * 2);
                }
                else{System.out.println("Toplam tutar:" + indirimtutar);}
            }


        } else {
            System.out.println("Hatalı veri girdiniz");

        }
    }
}

