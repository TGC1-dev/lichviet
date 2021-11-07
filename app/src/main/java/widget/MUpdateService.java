package vn.net.vac.base.widget;

import android.app.PendingIntent;
import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViews;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.activity.NotificationActivity;

public class MUpdateService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str = "appWidgetIds";
        for (int i3 : intent.getIntArrayExtra(str)) {
            RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.widget_layout);
            a.a((Context) this).a(remoteViews);
            Intent intent2 = new Intent(this, WidgetProvider.class);
            intent2.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent2.putExtra(str, new int[]{i3});
            PendingIntent broadcast = PendingIntent.getBroadcast(this, i3, intent2, 134217728);
            AppWidgetManager instance = AppWidgetManager.getInstance(this);
            remoteViews.setOnClickPendingIntent(R.id.btnRefresh, broadcast);
            remoteViews.setOnClickPendingIntent(R.id.widget_layout, PendingIntent.getActivity(this, 0, new Intent(this, NotificationActivity.class), 0));
            instance.updateAppWidget(i3, remoteViews);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
