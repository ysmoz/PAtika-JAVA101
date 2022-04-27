import java.util.Scanner;

public class SayilarinOrtalamasi {
    public static void main(String[] args) {
        int k,i=1,toplam=0,sayac=0;
        Scanner inp=new Scanner(System.in);

        System.out.println("Sayi giriniz:");
        k=inp.nextInt();

        for(i=1; i<=k; i++){

            if((i % 3 == 0) && (i % 4 == 0)){
                toplam+=i;
                sayac++;
            }

        }
        System.out.println("Ortalama:"+(toplam/sayac));
    }
 }
