
import java.util.Scanner;
import java.util.Arrays;


public class DizidekiElemanSiralama {
    public static void main(String[] args) {

          int n,i;
          Scanner inp=new Scanner(System.in);
          System.out.println("Dizinin eleman sayısını giriniz:");
          n=inp.nextInt();
          int [] list=new int[n];
          System.out.println("Dizinin elemanlsrını giriniz:");
          for(i=0; i<n ;i++){
              list[i]=inp.nextInt();
              System.out.println((i+1)+".elaman:"+ list[i]);

          }
          Arrays.sort(list);
          System.out.println("Sıralma:"+Arrays.toString(list));


        }
    }


