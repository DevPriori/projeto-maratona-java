package academy.devdojo.maratona.introducao.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleOFrmatTest01 {
    public static void main(String[] args) {

        Locale localeIndia = new Locale("hi", "IN");
        Locale localeItaly = new Locale("it", "IT");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        System.out.println("INDIA " + df1.format(calendar.getTime()));
        System.out.println("ITALIA " + df2.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeIndia));



    }
}
