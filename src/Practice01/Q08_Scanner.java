package Practice01;

import java.util.Scanner;

public class Q08_Scanner {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        System.out.print("1.tamsayi : ");
        int sayi1 =scan.nextInt();
        System.out.print("2.tamsayi : ");
        int sayi2=scan.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("Girdiginiz iki tamsayinin toplami : "+toplam);


    }

}
