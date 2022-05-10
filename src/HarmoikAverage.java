public class HarmoikAverage {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5};
        int i=0;
        double total=0.0;
        double harmonigaverage=0.0;
        for(i=0; i<dizi.length; i++){

            total+=1.0/dizi[i];

        }
          harmonigaverage=dizi.length/total;
        System.out.println("Harmonik Ortalama:"+ harmonigaverage);
    }
}
