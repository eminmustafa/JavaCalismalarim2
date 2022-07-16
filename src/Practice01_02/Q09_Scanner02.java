package Practice01;

import java.util.Scanner;

public class Q09_Scanner02 {
    public static void main(String[] args) {

        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

       Scanner scan = new Scanner(System.in);
       System.out.print("Lutfen adinizi giriniz : ");
       String isim=scan.nextLine();
       System.out.print("Lutfen soyadinizi giriniz : ");
       String soyisim=scan.nextLine();
       System.out.print("Lutfen memleketinizi giriniz : ");
       String memleket=scan.next();
       System.out.print("Lutfen suanki konumunuzu giriniz : ");
       String konum=scan.next();
       System.out.print("Lutfen yasinizi giriniz : ");
       int yas=scan.nextInt();
       System.out.print("Lutfen boyunuzu giriniz : ");
       double boy=scan.nextDouble();
       System.out.print("Yasadiginiz yeri seviyorsani \'Evet'\' sevmiyorsaniz \'Hayir\' giriniz :");
       String konumBilgi1=scan.next().toLowerCase();
       if (konumBilgi1.equals("evet")){
           System.out.println(isim +" "+ soyisim +" "+ memleket +" "+ konum +" "+ yas +" "+ boy);
       }else System.out.println("Konumunu sevmeye calismalisin yoksa cok zor:))");


/* cozumde yanlislik var sanirim iyisu yukarda :)
        Scanner scan =new Scanner(System.in);
        System.out.println("isminiz :");
        String isim = scan.nextLine();
        System.out.println("memleketiniz :");
        String memleket = scan.nextLine();
        System.out.println("konumunuz :");
        String konum = scan.nextLine();
        System.out.println("yasiniz :");
        int yas = scan.nextInt();
        System.out.println("boyunuz :");
        double boy = scan.nextDouble();
        System.out.println("yasadiginiz " + konum + " u seviyor musunuz? true/false");
        boolean seviyorMu = scan.nextBoolean();
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);
*/
    }
}
