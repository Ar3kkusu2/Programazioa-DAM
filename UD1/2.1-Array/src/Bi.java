/* Programa honek erabiltzaileari hiru izen eskatu eta array baten gordetzen ditu.
Gero izenen zerrenda ateratzen du. Adibidez:

Idatzi izen bat: Bruno
Idatzi izen bat: Berta
Idatzi izen bat: Merlí
Hauek dira sartu dituzun izenak:
1. Bruno
2. Berta
3. Merlí

 */

import java.util.Scanner;

public class Bi {

    public static void main(String[] args) {
        String[] izenak = new String[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < izenak.length; i++){
            System.out.print("Idatzi izen bat: ");
            izenak[i] = in.next();
        }
        
        for (int i = 0; i < izenak.length; i++){
            System.out.println(i+1+". "+izenak[i]);
        }
        
        
    }
}
