package vn.net.vac.base.widget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.h2team.android.lichvannien.R;
import java.util.Calendar;
import vn.net.vac.base.activity.NotificationActivity;

public class WidgetProvider extends AppWidgetProvider {
    private PendingIntent a;

    private void a(Context context, AppWidgetManager appWidgetManager, int i) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
        a.a(context).a(remoteViews);
        Intent intent = new Intent(context, WidgetProvider.class);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra("appWidgetIds", new int[]{i});
        remoteViews.setOnClickPendingIntent(R.id.btnRefresh, PendingIntent.getBroadcast(context, i, intent, 134217728));
        remoteViews.setOnClickPendingIntent(R.id.widget_layout, PendingIntent.getActivity(context, 0, new Intent(context, NotificationActivity.class), 0));
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int a : iArr) {
            a(context, appWidgetManager, a);
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, MUpdateService.class);
        intent.putExtra("appWidgetIds", iArr);
        if (this.a == null) {
            this.a = PendingIntent.getService(context, 0, intent, 268435456);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        instance.set(5, 1);
        alarmManager.setRepeating(0, instance.getTimeInMillis(), 86400000, this.a);
    }
}
