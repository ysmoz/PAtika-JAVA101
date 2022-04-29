import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        int i=1,n;
        double total=0;

        Scanner inp=new Scanner(System.in);
        System.out.println("N sayısını giriniz:");
        n=inp.nextInt();

        while(i<=n){
            total +=(1.0/i);
            i++;

        }

        System.out.println("Harmonik toplam:"+total);
    }

}
