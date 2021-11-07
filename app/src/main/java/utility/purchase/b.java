package vn.net.vac.base.utility.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* compiled from: IabHelper */
public class b {
    boolean a = false;
    String b = "IabHelper";
    boolean c = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    private final Object i = new Object();
    String j = "";
    Context k;
    c.a.b.a.a l;
    ServiceConnection m;
    int n;
    String o;
    String p = null;
    d q;

    /* compiled from: IabHelper */
    class a implements ServiceConnection {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = "subs";
            b bVar = b.this;
            if (!bVar.d) {
                bVar.c("Billing service connected.");
                b.this.l = c.a.b.a.a.a.a(iBinder);
                String packageName = b.this.k.getPackageName();
                try {
                    b.this.c("Checking for in-app billing 3 support.");
                    int a = b.this.l.a(3, packageName, "inapp");
                    if (a != 0) {
                        if (this.a != null) {
                            this.a.a(new c(a, "Error checking for billing v3 support."));
                        }
                        b.this.f = false;
                        b.this.g = false;
                        return;
                    }
                    bVar = b.this;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("In-app billing version 3 supported for ");
                    stringBuilder.append(packageName);
                    bVar.c(stringBuilder.toString());
                    if (b.this.l.a(5, packageName, str) == 0) {
                        b.this.c("Subscription re-signup AVAILABLE.");
                        b.this.g = true;
                    } else {
                        b.this.c("Subscription re-signup not available.");
                        b.this.g = false;
                    }
                    if (b.this.g) {
                        b.this.f = true;
                    } else {
                        int a2 = b.this.l.a(3, packageName, str);
                        if (a2 == 0) {
                            b.this.c("Subscriptions AVAILABLE.");
                            b.this.f = true;
                        } else {
                            b bVar2 = b.this;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Subscriptions NOT AVAILABLE. Response: ");
                            stringBuilder2.append(a2);
                            bVar2.c(stringBuilder2.toString());
                            b.this.f = false;
                            b.this.g = false;
                        }
                    }
                    b.this.c = true;
                    e eVar = this.a;
                    if (eVar != null) {
                        eVar.a(new c(0, "Setup successful."));
                    }
                } catch (RemoteException e) {
                    e eVar2 = this.a;
                    if (eVar2 != null) {
                        eVar2.a(new c(-1001, "RemoteException while setting up in-app billing."));
                    }
                    e.printStackTrace();
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            b.this.c("Billing service disconnected.");
            b.this.l = null;
        }
    }

    /* compiled from: IabHelper */
    class b implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ List b;
        final /* synthetic */ List c;
        final /* synthetic */ f d;
        final /* synthetic */ Handler e;

        /* compiled from: IabHelper */
        class a implements Runnable {
            final /* synthetic */ c a;
            final /* synthetic */ d b;

            a(c cVar, d dVar) {
                this.a = cVar;
                this.b = dVar;
            }

            public void run() {
                b.this.d.a(this.a, this.b);
            }
        }

        b(boolean z, List list, List list2, f fVar, Handler handler) {
            this.a = z;
            this.b = list;
            this.c = list2;
            this.d = fVar;
            this.e = handler;
        }

        public void run() {
            d a;
            c cVar = new c(0, "Inventory refresh successful.");
            try {
                a = b.this.a(this.a, this.b, this.c);
            } catch (a e) {
                cVar = e.a();
                a = null;
            }
            b.this.c();
            if (!b.this.d && this.d != null) {
                this.e.post(new a(cVar, a));
            }
        }
    }

    /* compiled from: IabHelper */
    public static class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* compiled from: IabHelper */
    public interface d {
        void a(c cVar, e eVar);
    }

    /* compiled from: IabHelper */
    public interface e {
        void a(c cVar);
    }

    /* compiled from: IabHelper */
    public interface f {
        void a(c cVar, d dVar);
    }

    public b(Context context, String str) {
        this.k = context.getApplicationContext();
        this.p = str;
        c("IAB helper created.");
    }

