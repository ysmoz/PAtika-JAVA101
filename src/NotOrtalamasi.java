import java.util.Scanner;


public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, muzik, turkce;

        Scanner not = new Scanner(System.in);
        System.out.print("Matematik Notun: ");
        mat = not.nextInt();

        System.out.print("Fizik Notun: ");
        fizik = not.nextInt();

        System.out.print("Türkçe Notun: ");
        turkce = not.nextInt();

        System.out.print("Tarih Notun: ");
        tarih = not.nextInt();

        System.out.print("Müzik Notun: ");
        muzik = not.nextInt();

        System.out.print("Kimya Notun: ");
        kimya = not.nextInt();

        int ort=(mat+fizik+ kimya+tarih+muzik+turkce)/6;
        System.out.println(ort>60 ? "sınıfı geçti":"Sınıfta kaldı");


    }
}
