package vn.net.vac.base.utility.purchase;

/* compiled from: IabResult */
public class c {
    int a;
    String b;

    public c(int i, String str) {
        this.a = i;
        if (str == null || str.trim().length() == 0) {
            this.b = b.a(i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append(b.a(i));
        stringBuilder.append(")");
        this.b = stringBuilder.toString();
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return c() ^ 1;
    }

    public boolean c() {
        return this.a == 0;
    }

    public String toString() {
        return a();
    }
}
