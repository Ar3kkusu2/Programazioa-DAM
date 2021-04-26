/* Programa honek array baten gorde ditugun zenbakien batuketa kalkulatu eta 
inprimatzen du... lau modu desberdinetan.

 */

public class Bat {

    public static void main(String[] args) {
        int[] zenbakiak = {1, 7, 8, 3};
        int batuketa = 0;

    //for erabilita

        /*for (int i = 0; i < zenbakiak.length; i++){
            batuketa+=zenbakiak[i];
            
        }*/
        
    //while erabilita
    
        /*int i = 0;
        while(i < zenbakiak.length) {
            batuketa+=zenbakiak[i];
            i++;
        }*/
    
    //do while erabilita
        
        /*int i = 0;
        do {
            batuketa+=zenbakiak[i];
            i++;
        }while(i<zenbakiak.length);*/

    //for-each erabilita
    
        for (int i: zenbakiak) batuketa+=i;

    System.out.print(batuketa);
    }
}
