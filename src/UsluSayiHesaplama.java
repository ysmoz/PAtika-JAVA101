import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner inp=new Scanner(System.in);
        System.out.println("Ussu alınacak sayı giriniz:");
        n=inp.nextInt();
        System.out.println("Us olacak sayı:");
        k= inp.nextInt();

        for(int i=1;i<=k;i++){
           total=total*n;
        }

        System.out.println("sonuc:"+total);


    }
}
