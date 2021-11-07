package vn.net.vac.base.utility.purchase;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Purchase */
public class e {
    String a;
    String b;
    String c;
    String d;
    String e;

    public e(String str, String str2, String str3) throws JSONException {
        this.a = str;
        this.e = str2;
        JSONObject jSONObject = new JSONObject(this.e);
        jSONObject.optString("orderId");
        jSONObject.optString("packageName");
        this.b = jSONObject.optString("productId");
        jSONObject.optLong("purchaseTime");
        jSONObject.optInt("purchaseState");
        this.c = jSONObject.optString("developerPayload");
        this.d = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        jSONObject.optBoolean("autoRenewing");
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseInfo(type:");
        stringBuilder.append(this.a);
        stringBuilder.append("):");
        stringBuilder.append(this.e);
        return stringBuilder.toString();
    }
}
