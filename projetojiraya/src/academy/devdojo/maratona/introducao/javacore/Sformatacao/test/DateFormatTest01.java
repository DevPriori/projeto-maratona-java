package academy.devdojo.maratona.introducao.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[8];

        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.LONG);
        df[5] = DateFormat.getDateInstance(DateFormat.MONTH_FIELD);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);
        df[7] = DateFormat.getDateInstance(DateFormat.ERA_FIELD+2);

        for(DateFormat dateFormat: df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }
}
