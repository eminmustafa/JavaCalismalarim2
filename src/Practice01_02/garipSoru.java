package Practice01;

import java.util.Scanner;

public class garipSoru {
    public static void main(String[] args) {

          /*
           // kullaniciya reklam, memleket,su anki konumlandırma,
          // yas, boy soran bir program olusturun,
          // ve yasadiklari yerleri seviyorlarsa butun bilgileri yazdirin
          // sevmiyorlarsa "yazma be kardesim" yazdirin


          // next() sadece ilk kelimeyi okuyabilir
          // nextLine() tüm satırı okuyabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("isminiz :");
        String isim = scan.nextLine();
        System.out.print("memleketiniz :");
        String memleket = scan.nextLine();
        System.out.print("konumuz  :");
        String konum = scan.nextLine();
        System.out.print("yasiniz :");
        int yas = scan.nextInt();
        System.out.print("buyunuz :");
        double boy = scan.nextDouble();

        System.out.print("Yasadiginiz yeri seviyorsani \'Evet'\' sevmiyorsaniz \'Hayir\' giriniz : ");
        String konumBilgi1 = scan.next().toLowerCase();

        System.out.println(konumBilgi1.equals("evet") ? "isim : " + isim + "\nmemleke : " + memleket +
                "\nkonum : " + konum + "\nyasiniz : " + yas + "\nboy : " + boy : "yazma be kardesim :)");



    }


}
