package Practice02;

import java.util.Scanner;

public class Q03_StringManipulastion {
    public static void main(String[] args) {
         /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
   //   String name1="mehmet";
   //   String name2="ahmet";

   //   if (name1.length()%2==0){
   //       System.out.println(name1.substring(0,3).concat(name2)+(name1.substring(3)));
   //   }else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

       Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki isimden 1.isimi giriniz ");
        String name1=scan.nextLine();
        System.out.println("Lutfen iki isimden 2.isimi giriniz ");
        String name2=scan.nextLine();
        if (name1.length()%2==0){
                  System.out.println(name1.substring(0,3).concat(name2)+(name1.substring(3)));
        }else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");




    }
}
