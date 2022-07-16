package Practice01;

import java.util.Scanner;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
         /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen notunuzu rakamsal olarak giriniz:");
        int not =  scan.nextInt();

        if (not >= 90 && not <= 100) {
            /*
            if else cumleleri sart cumleleridir if'den sonra bu sart cumlelerini anlasilir ve aciklayici bir sekilde
            yazmamiz gerekiyor en onemliside burasi if'in parantez icini duzgun ve anlasilir yazarsak tum sorunu cozmus oluruz
            burada not'u 90'a buyuk esit ve 100'den kucuk esit olacak seklde aralikda birakiyoruz ve not bu araliga girerse sout'umuz calisacakdir
             */
            System.out.println("Notunuz : \"A\" - \"Çok İyi\" ");
        } else if (not >= 80 && not<90) {
            /*
            ayni sekilde not'a aralik veriyoruz 80'den buyuk 90'dan kucukse diye eger aralik vermeden yaparsak
            orn: if(not<0)
                 else if(not<50)
                 else if(not<60)
                 seklinde yaparsak girilen not 49 varsayalim
                 49 hem 50'den kucuk hemde 60'dan o zaman iki else if'in sartinada uydugu icin sartimiz pek saglikli saglanmis olmaz
               aralik vermemiz gerekiyor sartin saglikli saglanmasi icin
             */
            System.out.println("Notunuz : \"B\" - \"İyi\" ");
            /*
            sout'un icerisinde yazan \"B\" 'tamamen gorsel ve duzen icin kullanilan araclardir
            body'de yaptigimiz \"B\" bu islem konsolda sadece "B" seklinde gorunur
            gerekli aciklamayi asagiya birakiyorum
             */
        } else if (not >= 70 && not<80) {
            System.out.println("Notunuz : \"C\" - \"Orta\" ");

        } else if (not >= 60 && not<70) {
            System.out.println("Notunuz : \"D\" - \"Geçer\" ");

        } else if (not >= 0 && not<60 ) {

            System.out.println("Notunuz : \"F\" - \"Kaldın, seneye yine bekleriz\" ");

        } else
            System.out.println("Lütfen geçerli bir değer giriniz");

        /* Not:
        yazdırılamayan karakterleri karakter ve dize değişmezlerine koymak için kullanılırlar .
         Örneğin, sekme, satır başı ve geri alma gibi karakterleri bir çıkış akışına koymak için kaçış dizilerini kullanabilirsiniz.
	       \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
	               \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
	               \\: prints a back slash :\ (ters slash) yazdirir
	               \': prints single quote :' tek tirnak yazdirir.
	               \": prints double quote :"" cift tirnak yazdirir.
	                \: backslash
	                /:front slash
         */
    }
}
