package Practice01;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen Y/N ikilisinden birini giriniz : ");
        char yesNo =scan.next().toUpperCase().charAt(0);
        System.out.println("");
        if (yesNo=='Y'){
            System.out.println("Yes");
        }else if(yesNo=='N'){
            System.out.println("NO");
        }else System.out.println("Yanlis giris yaptiniz tekrar deneyiniz");
    }


}
