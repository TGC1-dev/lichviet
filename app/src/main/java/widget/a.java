package vn.net.vac.base.widget;

import android.content.Context;
import android.widget.RemoteViews;
import com.h2team.android.lichvannien.R;
import java.util.Calendar;
import vn.net.vac.base.c.d;
import vn.net.vac.base.c.h;
import vn.net.vac.base.c.i;
import vn.net.vac.base.dbmanager.model.NgayLe2016;
import vn.net.vac.base.dbmanager.model.Quotes;

/* compiled from: WidgetUtils */
public class a {
    private static a c;
    Context a;
    Calendar b = Calendar.getInstance();

    public a(Context context) {
        this.a = context;
    }

    public static a a(Context context) {
        if (c == null) {
            c = new a(context);
        }
        return c;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x00e5 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|5|6|7|21) */
    /* JADX WARNING: Missing block: B:8:0x00ee, code skipped:
            r9.setTextViewText(com.h2team.android.lichvannien.R.id.ngayTacgia, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(RemoteViews remoteViews) {
        String str = "";
        i.a("Update data now!");
        this.b = Calendar.getInstance();
        remoteViews.setTextViewText(R.id.thu, vn.net.vac.base.c.a.a.k(this.b.get(5), this.b.get(2) + 1, this.b.get(1)));
        String str2 = "%d";
        remoteViews.setTextViewText(R.id.ngay, String.format(str2, new Object[]{Integer.valueOf(this.b.get(5))}));
        remoteViews.setTextViewText(R.id.thang, String.format("tháng %d", new Object[]{Integer.valueOf(this.b.get(2) + 1)}));
        remoteViews.setTextViewText(R.id.nam, String.format(str2, new Object[]{Integer.valueOf(this.b.get(1))}));
        int[] u = vn.net.vac.base.c.a.a.u(this.b.get(5), this.b.get(2) + 1, this.b.get(1));
        remoteViews.setTextViewText(R.id.ngayAm, String.format("%d-%d-%d âm lịch", new Object[]{Integer.valueOf(u[0]), Integer.valueOf(u[1]), Integer.valueOf(u[2])}));
        NgayLe2016 c = vn.net.vac.base.b.a.c(d.b("d-M-yyyy"));
        if (c != null) {
            remoteViews.setTextViewText(R.id.danhNgon, vn.net.vac.base.c.e.a.a(c.c, h.a(this.a).a()).trim());
            remoteViews.setTextViewText(R.id.danhNgon, c.c);
            remoteViews.setTextViewText(R.id.ngayTacgia, str);
            return;
        }
        try {
            Quotes j = vn.net.vac.base.b.a.j();
            if (j.b != null) {
                if (!j.b.trim().isEmpty()) {
                    remoteViews.setTextViewText(R.id.danhNgon, vn.net.vac.base.c.e.a.a(j.a, h.a(this.a).a()).trim());
                    remoteViews.setTextViewText(R.id.ngayTacgia, j.b);
                    return;
                }
            }
            remoteViews.setTextViewText(R.id.danhNgon, vn.net.vac.base.c.e.a.a(j.a, h.a(this.a).a()).trim());
            remoteViews.setTextViewText(R.id.ngayTacgia, "Khuyết Danh");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
