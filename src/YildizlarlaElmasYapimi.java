import java.util.Scanner;

public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n= inp.nextInt();

        for(int i=1; i<=n;i++){
            for(int k=1; k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=n-1; 0<=i;i--){
            for(int k=1; k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}



