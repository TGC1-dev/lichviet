package vn.net.vac.base.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import java.lang.reflect.Field;

public class MyDatePicker extends DatePicker {
    public MyDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Field[] declaredFields = DatePicker.class.getDeclaredFields();
        try {
            r8 = new String[12];
            int i = 0;
            r8[0] = "01";
            r8[1] = "02";
            r8[2] = "03";
            r8[3] = "04";
            r8[4] = "05";
            r8[5] = "06";
            r8[6] = "07";
            r8[7] = "08";
            r8[8] = "09";
            r8[9] = "10";
            r8[10] = "11";
            r8[11] = "12";
            int length = declaredFields.length;
            while (i < length) {
                Field field = declaredFields[i];
                field.setAccessible(true);
                if (TextUtils.equals(field.getName(), "mMonthSpinner")) {
                    ((NumberPicker) field.get(this)).setDisplayedValues(r8);
                }
                if (TextUtils.equals(field.getName(), "mShortMonths")) {
                    field.set(this, r8);
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
