package java12;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompactNumberFormat {
    public static void main(String[] args) throws ParseException {
        /*
        1000 ====> 1k or 1 thousand (This is compact number format)
        java.text package provides this option for conversion
         */

        NumberFormat shortForm = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        System.out.println("1000  --> " + shortForm.format(1000));
        System.out.println("10000  --> " + shortForm.format(10000));
        System.out.println("100000  --> " + shortForm.format(100000));
        NumberFormat longForm = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        System.out.println("1000  --> " + longForm.format(1000));
        System.out.println("10000  --> " + longForm.format(10000));
        System.out.println("100000  --> " + longForm.format(100000));

        //conversion of compact number to normal number

        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        System.out.println("1 thousand --> " + numberFormat.parse("1 thousand"));
        System.out.println("10 thousand --> " + numberFormat.parse("10 thousand"));

        NumberFormat numberShortFormat = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        System.out.println("1k --> " + numberShortFormat.parse("1k"));
        System.out.println("10k --> " + numberShortFormat.parse("10k"));
    }
}
