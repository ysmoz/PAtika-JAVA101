import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14 ,elma =3.67 , domates =1.11 , muz= 0.95 , patlıcan = 5.00 ,toplam,
                a,e,d,m,p;
        Scanner inp= new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        a= inp.nextDouble();

        System.out.println("Elma Kaç Kilo ? :");
        e= inp.nextDouble();

        System.out.println("Domates Kaç Kilo ? :");
        d= inp.nextDouble();

        System.out.println("Muz Kaç Kilo ? :");
        m = inp.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ?  :");
        p = inp.nextDouble();



        toplam=(a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlıcan);
        System.out.println("Toplam Tutar :"+ toplam+ "TL");








    }
}
