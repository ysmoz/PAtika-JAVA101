import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        Scanner alan = new Scanner(System.in);
        int a, b, c, u;
        System.out.println("birinci kenarı giriniz");
        a = alan.nextInt();

        System.out.println("İkinci kenarı giriniz");
        b = alan.nextInt();

        System.out.println("Ücüncü kenarı giriniz");
        c = alan.nextInt();

        u = (a + b + c) / 2;
        int ualan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı = " + ualan);


    }
    }

