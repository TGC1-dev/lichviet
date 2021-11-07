package vn.net.vac.base.utility.purchase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class IabBroadcastReceiver extends BroadcastReceiver {
    private final a a;

    public interface a {
        void c();
    }

    public IabBroadcastReceiver(a aVar) {
        this.a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.c();
        }
    }
}
