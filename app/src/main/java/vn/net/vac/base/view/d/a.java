package vn.net.vac.base.view.d;

import com.github.mikephil.charting.formatter.XAxisValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* compiled from: MyCustomXAxisValueFormatter */
public class a implements XAxisValueFormatter {
    List<String> a;

    public a(List<String> list) {
        this.a = list;
    }

    public String getXValue(String str, int i, ViewPortHandler viewPortHandler) {
        if (i == 0 || (i + 1) % 5 == 0) {
            return (String) this.a.get(i);
        }
        return "";
    }
}
