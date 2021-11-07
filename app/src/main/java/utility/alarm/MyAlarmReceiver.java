package vn.net.vac.base.utility.alarm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Vibrator;
import androidx.core.app.g.b;
import androidx.core.app.g.d;
import androidx.core.app.g.e;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.activity.NotificationActivity;

public class MyAlarmReceiver extends BroadcastReceiver {
    private void a(Context context, String str) {
        CharSequence string = context.getString(R.string.app_name);
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, NotificationActivity.class), 1073741824);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        d dVar = new d(context);
        dVar.b(string);
        e bVar = new b();
        bVar.a((CharSequence) str);
        dVar.a(bVar);
        dVar.a((CharSequence) str);
        dVar.a(true);
        dVar.a(defaultUri);
        dVar.a(activity);
        if (VERSION.SDK_INT >= 21) {
            dVar.b((int) R.drawable.ic_launcher);
            dVar.a(context.getResources().getColor(R.color.bg_main_yellow));
        } else {
            dVar.b((int) R.drawable.ic_launcher);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(0, dVar.a());
        ((Vibrator) context.getSystemService("vibrator")).vibrate(1000);
    }

    public void onReceive(Context context, Intent intent) {
        a(context, "Notification?");
    }
}
