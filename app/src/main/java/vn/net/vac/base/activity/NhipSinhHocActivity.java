package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.XAxis.XAxisPosition;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.h2team.android.lichvannien.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.simonvt.datepicker.DatePicker;
import net.simonvt.datepicker.DatePicker.OnDateChangedListener;
import vn.net.vac.base.view.CustomDatePicker;
import vn.net.vac.base.view.SquareImageView;

public class NhipSinhHocActivity extends BaseActivity implements OnChartValueSelectedListener {
    private CheckBox A;
    private CheckBox B;
    private CheckBox C;
    private CheckBox D;
    private CheckBox E;
    private CheckBox F;
    private List<Entry> G;
    private List<Entry> H;
    private List<Entry> I;
    private List<Entry> J;
    private List<Entry> K;
    private List<Entry> L;
    private LineChart M;
    private ViewPager N = null;
    private Calendar O = Calendar.getInstance();
    private Calendar P = Calendar.getInstance();
    private int Q;
    private int R = 63;
    private int S;
    private int T = 0;
    private Map<String, o> U;
    private o V;
    private vn.net.vac.base.c.k W;
    private long X = 0;
    OnClickListener Y = new f();
    OnClickListener Z = new g();
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private ImageView x;
    private SquareImageView y;
    private SquareImageView z;

    class a implements OnClickListener {
        a() {
        }

        @SuppressLint({"InlinedApi"})
        public void onClick(View view) {
            NhipSinhHocActivity.this.N.a(NhipSinhHocActivity.this.T - 1, true);
        }
    }

    class b implements OnClickListener {
        b() {
        }

