
import java.util.Arrays;
import java.util.Scanner;
public class GirilenSayiyaYakinBKSayilar {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int[] dizi= {15,12,788,1,-1,-778,2,0};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int n;
        System.out.println("girilen sayi:");
        n= inp.nextInt();

        for(int i=0; i<dizi.length;i++){

            if (n < dizi[i]){
                System.out.println("Girilen sayıdan büyük ilk sayı: " + dizi[i]);
                System.out.println("Girilen sayıdan küçük ilk sayı: " + dizi[i-1]);
                break;
            }


        }

    }
}
