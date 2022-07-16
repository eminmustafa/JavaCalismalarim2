package Praktice05;

import java.util.Scanner;

public class Q01_ForLoop {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz : ");
        String harf=scan.next().toLowerCase();

        String sesliHarfler="aeiou";
        String sessizHerfler="bcdfghjklmnpqxrstvwyz";

        if (harf.length()==1){
            for (int i = 0; i <sesliHarfler.length() ; i++) {
                if (sesliHarfler.contains(harf)){
                    System.out.println("sesli harfdir");
                    break;
                }else if (sessizHerfler.contains(harf)){
                    System.out.println("sessiz harfdir");
                    break;
                }else System.out.println("yanlis karakter girdiniz");
                break;
            }
        }else System.out.println("Lutfen tek karakter giriniz");
    }
}
