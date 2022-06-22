package Practice01;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {

/*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;

        System.out.println("longMin = " + longMin);
        System.out.println("longMax = " + longMax);

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("doubleMin = " + doubleMin);
        System.out.println("doubleMax = " + doubleMax);

        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("floatMin = " + floatMin);
        System.out.println("floatMax = " + floatMax);


        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float laptopFiyati= 999.99f;
        double kilotmetre = 34.56;
        char seviye = 'A';
        boolean dogruMu=true;

        System.out.println("laptopFiyati = " + laptopFiyati);
        System.out.println("kilotmetre = " + kilotmetre);
        System.out.println("seviye = " + seviye);
        System.out.println("dogruMu = " + dogruMu);




    }
}
