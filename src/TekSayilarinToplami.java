import java.util.Scanner;
public class TekSayilarinToplami {
    public static void main(String[] args) {
        int n, toplam = 0;
        Scanner inp = new Scanner(System.in);


        do {
            System.out.println("Sayi girin:");
            n = inp.nextInt();
            if (n % 4 == 0) {
                toplam += n;
            }
          } while (n % 2 == 0);
                System.out.println("4 ün katı olan sayıların toplamı: " + toplam);

    }
}