import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int number,toplam=0;

        number=scanner.nextInt();



        while(number!=0) {
            int rakam=number%10;
            toplam=rakam+toplam;
            number=number/10;

        }

        System.out.println("Rakamlar toplamı:"+toplam);

    }
}
