import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,r,total1=1,total2=1,total3=1,combinasyon;
        System.out.println("C(n,r) hesabı için n degeri giriniz:");
        n=inp.nextInt();

        System.out.println("C(n,r) hesabı için r degeri giriniz:");
        r=inp.nextInt();


        for(int i=1 ; i<=n; i++){
            total1=total1*i;
        }

        for (int k=1; k<=r;k++){
            total2=total2*k;
        }
        for(int m=1; m<=(n-r);m++){
            total3=total3*m;
        }

        combinasyon=(total1)/ (total2 * total3);
        System.out.println("Combinasyon sonucu:"+combinasyon);


    }
}
