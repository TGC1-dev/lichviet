package vn.net.vac.base.c;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: TimeUtility */
public class o {
    public static Date a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.UK);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a() {
        return a(Calendar.getInstance().getTime());
    }

    public static String a(String str, int i) {
        Date a = a(str);
        Calendar instance = Calendar.getInstance();
        instance.setTime(a);
        instance.add(5, i);
        return a(new Date(instance.getTimeInMillis()));
    }

    public static String a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.UK);
        simpleDateFormat.setLenient(false);
        return simpleDateFormat.format(date);
    }
}
