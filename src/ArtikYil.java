import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.print("Yili giriniz: ");
        year = inp.nextInt();

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.print(year + " artik yildir");
            } else if (year % 400 != 0 && year % 100 == 0) {
                System.out.print(year + " artik yil degildir");
            } else {
                System.out.print(year + " artik yildir");
            }
        } else {
            System.out.print(year + " artik yil degildir");
        }
    }
}