        @SuppressLint({"InlinedApi"})
        public void onClick(View view) {
            NhipSinhHocActivity.this.N.a(NhipSinhHocActivity.this.T + 1, true);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a = new int[m.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static {
            a[m.SUC_KHOE.ordinal()] = 1;
            a[m.TINH_CAM.ordinal()] = 2;
            a[m.TRI_TUE.ordinal()] = 3;
            a[m.TINH_THAN.ordinal()] = 4;
            a[m.THAM_MY.ordinal()] = 5;
            try {
                a[m.TRUC_GIAC.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    class d implements OnClickListener {
        d() {
        }

        public void onClick(View view) {
            if (SystemClock.elapsedRealtime() - NhipSinhHocActivity.this.X >= 1000) {
                NhipSinhHocActivity.this.X = SystemClock.elapsedRealtime();
                NhipSinhHocActivity.this.q();
            }
        }
    }

    class e implements OnClickListener {
        e() {
        }

        public void onClick(View view) {
            NhipSinhHocActivity.this.T = 0;
            NhipSinhHocActivity.this.N.a(NhipSinhHocActivity.this.T, true);
            NhipSinhHocActivity.this.x.setVisibility(8);
        }
    }

    class f implements OnClickListener {
        f() {
        }

        public void onClick(View view) {
            if (SystemClock.elapsedRealtime() - NhipSinhHocActivity.this.X >= 1000) {
                String str;
                NhipSinhHocActivity.this.X = SystemClock.elapsedRealtime();
                String str2 = null;
                switch (view.getId()) {
                    case R.id.textDescroption1 /*2131231052*/:
                        str2 = "Sức khỏe";
                        str = "Đường này có chu kỳ 23 ngày và nó theo dõi tình trạng thể chất và sức khỏe.";
                        break;
                    case R.id.textDescroption2 /*2131231053*/:
                        str2 = "Tình cảm";
                        str = "Đường này có chu kỳ 28 ngày và nó theo dõi năng lượng ổn định và tích cực của tinh thần và cách nhìn về cuộc sống, cũng như năng lực của bạn để cảm thông và xây dựng mối quan hệ với những người khác.";
                        break;
                    case R.id.textDescroption3 /*2131231054*/:
                        str2 = "Trí tuệ";
                        str = "Đường này có chu kỳ 33 ngày và nó theo dõi, bằng lời nói, khả năng toán học của bạn, khả năng tưởng tượng, và sáng tạo, cũng như năng lực của bạn để áp dụng lý trí và phân tích với thế giới xung quanh bạn.";
                        break;
                    case R.id.textDescroption4 /*2131231055*/:
                        str2 = "Tinh thần";
                        str = "Đường này có chu kỳ 53 ngày và nó mô tả sự ổn định bên trong và thái độ thoải mái của bạn.";
                        break;
                    case R.id.textDescroption5 /*2131231056*/:
                        str2 = "Thẩm mỹ";
                        str = "Đường này có chu kỳ 43 ngày và nó mô tả sự quan tâm đến cái đẹp và sự hài hòa.";
                        break;
                    case R.id.textDescroption6 /*2131231057*/:
                        str2 = "Trực giác";
                        str = "Đường này có chu kỳ 38 ngày và nó ảnh hưởng đến nhận thức, linh cảm, bản năng và \"giác quan thứ sáu\".";
                        break;
                    default:
                        str = null;
                        break;
                }
                NhipSinhHocActivity.this.b(str2, str);
            }
        }
    }

    class g implements OnClickListener {
        g() {
        }

        public void onClick(View view) {
            NhipSinhHocActivity nhipSinhHocActivity;
            switch (view.getId()) {
                case R.id.checkb1 /*2131230826*/:
                    if (!NhipSinhHocActivity.this.A.isChecked()) {
                        nhipSinhHocActivity = NhipSinhHocActivity.this;
                        nhipSinhHocActivity.R = nhipSinhHocActivity.R ^ m.SUC_KHOE.a();
                        break;
                    }
                    nhipSinhHocActivity = NhipSinhHocActivity.this;
                    nhipSinhHocActivity.R = nhipSinhHocActivity.R | m.SUC_KHOE.a();
                    break;
                case R.id.checkb2 /*2131230827*/:
                    if (!NhipSinhHocActivity.this.B.isChecked()) {
                        nhipSinhHocActivity = NhipSinhHocActivity.this;
                        nhipSinhHocActivity.R = nhipSinhHocActivity.R ^ m.TINH_CAM.a();
                        break;
                    }
                    nhipSinhHocActivity = NhipSinhHocActivity.this;
                    nhipSinhHocActivity.R = nhipSinhHocActivity.R | m.TINH_CAM.a();
                    break;
                case R.id.checkb3 /*2131230828*/:
                    if (!NhipSinhHocActivity.this.C.isChecked()) {
                        nhipSinhHocActivity = NhipSinhHocActivity.this;
                        nhipSinhHocActivity.R = nhipSinhHocActivity.R ^ m.TRI_TUE.a();
                        break;
                    }
                    nhipSinhHocActivity = NhipSinhHocActivity.this;
                    nhipSinhHocActivity.R = nhipSinhHocActivity.R | m.TRI_TUE.a();
                    break;
                case R.id.checkb4 /*2131230829*/:
                    if (!NhipSinhHocActivity.this.D.isChecked()) {
                        nhipSinhHocActivity = NhipSinhHocActivity.this;
                        nhipSinhHocActivity.R = nhipSinhHocActivity.R ^ m.TINH_THAN.a();
                        break;
                    }
                    nhipSinhHocActivity = NhipSinhHocActivity.this;
                    nhipSinhHocActivity.R = nhipSinhHocActivity.R | m.TINH_THAN.a();
                    break;
                case R.id.checkb5 /*2131230830*/:
                    if (!NhipSinhHocActivity.this.E.isChecked()) {
                        nhipSinhHocActivity = NhipSinhHocActivity.this;
                        nhipSinhHocActivity.R = nhipSinhHocActivity.R ^ m.THAM_MY.a();
                        break;
                    }
                    nhipSinhHocActivity = NhipSinhHocActivity.this;
                    nhipSinhHocActivity.R = nhipSinhHocActivity.R | m.THAM_MY.a();
                    break;
                case R.id.checkb6 /*2131230831*/:
                    if (!NhipSinhHocActivity.this.F.isChecked()) {
                        nhipSinhHocActivity = NhipSinhHocActivity.this;
                        nhipSinhHocActivity.R = nhipSinhHocActivity.R ^ m.TRUC_GIAC.a();
                        break;
                    }
                    nhipSinhHocActivity = NhipSinhHocActivity.this;
                    nhipSinhHocActivity.R = nhipSinhHocActivity.R | m.TRUC_GIAC.a();
                    break;
            }
            nhipSinhHocActivity = NhipSinhHocActivity.this;
            nhipSinhHocActivity.c(nhipSinhHocActivity.R);
        }
    }

    class i implements OnClickListener {
        final /* synthetic */ Dialog a;

        i(NhipSinhHocActivity nhipSinhHocActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class j implements OnClickListener {
        final /* synthetic */ Dialog a;
        final /* synthetic */ CustomDatePicker b;

        j(Dialog dialog, CustomDatePicker customDatePicker) {
            this.a = dialog;
            this.b = customDatePicker;
        }

        public void onClick(View view) {
            this.a.dismiss();
            NhipSinhHocActivity.this.P.set(1, this.b.getYear());
            NhipSinhHocActivity.this.P.set(2, this.b.getMonth());
            NhipSinhHocActivity.this.P.set(5, this.b.getDayOfMonth());
            vn.net.vac.base.c.k g = NhipSinhHocActivity.this.W;
            String[] strArr = new String[3];
            StringBuilder stringBuilder = new StringBuilder();
            String str = "";
            stringBuilder.append(str);
            stringBuilder.append(NhipSinhHocActivity.this.P.get(5));
            strArr[0] = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(NhipSinhHocActivity.this.P.get(2));
            strArr[1] = stringBuilder2.toString();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(NhipSinhHocActivity.this.P.get(1));
            strArr[2] = stringBuilder2.toString();
            g.a(strArr);
            NhipSinhHocActivity.this.B();
        }
    }

    class k implements OnClickListener {
        final /* synthetic */ Dialog a;

        k(NhipSinhHocActivity nhipSinhHocActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    public enum m {
        SUC_KHOE(1),
        TINH_CAM(2),
        TRI_TUE(4),
        TINH_THAN(8),
        THAM_MY(16),
        TRUC_GIAC(32);
        
        private final int a;

        private m(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public static class o {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;

        public o(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
        }
    }

    class h implements OnDateChangedListener {
        h(NhipSinhHocActivity nhipSinhHocActivity) {
        }

        public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        }
    }

    class l implements androidx.viewpager.widget.ViewPager.j {
        l() {
        }

        public void a(int i, float f, int i2) {
            Log.i("Chart", "onPageScrolled");
        }

        public void b(int i) {
            if (i == 0) {
                NhipSinhHocActivity.this.x.setVisibility(8);
            } else {
                NhipSinhHocActivity.this.x.setVisibility(0);
            }
            NhipSinhHocActivity.this.T = i;
            if (NhipSinhHocActivity.this.T != 0) {
                NhipSinhHocActivity.this.v.setText(vn.net.vac.base.c.d.a(vn.net.vac.base.c.o.a(vn.net.vac.base.c.o.a(), i), "yyyy/MM/dd", "d-M"));
            } else {
                NhipSinhHocActivity.this.v.setText("Hôm nay");
            }
            NhipSinhHocActivity nhipSinhHocActivity = NhipSinhHocActivity.this;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append("");
            nhipSinhHocActivity.b(stringBuilder.toString());
            NhipSinhHocActivity.this.M.highlightValue(new Highlight(i, 0));
        }

        public void a(int i) {
            Log.i("Chart", "onPageScrollStateChanged");
        }
    }

    static class n extends androidx.fragment.app.h {
        Map<String, o> f;
        Map<String, vn.net.vac.base.view.fragment.b> g = new HashMap();

        public n(androidx.fragment.app.e eVar, Map<String, o> map) {
            super(eVar);
            this.f = map;
        }

        private o e(int i) {
            Map map = this.f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append("");
            o oVar = (o) map.get(stringBuilder.toString());
            return oVar == null ? new o(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f) : oVar;
        }

        public int a() {
            return 30;
        }

        public void a(ViewGroup viewGroup, int i, Object obj) {
            this.g.remove(Integer.valueOf(i));
            super.a(viewGroup, i, obj);
        }

        public Fragment c(int i) {
            return vn.net.vac.base.view.fragment.b.a(e(i), i);
        }

        public Object a(ViewGroup viewGroup, int i) {
            return super.a(viewGroup, i);
        }

        public int a(Object obj) {
            vn.net.vac.base.view.fragment.b bVar = (vn.net.vac.base.view.fragment.b) obj;
            bVar.a(e(bVar.e0()));
            return super.a(obj);
        }
    }

    private void A() {
        a(R.drawable.btn_back_2, "NHỊP SINH HỌC", 0);
        this.M = (LineChart) findViewById(R.id.lineChartNSH);
        this.y = (SquareImageView) findViewById(R.id.btnPrevious);
        this.z = (SquareImageView) findViewById(R.id.btnNext);
        this.N = (ViewPager) findViewById(R.id.show);
        this.w = (TextView) findViewById(R.id.selecNgaySinh);
        this.n = (TextView) findViewById(R.id.countDates);
        this.o = (TextView) findViewById(R.id.countYears);
        this.p = (TextView) findViewById(R.id.textDescroption1);
        this.p.setTextColor(vn.net.vac.base.c.b.a);
        this.q = (TextView) findViewById(R.id.textDescroption2);
        this.q.setTextColor(vn.net.vac.base.c.b.b);
        this.r = (TextView) findViewById(R.id.textDescroption3);
        this.r.setTextColor(vn.net.vac.base.c.b.c);
        this.s = (TextView) findViewById(R.id.textDescroption4);
        this.s.setTextColor(vn.net.vac.base.c.b.d);
        this.t = (TextView) findViewById(R.id.textDescroption5);
        this.t.setTextColor(vn.net.vac.base.c.b.e);
        this.u = (TextView) findViewById(R.id.textDescroption6);
        this.u.setTextColor(vn.net.vac.base.c.b.f);
        this.A = (CheckBox) findViewById(R.id.checkb1);
        this.B = (CheckBox) findViewById(R.id.checkb2);
        this.C = (CheckBox) findViewById(R.id.checkb3);
        this.D = (CheckBox) findViewById(R.id.checkb4);
        this.E = (CheckBox) findViewById(R.id.checkb5);
        this.F = (CheckBox) findViewById(R.id.checkb6);
        this.x = (ImageView) findViewById(R.id.today);
        this.v = (TextView) findViewById(R.id.lblDate);
        this.N = (ViewPager) findViewById(R.id.show);
        w();
    }

    private void B() {
        this.Q = this.O.get(1) - this.P.get(1);
        this.S = (int) a(this.P, this.O);
        b(this.S, this.Q);
        c(this.R);
        z();
        w();
        this.N.getAdapter().b();
    }

    private List<String> r() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            arrayList.add(i, vn.net.vac.base.c.d.a(vn.net.vac.base.c.d.a(vn.net.vac.base.c.d.a(this.O.getTime()), i), "yyyy/MM/dd HH:mm:ss", "d/M"));
        }
        return arrayList;
    }

    private void s() {
        this.M.setOnChartValueSelectedListener(this);
        this.M.setDragEnabled(true);
        this.M.setScaleYEnabled(false);
        String str = "";
        this.M.setDescription(str);
        this.M.setDrawGridBackground(false);
        this.M.setHighlightPerDragEnabled(true);
        this.M.setHighlightPerTapEnabled(true);
        this.M.getLegend().setEnabled(false);
        this.M.setNoDataText(str);
        this.M.setNoDataTextDescription(str);
        this.M.getAxisRight().setEnabled(false);
        this.M.setDoubleTapToZoomEnabled(false);
        this.M.setData(b(this.R));
        YAxis axisLeft = this.M.getAxisLeft();
        axisLeft.setStartAtZero(false);
        axisLeft.setAxisMaxValue(100.0f);
        axisLeft.setAxisMinValue(0.0f);
        axisLeft.setDrawGridLines(true);
        axisLeft.setDrawAxisLine(true);
        XAxis xAxis = this.M.getXAxis();
        xAxis.setPosition(XAxisPosition.BOTTOM);
        xAxis.setTextColor(-65536);
        xAxis.setDrawGridLines(true);
        xAxis.setDrawAxisLine(true);
        xAxis.setSpaceBetweenLabels(0);
        xAxis.setValueFormatter(new vn.net.vac.base.view.d.a(r()));
    }

    private void t() {
        this.w.setOnClickListener(new d());
        this.p.setOnClickListener(this.Y);
        this.q.setOnClickListener(this.Y);
        this.r.setOnClickListener(this.Y);
        this.s.setOnClickListener(this.Y);
        this.t.setOnClickListener(this.Y);
        this.u.setOnClickListener(this.Y);
        this.A.setOnClickListener(this.Z);
        this.B.setOnClickListener(this.Z);
        this.C.setOnClickListener(this.Z);
        this.D.setOnClickListener(this.Z);
        this.E.setOnClickListener(this.Z);
        this.F.setOnClickListener(this.Z);
        this.x.setOnClickListener(new e());
    }

    private void u() {
        this.W = vn.net.vac.base.c.k.a((Context) this);
        String[] a = this.W.a();
        this.P.set(5, Integer.parseInt(a[0]));
        this.P.set(2, Integer.parseInt(a[1]));
        this.P.set(1, Integer.parseInt(a[2]));
        B();
    }

    private void v() {
        this.G = a(m.SUC_KHOE);
        this.H = a(m.TINH_CAM);
        this.I = a(m.TRI_TUE);
        this.J = a(m.TINH_THAN);
        this.K = a(m.THAM_MY);
        this.L = a(m.TRUC_GIAC);
    }

    private void w() {
        this.v.setText("Hôm nay");
        this.x.setVisibility(8);
    }

    private void x() {
        vn.net.vac.base.c.g.a((Context) this, findViewById(R.id.layoutNhipSinhHoc), 10);
        vn.net.vac.base.c.g.a((Context) this, 15, (TextView) findViewById(R.id.selecNgaySinh));
        vn.net.vac.base.c.g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void y() {
        this.U = new HashMap();
        for (int i = 0; i < 30; i++) {
            o oVar = new o(((Entry) this.G.get(i)).getVal(), ((Entry) this.H.get(i)).getVal(), ((Entry) this.I.get(i)).getVal(), ((Entry) this.J.get(i)).getVal(), ((Entry) this.K.get(i)).getVal(), ((Entry) this.L.get(i)).getVal());
            Map map = this.U;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            map.put(stringBuilder.toString(), oVar);
        }
    }

    private void z() {
        y();
        this.N.setAdapter(new n(c(), this.U));
        this.N.a(new l());
        this.y.setOnClickListener(new a());
        this.z.setOnClickListener(new b());
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_nhip_sinh_hoc);
        A();
        u();
        t();
        s();
        z();
        x();
        j();
    }

    public void onNothingSelected() {
        Log.i("Nothing selected", "Nothing selected.");
    }

    public void onValueSelected(Entry entry, int i, Highlight highlight) {
        Log.i("Entry selected", entry.toString());
        this.N.a(entry.getXIndex(), true);
    }

    private void q() {
        Dialog dialog = new Dialog(this, R.style.FullHeightLight);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_date_picker);
        CustomDatePicker customDatePicker = (CustomDatePicker) dialog.findViewById(R.id.datePicker);
        customDatePicker.setDescendantFocusability(393216);
        customDatePicker.setMaxDate(this.O.getTime().getTime());
        customDatePicker.setCalendarViewShown(false);
        customDatePicker.init(this.P.get(1), this.P.get(2), this.P.get(5), new h(this));
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        vn.net.vac.base.c.g.a((Context) this, 16, (TextView) dialog.findViewById(R.id.dialogTitle));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnChoose));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new i(this, dialog));
        dialog.findViewById(R.id.dialogBtnChoose).setOnClickListener(new j(dialog, customDatePicker));
        dialog.show();
    }

    private void b(int i, int i2) {
        TextView textView = this.n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(" ngày");
        textView.setText(stringBuilder.toString());
        TextView textView2 = this.o;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(i2);
        stringBuilder2.append(" năm");
        textView2.setText(stringBuilder2.toString());
        this.w.setText(String.format("%s/%s/%s", new Object[]{Integer.valueOf(this.P.get(5)), Integer.valueOf(this.P.get(2) + 1), Integer.valueOf(this.P.get(1))}));
    }

    private void c(int i) {
        this.M.setData(b(i));
        this.M.invalidate();
    }

    private float c(int i, int i2) {
        double d = (double) i;
        Double.isNaN(d);
        d *= 6.283185307179586d;
        double d2 = (double) i2;
        Double.isNaN(d2);
        return (float) (((Math.sin(d / d2) + 1.0d) * 100.0d) * 0.5d);
    }

    private void a(LineDataSet lineDataSet) {
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setHighLightColor(Color.rgb(233, 37, 47));
        lineDataSet.setHighlightLineWidth(3.0f);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
    }

    /* Access modifiers changed, original: protected */
    public LineData b(int i) {
        LineDataSet lineDataSet;
        v();
        List arrayList = new ArrayList();
        if ((m.SUC_KHOE.a() & i) != 0) {
            lineDataSet = new LineDataSet(this.G, "Sức khỏe");
            lineDataSet.setColor(vn.net.vac.base.c.b.a);
            a(lineDataSet);
            arrayList.add(lineDataSet);
        }
        if ((m.TINH_CAM.a() & i) != 0) {
            lineDataSet = new LineDataSet(this.H, "Tình cảm");
            lineDataSet.setColor(vn.net.vac.base.c.b.b);
            a(lineDataSet);
            arrayList.add(lineDataSet);
        }
        if ((m.TRI_TUE.a() & i) != 0) {
            lineDataSet = new LineDataSet(this.I, "Trí tuệ");
            lineDataSet.setColor(vn.net.vac.base.c.b.c);
            a(lineDataSet);
            arrayList.add(lineDataSet);
        }
        if ((m.TINH_THAN.a() & i) != 0) {
            lineDataSet = new LineDataSet(this.J, "Tinh thần");
            lineDataSet.setColor(vn.net.vac.base.c.b.d);
            a(lineDataSet);
            arrayList.add(lineDataSet);
        }
        if ((m.THAM_MY.a() & i) != 0) {
            lineDataSet = new LineDataSet(this.K, "Thẩm mỹ");
            lineDataSet.setColor(vn.net.vac.base.c.b.e);
            a(lineDataSet);
            arrayList.add(lineDataSet);
        }
        if ((i & m.TRUC_GIAC.a()) != 0) {
            LineDataSet lineDataSet2 = new LineDataSet(this.L, "Trực giác");
            lineDataSet2.setColor(vn.net.vac.base.c.b.f);
            a(lineDataSet2);
            arrayList.add(lineDataSet2);
        }
        return new LineData(ChartData.generateXVals(0, arrayList.size() > 0 ? Math.max(((LineDataSet) arrayList.get(0)).getEntryCount(), ((LineDataSet) arrayList.get(0)).getEntryCount()) : 0), arrayList);
    }

    /* JADX WARNING: Missing block: B:4:0x0015, code skipped:
            if (r2 >= 30) goto L_0x002b;
     */
    /* JADX WARNING: Missing block: B:5:0x0017, code skipped:
            r0.add(new com.github.mikephil.charting.data.Entry(c(r5.S + r2, 38), r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:6:0x002b, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:7:0x002c, code skipped:
            if (r2 >= 30) goto L_0x0042;
     */
    /* JADX WARNING: Missing block: B:8:0x002e, code skipped:
            r0.add(new com.github.mikephil.charting.data.Entry(c(r5.S + r2, 43), r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:9:0x0042, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:10:0x0043, code skipped:
            if (r2 >= 30) goto L_0x0059;
     */
    /* JADX WARNING: Missing block: B:11:0x0045, code skipped:
            r0.add(new com.github.mikephil.charting.data.Entry(c(r5.S + r2, 53), r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:12:0x0059, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:13:0x005a, code skipped:
            if (r2 >= 30) goto L_0x0070;
     */
    /* JADX WARNING: Missing block: B:14:0x005c, code skipped:
            r0.add(new com.github.mikephil.charting.data.Entry(c(r5.S + r2, 33), r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:15:0x0070, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:16:0x0071, code skipped:
            if (r2 >= 30) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:17:0x0073, code skipped:
            r0.add(new com.github.mikephil.charting.data.Entry(c(r5.S + r2, 28), r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:18:0x0087, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:19:0x0088, code skipped:
            if (r2 >= 30) goto L_0x009e;
     */
    /* JADX WARNING: Missing block: B:20:0x008a, code skipped:
            r0.add(new com.github.mikephil.charting.data.Entry(c(r5.S + r2, 23), r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:21:0x009e, code skipped:
            return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private List<Entry> a(m mVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        switch (c.a[mVar.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                return null;
        }
    }

    public static long a(Calendar calendar, Calendar calendar2) {
        return TimeUnit.MILLISECONDS.toDays(calendar2.getTimeInMillis() - calendar.getTimeInMillis());
    }

    private void b(String str, String str2) {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_msg_nsh);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.dialogTitle)).setText(str);
        ((TextView) dialog.findViewById(R.id.dialogMsg)).setText(str2);
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogTitle));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogMsg));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new k(this, dialog));
        dialog.show();
    }

    private void b(String str) {
        this.V = (o) this.U.get(str);
        if (this.V == null) {
            this.V = new o(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            this.U.put(str, this.V);
        }
    }
}
