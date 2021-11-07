package vn.net.vac.base.utility.alarm;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.util.Calendar;
import java.util.List;
import vn.net.vac.base.b.a;
import vn.net.vac.base.c.h;
import vn.net.vac.base.dbmanager.model.NgayLe2016;

public class AlarmManagerHelper extends BroadcastReceiver {
    @SuppressLint({"NewApi"})
    private static void a(Context context, Calendar calendar, PendingIntent pendingIntent) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, calendar.getTimeInMillis(), pendingIntent);
        } else {
            alarmManager.set(0, calendar.getTimeInMillis(), pendingIntent);
        }
    }

    public static void b(Context context) {
        a(context);
        List<NgayLe2016> d = a.d();
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        for (NgayLe2016 ngayLe2016 : d) {
            PendingIntent a = a(context, ngayLe2016);
            String[] split = ngayLe2016.b.split("-");
            instance.set(1, Integer.parseInt(split[2]));
            instance.set(2, Integer.parseInt(split[1]) - 1);
            instance.set(5, Integer.parseInt(split[0]));
            instance.set(11, 7);
            instance.set(12, 30);
            instance.set(13, 0);
            instance.set(14, 0);
            if (instance.getTimeInMillis() > instance2.getTimeInMillis()) {
                a(context, instance, a);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        b(context);
    }

    public static void a(Context context) {
        for (NgayLe2016 a : a.d()) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(a(context, a));
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, AlarmManagerHelper.class), 1, 1);
        }
    }

    private static PendingIntent a(Context context, NgayLe2016 ngayLe2016) {
        String str = "name";
        Intent intent = new Intent(context, AlarmService.class);
        intent.putExtra("id", ngayLe2016.a);
        try {
            intent.putExtra(str, vn.net.vac.base.c.e.a.a(ngayLe2016.c, h.a(context).a()));
        } catch (Exception unused) {
            intent.putExtra(str, ngayLe2016.c);
        }
        return PendingIntent.getService(context, (int) ngayLe2016.a, intent, 134217728);
    }
}
