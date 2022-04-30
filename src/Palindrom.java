import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        int n,r,toplam=0,sayi1;
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
         n= inp.nextInt();
        sayi1=n;
        while(n>0)
        {
            r=n%10;
            toplam=(toplam*10)+r;
            n=n/10;
        }
        if(sayi1==toplam)
            System.out.println("Girdiğiniz sayı palindrom sayıdır. ");
        else
            System.out.println("Girdiğiniz sayı palindrom sayı değildir.");

    }
 }





