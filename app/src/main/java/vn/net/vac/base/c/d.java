package vn.net.vac.base.c;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: DatetimeUtils */
public class d {
    public static String a(Date date, String str) {
        return new SimpleDateFormat(str).format(date);
    }

    public static String b(String str) {
        return new SimpleDateFormat(str).format(new Date());
    }

    public static String a(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            return new SimpleDateFormat(str3).format(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date a(String str) {
        try {
            return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.UK).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, int i) {
        Date a = a(str);
        Calendar instance = Calendar.getInstance();
        instance.setTime(a);
        instance.add(5, i);
        return a(new Date(instance.getTimeInMillis()));
    }

    public static String a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.UK);
        simpleDateFormat.setLenient(false);
        return simpleDateFormat.format(date);
    }
}
