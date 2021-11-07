package vn.net.vac.base.b;

import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import java.util.List;
import vn.net.vac.base.dbmanager.model.GiacMo;
import vn.net.vac.base.dbmanager.model.Menh;
import vn.net.vac.base.dbmanager.model.MoSo;
import vn.net.vac.base.dbmanager.model.NgayLe2016;
import vn.net.vac.base.dbmanager.model.PhongThuy;
import vn.net.vac.base.dbmanager.model.Que;
import vn.net.vac.base.dbmanager.model.QueQuanAm;
import vn.net.vac.base.dbmanager.model.Quotes;
import vn.net.vac.base.dbmanager.model.Sao;
import vn.net.vac.base.dbmanager.model.ThapNhiTinhBatTu;
import vn.net.vac.base.dbmanager.model.ThuocLoBan;
import vn.net.vac.base.dbmanager.model.TronDoi;
import vn.net.vac.base.dbmanager.model.TuVi2014;
import vn.net.vac.base.dbmanager.model.VanKhan;
import vn.net.vac.base.dbmanager.model.VanKhanType;
import vn.net.vac.base.dbmanager.model.XemBoi;

/* compiled from: DatabaseManager */
public final class a {
    public static List<GiacMo> a() {
        return new Select().from(GiacMo.class).execute();
    }

    public static List<MoSo> b() {
        return new Select().from(MoSo.class).execute();
    }

    public static NgayLe2016 c(String str) {
        return (NgayLe2016) new Select().from(NgayLe2016.class).where("ntime = ?", str).executeSingle();
    }

    public static List<NgayLe2016> d() {
        return new Select().from(NgayLe2016.class).where("hadnotify = 1").execute();
    }

    public static List<Sao> e() {
        return new Select().from(Sao.class).execute();
    }

    public static List<TuVi2014> f() {
        return new Select().from(TuVi2014.class).execute();
    }

    public static List<VanKhanType> g() {
        return new Select().from(VanKhanType.class).execute();
    }

    public static Que h() {
        return (Que) new Select().from(Que.class).orderBy("RANDOM()").executeSingle();
    }

    public static QueQuanAm i() {
        return (QueQuanAm) new Select().from(QueQuanAm.class).orderBy("RANDOM()").executeSingle();
    }

    public static Quotes j() {
        return (Quotes) new Select().from(Quotes.class).orderBy("RANDOM()").executeSingle();
    }

    public static List<PhongThuy> a(int i) {
        return new Select().from(PhongThuy.class).where("ptype = ?", Integer.valueOf(i)).execute();
    }

    public static List<TronDoi> b(int i) {
        return new Select().from(TronDoi.class).where("tcate_id = ?", Integer.valueOf(i)).execute();
    }

    public static List<Menh> e(int i) {
        From from = new Select().from(Menh.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mid >= ");
        stringBuilder.append(i);
        return from.where(stringBuilder.toString()).orderBy("mid").execute();
    }

    public static List<Menh> f(int i) {
        From from = new Select().from(Menh.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mid <= ");
        stringBuilder.append(i);
        return from.where(stringBuilder.toString()).orderBy("mid").execute();
    }

    public static TronDoi g(int i) {
        return (TronDoi) new Select().from(TronDoi.class).where("tid = ?", Integer.valueOf(i)).executeSingle();
    }

    public static List<XemBoi> c(int i) {
        return new Select().from(XemBoi.class).where("xtype = ?", Integer.valueOf(i)).execute();
    }

    public static ThapNhiTinhBatTu d(String str) {
        return (ThapNhiTinhBatTu) new Select().from(ThapNhiTinhBatTu.class).where("t_id = ?", str).executeSingle();
    }

    public static TuVi2014 h(int i) {
        return (TuVi2014) new Select().from(TuVi2014.class).where("tid = ?", Integer.valueOf(i)).executeSingle();
    }

    public static List<VanKhan> i(int i) {
        return new Select().from(VanKhan.class).where("vcate_id = ?", Integer.valueOf(i)).execute();
    }

    public static List<GiacMo> a(String str) {
        From from = new Select().from(GiacMo.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gname_1 LIKE '");
        stringBuilder.append(str);
        stringBuilder.append("%'");
        return from.where(stringBuilder.toString()).orderBy("gname_1").execute();
    }

    public static List<MoSo> b(String str) {
        From from = new Select().from(MoSo.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mname_1 LIKE '");
        stringBuilder.append(str);
        stringBuilder.append("%'");
        return from.where(stringBuilder.toString()).orderBy("mname_1").execute();
    }

    public static List<MoSo> c() {
        return new Select().from(MoSo.class).orderBy("mname_1").execute();
    }

    public static Menh d(int i) {
        From from = new Select().from(Menh.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mid = ");
        stringBuilder.append(i);
        return (Menh) from.where(stringBuilder.toString()).executeSingle();
    }

    public static ThuocLoBan a(long j, long j2, long j3) {
        From from = new Select().from(ThuocLoBan.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("type = ");
        stringBuilder.append(j);
        stringBuilder.append(" AND level = ");
        stringBuilder.append(j2);
        stringBuilder.append(" AND id = ");
        stringBuilder.append(j3);
        return (ThuocLoBan) from.where(stringBuilder.toString()).executeSingle();
    }

    public static ThuocLoBan a(long j, long j2, long j3, long j4) {
        From from = new Select().from(ThuocLoBan.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("level = ");
        stringBuilder.append(j);
        stringBuilder.append(" AND super_id = ");
        stringBuilder.append(j2);
        stringBuilder.append(" AND type = ");
        stringBuilder.append(j3);
        stringBuilder.append(" AND id = ");
        stringBuilder.append(j4);
        return (ThuocLoBan) from.where(stringBuilder.toString()).executeSingle();
    }
}
