package vn.net.vac.base.utility.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmBootReceiver extends BroadcastReceiver {
    AlarmManagerHelper a = new AlarmManagerHelper();

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED") || intent.getAction().equals("android.intent.action.TIME_SET")) {
            AlarmManagerHelper.b(context);
        }
    }
}
