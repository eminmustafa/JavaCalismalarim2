package Practice01;

import java.util.Scanner;

public class Q13_Ternary {
    public static void main(String[] args) {

        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen fiyat giriniz : ");
        int fiyat =scan.nextInt();
        String sonuc = fiyat < 10 ? "ucuz" : fiyat < 20 ? "normal" : "pahali";
        System.out.println(sonuc);



        // Kullanicidan bir sayi isteyiniz  alinan sayi'nin cift yada tek oldugunu Ternary kullanarak yazdiriniz

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int deger = scan.nextInt();
        String sonuc2 =deger%2==0 ? "bu sayi cift bir sayidir" : "bu sayi tek bir sayidir";
        System.out.println("sonucunuz : " + sonuc);


    }
}
