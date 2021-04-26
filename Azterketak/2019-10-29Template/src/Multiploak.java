
import java.util.Arrays;

public class Multiploak {

    public static void main(String[] args) {
        printMultiploak(7, 3);
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        printMultiploak(2, 11);
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        System.out.println(Arrays.toString(getMultiploak(3, 20)));
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        System.out.println(Arrays.toString(getMultiploak(4, 6)));
    }

    public static int[] getMultiploak(int noren, int zenbat) {
        
        int n = noren;
        int[] number;
        number = new int[zenbat];
        
        for (int i = 0; i < zenbat; i++){
            number[i] = n;
            n += noren;
        }
                      
        return null;
    }

    public static void printMultiploak(int noren, int zenbat) {
        
        int n = noren;
        for (int i = 0; i < zenbat; i++){
             if(zenbat >= 10){
                 System.out.print(n+" - ");                
             }else {
                 System.out.println(n);                 
             } 
             n+=noren;
        }  
    }
}
