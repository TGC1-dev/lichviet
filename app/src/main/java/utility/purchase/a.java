package vn.net.vac.base.utility.purchase;

/* compiled from: IabException */
public class a extends Exception {
    c a;

    public a(c cVar) {
        this(cVar, null);
    }

    public c a() {
        return this.a;
    }

    public a(int i, String str) {
        this(new c(i, str));
    }

    public a(c cVar, Exception exception) {
        super(cVar.a(), exception);
        this.a = cVar;
    }

    public a(int i, String str, Exception exception) {
        this(new c(i, str), exception);
    }
}
