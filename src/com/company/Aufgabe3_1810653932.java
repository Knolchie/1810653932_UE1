package com.company;

import java.sql.SQLOutput;

public class Aufgabe3_1810653932 {
    public static void main(String[] args) {
/*erstellung der 6 Datentypen*/

        int x= 4;
        int y= 5;
        int z= 6;
        double u= 1.34;
        double v= 1.56;
        double w=60.5;
        /*rechenoperationen*/
        double a= x+y;
        double b= x/z;
        double c= u*y;
        double d= x%y;
        z++;
        y--;
/* ausgabe der rechenoperationen in der Konsole */
        System.out.println( "Zahl 1 plus Zahl 2 = " +a);
        System.out.println( "zahl1 geteilt durch zahl 3  = " +b);
        System.out.println( "zahl4 mal zahl2 = " +c);
        System.out.println("zahl1 modulo zahl 2 = " +  d );
        System.out.println("Inkrementieren Sie zahl 3 = "+z++  );
        System.out.println("Dekrementieren Sie zahl 2 = "+y-- );
        System.out.println("______________________");
    }
}

