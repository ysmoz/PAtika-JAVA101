import java.util.Scanner;

public class HavaSicaklikOneriProgrami {
    public static void main(String[] args) {

        int derece;

        Scanner inp=new Scanner(System.in);
        System.out.println("Sıcaklık giriniz:");
        derece=inp.nextInt();

        if(derece<5){
            System.out.print("Hava sıcaklığı kayak yapmak için uygun.");

        }
        else if (derece>5 && derece<25) {

            if (derece<=15){
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (derece>=10) {
                System.out.print("Pikniğe gidebilirsin");
            }

        }
        else {
            System.out.print("Denize gidebilirsin");
        }
    }
}