    private void d() {
        if (this.d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    public void a(boolean z) {
        d();
        this.a = z;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(1:5)(2:6|7)|8|9) */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        synchronized (this.i) {
            if (this.h) {
                c("Will dispose after async operation finishes.");
                this.e = true;
            } else {
                a();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:5|6)|7|8) */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        synchronized (this.i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ending async operation: ");
            stringBuilder.append(this.j);
            c(stringBuilder.toString());
            this.j = "";
            this.h = false;
            if (this.e) {
                a();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void e(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("In-app billing warning: ");
        stringBuilder.append(str);
        stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public void d(String str) {
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("In-app billing error: ");
        stringBuilder.append(str);
        Log.e(str2, stringBuilder.toString());
    }

    public void a(e eVar) {
        d();
        if (this.c) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        c("Starting in-app billing setup.");
        this.m = new a(eVar);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List queryIntentServices = this.k.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            this.k.bindService(intent, this.m, 1);
        } else if (eVar != null) {
            eVar.a(new c(3, "Billing service unavailable on device."));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(String str) throws c {
        synchronized (this.i) {
            if (this.h) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't start async operation (");
                stringBuilder.append(str);
                stringBuilder.append(") because another async operation (");
                stringBuilder.append(this.j);
                stringBuilder.append(") is in progress.");
                throw new c(stringBuilder.toString());
            }
            this.j = str;
            this.h = true;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Starting async operation: ");
            stringBuilder2.append(str);
            c(stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(String str) {
        boolean z = this.a;
    }

    public void a() throws c {
        synchronized (this.i) {
            if (this.h) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't dispose because an async operation (");
                stringBuilder.append(this.j);
                stringBuilder.append(") is in progress.");
                throw new c(stringBuilder.toString());
            }
        }
        c("Disposing.");
        this.c = false;
        if (this.m != null) {
            c("Unbinding from service.");
            Context context = this.k;
            if (context != null) {
                context.unbindService(this.m);
            }
        }
        this.d = true;
        this.k = null;
        this.m = null;
        this.l = null;
        this.q = null;
    }

    public void a(Activity activity, String str, int i, d dVar, String str2) throws c {
        a(activity, str, "inapp", null, i, dVar, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2 A:{Catch:{ SendIntentException -> 0x013f, RemoteException -> 0x0115 }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a A:{Catch:{ SendIntentException -> 0x013f, RemoteException -> 0x0115 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(Activity activity, String str, String str2, List<String> list, int i, d dVar, String str3) throws c {
        String str4 = str;
        String str5 = str2;
        int i2 = i;
        d dVar2 = dVar;
        d();
        String str6 = "launchPurchaseFlow";
        a(str6);
        b(str6);
        c cVar;
        if (!str5.equals("subs") || this.f) {
            StringBuilder stringBuilder;
            try {
                Bundle a;
                int a2;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Constructing buy intent for ");
                stringBuilder.append(str);
                stringBuilder.append(", item type: ");
                stringBuilder.append(str5);
                c(stringBuilder.toString());
                if (list != null) {
                    if (!list.isEmpty()) {
                        if (this.g) {
                            a = this.l.a(5, this.k.getPackageName(), (List) list, str, str2, str3);
                            a2 = a(a);
                            if (a2 == 0) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Unable to buy item, Error response: ");
                                stringBuilder2.append(a(a2));
                                d(stringBuilder2.toString());
                                c();
                                cVar = new c(a2, "Unable to buy item");
                                if (dVar2 != null) {
                                    dVar2.a(cVar, null);
                                }
                                return;
                            }
                            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Launching buy intent for ");
                            stringBuilder3.append(str);
                            stringBuilder3.append(". Request code: ");
                            stringBuilder3.append(i2);
                            c(stringBuilder3.toString());
                            this.n = i2;
                            this.q = dVar2;
                            this.o = str5;
                            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
                            return;
                        }
                        cVar = new c(-1011, "Subscription updates are not available.");
                        c();
                        if (dVar2 != null) {
                            dVar2.a(cVar, null);
                        }
                        return;
                    }
                }
                a = this.l.a(3, this.k.getPackageName(), str, str2, str3);
                a2 = a(a);
                if (a2 == 0) {
                }
            } catch (SendIntentException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("SendIntentException while launching purchase flow for sku ");
                stringBuilder.append(str);
                d(stringBuilder.toString());
                e.printStackTrace();
                c();
                cVar = new c(-1004, "Failed to send intent.");
                if (dVar2 != null) {
                    dVar2.a(cVar, null);
                }
            } catch (RemoteException e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("RemoteException while launching purchase flow for sku ");
                stringBuilder.append(str);
                d(stringBuilder.toString());
                e2.printStackTrace();
                c();
                cVar = new c(-1001, "Remote exception while starting purchase flow");
                if (dVar2 != null) {
                    dVar2.a(cVar, null);
                }
            }
        } else {
            cVar = new c(-1009, "Subscriptions are not available.");
            c();
            if (dVar2 != null) {
                dVar2.a(cVar, null);
            }
        }
    }

    public boolean a(int i, int i2, Intent intent) {
        if (i != this.n) {
            return false;
        }
        d();
        a("handleActivityResult");
        c();
        c cVar;
        d dVar;
        if (intent == null) {
            d("Null data in IAB activity result.");
            cVar = new c(-1002, "Null data in IAB result");
            dVar = this.q;
            if (dVar != null) {
                dVar.a(cVar, null);
            }
            return true;
        }
        int a = a(intent);
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        StringBuilder stringBuilder;
        c cVar2;
        d dVar2;
        if (i2 == -1 && a == 0) {
            c("Successful resultcode from purchase activity.");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Purchase data: ");
            stringBuilder2.append(stringExtra);
            c(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Data signature: ");
            stringBuilder2.append(stringExtra2);
            c(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            String str = "Extras: ";
            stringBuilder2.append(str);
            stringBuilder2.append(intent.getExtras());
            c(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Expected item type: ");
            stringBuilder2.append(this.o);
            c(stringBuilder2.toString());
            if (stringExtra == null || stringExtra2 == null) {
                d("BUG: either purchaseData or dataSignature is null.");
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(intent.getExtras().toString());
                c(stringBuilder.toString());
                cVar2 = new c(-1008, "IAB returned null purchaseData or dataSignature");
                dVar2 = this.q;
                if (dVar2 != null) {
                    dVar2.a(cVar2, null);
                }
                return true;
            }
            String c;
            try {
                e eVar = new e(this.o, stringExtra, stringExtra2);
                c = eVar.c();
                if (f.a(this.p, stringExtra, stringExtra2)) {
                    c("Purchase signature successfully verified.");
                    dVar = this.q;
                    if (dVar != null) {
                        dVar.a(new c(0, "Success"), eVar);
                    }
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Purchase signature verification FAILED for sku ");
                    stringBuilder3.append(c);
                    d(stringBuilder3.toString());
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("Signature verification failed for sku ");
                    stringBuilder4.append(c);
                    c cVar3 = new c(-1003, stringBuilder4.toString());
                    if (this.q != null) {
                        this.q.a(cVar3, eVar);
                    }
                    return true;
                }
            } catch (JSONException e) {
                c = "Failed to parse purchase data.";
                d(c);
                e.printStackTrace();
                cVar = new c(-1002, c);
                dVar = this.q;
                if (dVar != null) {
                    dVar.a(cVar, null);
                }
                return true;
            }
        } else if (i2 == -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Result code was OK but in-app billing response was not OK: ");
            stringBuilder.append(a(a));
            c(stringBuilder.toString());
            if (this.q != null) {
                this.q.a(new c(a, "Problem purchashing item."), null);
            }
        } else if (i2 == 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Purchase canceled - Response: ");
            stringBuilder.append(a(a));
            c(stringBuilder.toString());
            cVar2 = new c(-1005, "User canceled.");
            dVar2 = this.q;
            if (dVar2 != null) {
                dVar2.a(cVar2, null);
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Purchase failed. Result code: ");
            stringBuilder.append(Integer.toString(i2));
            stringBuilder.append(". Response: ");
            stringBuilder.append(a(a));
            d(stringBuilder.toString());
            cVar2 = new c(-1006, "Unknown purchase response.");
            dVar2 = this.q;
            if (dVar2 != null) {
                dVar2.a(cVar2, null);
            }
        }
        return true;
    }

    public d a(boolean z, List<String> list, List<String> list2) throws a {
        String str = "subs";
        String str2 = "inapp";
        d();
        a("queryInventory");
        try {
            d dVar = new d();
            int a = a(dVar, str2);
            if (a == 0) {
                int a2;
                if (z) {
                    a2 = a(str2, dVar, (List) list);
                    if (a2 != 0) {
                        throw new a(a2, "Error refreshing inventory (querying prices of items).");
                    }
                }
                if (this.f) {
                    a2 = a(dVar, str);
                    if (a2 != 0) {
                        throw new a(a2, "Error refreshing inventory (querying owned subscriptions).");
                    } else if (z) {
                        int a3 = a(str, dVar, (List) list2);
                        if (a3 != 0) {
                            throw new a(a3, "Error refreshing inventory (querying prices of subscriptions).");
                        }
                    }
                }
                return dVar;
            }
            throw new a(a, "Error refreshing inventory (querying owned items).");
        } catch (RemoteException e) {
            throw new a(-1001, "Remote exception while refreshing inventory.", e);
        } catch (JSONException e2) {
            throw new a(-1002, "Error parsing JSON response while refreshing inventory.", e2);
        }
    }

    public void a(boolean z, List<String> list, List<String> list2, f fVar) throws c {
        Handler handler = new Handler();
        d();
        a("queryInventory");
        b("refresh inventory");
        new Thread(new b(z, list, list2, fVar, handler)).start();
    }

    public void a(f fVar) throws c {
        a(false, null, null, fVar);
    }

    public static String a(int i) {
        String str = "/";
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split(str);
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split(str);
        StringBuilder stringBuilder;
        if (i <= -1000) {
            int i2 = -1000 - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(i));
            stringBuilder.append(":Unknown IAB Helper Error");
            return stringBuilder.toString();
        } else if (i >= 0 && i < split.length) {
            return split[i];
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(i));
            stringBuilder.append(":Unknown");
            return stringBuilder.toString();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str) {
        if (!this.c) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal state for operation (");
            stringBuilder.append(str);
            stringBuilder.append("): IAB helper is not set up.");
            d(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("IAB helper is not set up. Can't perform operation: ");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            c("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            d("Unexpected type for bundle response code.");
            d(obj.getClass().getName());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected type for bundle response code: ");
            stringBuilder.append(obj.getClass().getName());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Intent intent) {
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            d("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            d("Unexpected type for intent response code.");
            d(obj.getClass().getName());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected type for intent response code: ");
            stringBuilder.append(obj.getClass().getName());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int a(d dVar, String str) throws JSONException, RemoteException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Querying owned items, item type: ");
        stringBuilder.append(str);
        c(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("Package name: ");
        stringBuilder.append(this.k.getPackageName());
        c(stringBuilder.toString());
        int i = 0;
        String str2 = null;
        Object obj = null;
        while (true) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Calling getPurchases with continuation token: ");
            stringBuilder2.append(str2);
            c(stringBuilder2.toString());
            Bundle a = this.l.a(3, this.k.getPackageName(), str, str2);
            int a2 = a(a);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Owned items response: ");
            stringBuilder3.append(String.valueOf(a2));
            c(stringBuilder3.toString());
            if (a2 == 0) {
                String str3 = "INAPP_PURCHASE_ITEM_LIST";
                if (!a.containsKey(str3)) {
                    break;
                }
                String str4 = "INAPP_PURCHASE_DATA_LIST";
                if (!a.containsKey(str4)) {
                    break;
                }
                String str5 = "INAPP_DATA_SIGNATURE_LIST";
                if (!a.containsKey(str5)) {
                    break;
                }
                ArrayList stringArrayList = a.getStringArrayList(str3);
                ArrayList stringArrayList2 = a.getStringArrayList(str4);
                ArrayList stringArrayList3 = a.getStringArrayList(str5);
                Object obj2 = obj;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str6 = (String) stringArrayList2.get(i2);
                    String str7 = (String) stringArrayList3.get(i2);
                    String str8 = (String) stringArrayList.get(i2);
                    if (f.a(this.p, str6, str7)) {
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append("Sku is owned: ");
                        stringBuilder4.append(str8);
                        c(stringBuilder4.toString());
                        e eVar = new e(str, str6, str7);
                        if (TextUtils.isEmpty(eVar.d())) {
                            e("BUG: empty/null token!");
                            StringBuilder stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("Purchase data: ");
                            stringBuilder5.append(str6);
                            c(stringBuilder5.toString());
                        }
                        dVar.a(eVar);
                    } else {
                        e("Purchase signature verification **FAILED**. Not adding item.");
                        StringBuilder stringBuilder6 = new StringBuilder();
                        stringBuilder6.append("   Purchase data: ");
                        stringBuilder6.append(str6);
                        c(stringBuilder6.toString());
                        stringBuilder6 = new StringBuilder();
                        stringBuilder6.append("   Signature: ");
                        stringBuilder6.append(str7);
                        c(stringBuilder6.toString());
                        obj2 = 1;
                    }
                }
                str2 = a.getString("INAPP_CONTINUATION_TOKEN");
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append("Continuation token: ");
                stringBuilder7.append(str2);
                c(stringBuilder7.toString());
                if (TextUtils.isEmpty(str2)) {
                    if (obj2 != null) {
                        i = -1003;
                    }
                    return i;
                }
                obj = obj2;
            } else {
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append("getPurchases() failed: ");
                stringBuilder8.append(a(a2));
                c(stringBuilder8.toString());
                return a2;
            }
        }
        d("Bundle returned from getPurchases() doesn't contain required fields.");
        return -1002;
    }

    /* Access modifiers changed, original: 0000 */
    public int a(String str, d dVar, List<String> list) throws RemoteException, JSONException {
        Iterator it;
        c("Querying SKU details.");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(dVar.a(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        Iterator it2;
        String str3;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() / 20;
        int size2 = arrayList.size() % 20;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList3 = new ArrayList();
            int i2 = i * 20;
            for (String add : arrayList.subList(i2, i2 + 20)) {
                arrayList3.add(add);
            }
            arrayList2.add(arrayList3);
        }
        if (size2 != 0) {
            ArrayList arrayList4 = new ArrayList();
            size *= 20;
            for (String str32 : arrayList.subList(size, size2 + size)) {
                arrayList4.add(str32);
            }
            arrayList2.add(arrayList4);
        }
        it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList = (ArrayList) it.next();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle a = this.l.a(3, this.k.getPackageName(), str, bundle);
            str32 = "DETAILS_LIST";
            if (a.containsKey(str32)) {
                it2 = a.getStringArrayList(str32).iterator();
                while (it2.hasNext()) {
                    g gVar = new g(str, (String) it2.next());
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Got sku details: ");
                    stringBuilder.append(gVar);
                    c(stringBuilder.toString());
                    dVar.a(gVar);
                }
            } else {
                int a2 = a(a);
                if (a2 != 0) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("getSkuDetails() failed: ");
                    stringBuilder2.append(a(a2));
                    c(stringBuilder2.toString());
                    return a2;
                }
                d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                return -1002;
            }
        }
        return 0;
    }
}
