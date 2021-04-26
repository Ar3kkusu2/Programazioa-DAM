
import java.util.Scanner;




public class Marrazkia {

    public static void main(String[] args) {
     
        int x = -1;
        int y = -1;
        int n = 1;
        
        Scanner in = new Scanner(System.in);
        
        while(y < 0){
            System.out.print("Altuera: ");
            y = in.nextInt();
        }
        while(x < 0){
            System.out.print("Zabalera: ");
            x = in.nextInt();
        }
        
        for (int i = 0; i < y; i++){
            for (int c = 0; c < x; c++){
                System.out.printf("%3d",n);
                n++;
            }
            System.out.println();
        }
        

    }

}
