package Practice01;

import java.util.Scanner;

public class Q07_Converting {

    public static void main(String[] args) {

         /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

     */

        int gallon=1;
        double litre=1;

        System.out.println(gallon + " gallon = " + gallon*3.785 + " litredir");
        System.out.println(litre + " litre = " + litre/3.785 + "  gallondur");
        /*
         Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
          formül ===> c = (f-32)*5/9
         */
        double fahrenayt=0;
        System.out.println(fahrenayt + " fahrenayt = " + (fahrenayt-32)*5/9 + " derecedir");

        // kullanicidan al deseydi
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen  fehrenayt cinsinden sicaklik giriniz");
        double fht=scan.nextDouble();

        double derece = (fht-32)*5/9;
        System.out.println(fht + " fahrenayt = " + derece + " derecedir");

    }

}
