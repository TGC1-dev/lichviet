package vn.net.vac.base.dbmanager.model;

/* compiled from: NgayLe */
public class a {
    public String a;
    public String b;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public a(String str, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }
}
