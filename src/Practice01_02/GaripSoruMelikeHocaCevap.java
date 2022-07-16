package Practice01;

import java.util.Scanner;

public class GaripSoruMelikeHocaCevap {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz :");
        String isim=scan.nextLine();
        System.out.print("memleketiniz :");
        String memleket=scan.nextLine();
        System.out.print("konumuz  :");
        String konum=scan.nextLine();
        System.out.print("yasiniz :");
        int yas=scan.nextInt();
        System.out.print("buyunuz :");
        double boy=scan.nextDouble();
        System.out.println("yasadiginiz " +konum + " u seviyormusunuz? true/false");
        String seviyorMu=scan.next();
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println(seviyorMu.equals("evet")? "yasadigi "+ konum+ " u seviyor" : "");
    }
}
