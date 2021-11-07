package vn.net.vac.base.utility.purchase;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SkuDetails */
public class g {
    private final String a;
    private final String b;

    public g(String str, String str2) throws JSONException {
        this.b = str2;
        JSONObject jSONObject = new JSONObject(this.b);
        this.a = jSONObject.optString("productId");
        jSONObject.optString("type");
        jSONObject.optString("price");
        jSONObject.optLong("price_amount_micros");
        jSONObject.optString("price_currency_code");
        jSONObject.optString("title");
        jSONObject.optString("description");
    }

    public String a() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SkuDetails:");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
