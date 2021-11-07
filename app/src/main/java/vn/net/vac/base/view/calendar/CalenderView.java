package vn.net.vac.base.view.calendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import vn.net.vac.base.c.g;

public class CalenderView extends LinearLayout {
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    private static View q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    private String a;
    private Calendar b = Calendar.getInstance();
    private f c = null;
    private LinearLayout d;
    private ImageView e;
    private ImageView f;
    private TextView g;
    private GridView h;
    private RelativeLayout i;
    int[] j = new int[]{R.color.summer, R.color.fall, R.color.winter, R.color.spring};
    List<Integer> k = new ArrayList();
    List<Integer> l = new ArrayList();
    int[] m;
    protected float n;
    protected float o;
    public int p;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            CalenderView.this.b.add(2, 1);
            CalenderView calenderView = CalenderView.this;
            calenderView.p = 2;
            calenderView.b();
        }
    }

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            CalenderView.this.b.add(2, -1);
            CalenderView calenderView = CalenderView.this;
            calenderView.p = 1;
            calenderView.b();
        }
    }

    class c implements OnItemClickListener {
        c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (CalenderView.q != null) {
                CalenderView.q.setBackgroundColor(Color.parseColor("#fffcd1"));
            }
            CalenderView.q = view;
            if (view.isEnabled()) {
                view.setBackgroundColor(Color.parseColor("#feb568"));
                CalenderView.this.c.a((Date) adapterView.getItemAtPosition(i));
            }
        }
    }

    class d implements OnTouchListener {
        d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                CalenderView.this.n = motionEvent.getX();
                CalenderView.this.o = motionEvent.getY();
            } else if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                CalenderView calenderView = CalenderView.this;
                calenderView.a(x, x - calenderView.n, y, y - calenderView.o);
            } else if (action == 3) {
                return true;
            }
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return false;
        }
    }

    private class e extends ArrayAdapter<Date> {
        private HashSet<Date> a;
        private LayoutInflater b;
        private int c;

        public e(Context context, ArrayList<Date> arrayList, HashSet<Date> hashSet, int i) {
            super(context, 0, arrayList);
            this.a = hashSet;
            this.c = i;
            this.b = LayoutInflater.from(context);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime((Date) getItem(i));
            int i2 = gregorianCalendar.get(5);
            int i3 = gregorianCalendar.get(2);
            int i4 = gregorianCalendar.get(1);
            Date date = new Date();
            View inflate = view == null ? this.b.inflate(R.layout.control_calendar_day, viewGroup, false) : view;
            HashSet hashSet = this.a;
            String str = "#feb568";
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Date date2 = (Date) it.next();
                    if (date2.getDate() == i2 && date2.getMonth() == i3 && date2.getYear() == i4) {
                        inflate.setBackgroundColor(Color.parseColor(str));
                        break;
                    }
                }
            }
            TextView textView = (TextView) inflate.findViewById(R.id.ngayDuong);
            TextView textView2 = (TextView) inflate.findViewById(R.id.ngayAm);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.imgNgayHoangDao);
            g.a(CalenderView.this.getContext(), 14, textView);
            textView.setTextColor(-16777216);
            int i5 = i3 + 1;
            String str2 = "#fc021a";
            if (vn.net.vac.base.c.a.a.p(i2, i5, i4) || vn.net.vac.base.c.a.a.o(i2, i5, i4)) {
                textView2.setTextColor(Color.parseColor(str2));
            }
            if (vn.net.vac.base.c.a.a.q(i2, i5, i4)) {
                textView.setTextColor(Color.parseColor(str2));
            }
            if (CalenderView.this.l.size() == 3) {
                date.getMonth();
                ((Integer) CalenderView.this.l.get(1)).intValue();
                date.getMonth();
                ((Integer) CalenderView.this.l.get(1)).intValue();
                if (date.getMonth() == i3 && this.c == i2) {
                    textView.setTextColor(Color.parseColor("#990099"));
                    if (CalenderView.q != null) {
                        CalenderView.q.setBackgroundColor(Color.parseColor("#fffcd1"));
                    }
                    CalenderView.q = inflate;
                    CalenderView.q.setBackgroundColor(Color.parseColor(str));
                }
                if (i3 == ((Integer) CalenderView.this.l.get(0)).intValue()) {
                    textView.setEnabled(false);
                    textView.setTextColor(CalenderView.this.getResources().getColor(R.color.greyed_out));
                    textView2.setTextColor(CalenderView.this.getResources().getColor(R.color.greyed_out));
                    imageView.setAlpha(0.5f);
                } else if (i3 == ((Integer) CalenderView.this.l.get(2)).intValue()) {
                    textView.setEnabled(false);
                    textView.setTextColor(CalenderView.this.getResources().getColor(R.color.greyed_out));
                    textView2.setTextColor(CalenderView.this.getResources().getColor(R.color.greyed_out));
                    imageView.setAlpha(0.5f);
                }
            } else {
                date.getMonth();
                ((Integer) CalenderView.this.l.get(0)).intValue();
                if (i3 == ((Integer) CalenderView.this.l.get(1)).intValue()) {
                    textView.setTextColor(CalenderView.this.getResources().getColor(R.color.greyed_out));
                    textView2.setTextColor(CalenderView.this.getResources().getColor(R.color.greyed_out));
                    imageView.setAlpha(0.5f);
                }
            }
            textView.setText(String.valueOf(i2));
            StringBuilder stringBuilder;
            if (1 == vn.net.vac.base.c.a.a.u(i2, i5, i4)[0] || 15 == vn.net.vac.base.c.a.a.u(i2, i5, i4)[0]) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(vn.net.vac.base.c.a.a.u(i2, i5, i4)[0]);
                stringBuilder.append("/");
                stringBuilder.append(vn.net.vac.base.c.a.a.u(i2, i5, i4)[1]);
                textView2.setText(stringBuilder.toString());
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(vn.net.vac.base.c.a.a.u(i2, i5, i4)[0]);
                textView2.setText(stringBuilder.toString());
            }
            if (vn.net.vac.base.c.a.a.s(i2, i5, i4) == 1) {
                imageView.setImageResource(R.drawable.star_1);
            } else if (vn.net.vac.base.c.a.a.s(i2, i5, i4) == 0) {
                imageView.setImageResource(R.drawable.star_0);
            } else {
                imageView.setVisibility(4);
            }
            return inflate;
        }
    }

    public interface f {
        void a(Date date);
    }

    public CalenderView(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        arrayList = new ArrayList();
        this.m = new int[]{2, 2, 3, 3, 3, 0, 0, 0, 1, 1, 1, 2};
        this.p = 0;
    }

    private void d() {
        this.f.setOnClickListener(new a());
        this.e.setOnClickListener(new b());
        this.h.setOnItemClickListener(new c());
        this.h.setOnTouchListener(new d());
    }

    private void e() {
        this.d = (LinearLayout) findViewById(R.id.calenderheader);
        this.e = (ImageView) findViewById(R.id.previousarrow);
        this.f = (ImageView) findViewById(R.id.nextarrow);
        this.g = (TextView) findViewById(R.id.monthname);
        this.h = (GridView) findViewById(R.id.gridview);
        this.i = (RelativeLayout) findViewById(R.id.rlCalendar);
        g.a(getContext(), 16, this.g);
        g.a(getContext(), this.d, 14);
    }

    public Calendar getCurrentDate() {
        return this.b;
    }

    public void setEventHandler(f fVar) {
        this.c = fVar;
    }

    public void b() {
        int i = this.p;
        TranslateAnimation translateAnimation = i == 4 ? new TranslateAnimation(0.0f, 0.0f, (float) this.h.getHeight(), 0.0f) : i == 8 ? new TranslateAnimation(0.0f, 0.0f, (float) (-this.h.getHeight()), 0.0f) : i == 2 ? new TranslateAnimation((float) (-this.h.getWidth()), 0.0f, 0.0f, 0.0f) : i == 1 ? new TranslateAnimation((float) this.h.getWidth(), 0.0f, 0.0f, 0.0f) : null;
        if (translateAnimation != null) {
            translateAnimation.setDuration(500);
            translateAnimation.setFillAfter(true);
            this.i.startAnimation(translateAnimation);
        }
        a(null, D);
    }

    private void a(Context context, AttributeSet attributeSet) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.control_calender, this);
        a(attributeSet);
        e();
        d();
        b();
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vn.net.vac.base.a.CalendarView);
        try {
            this.a = obtainStyledAttributes.getString(14);
            if (this.a == null) {
                this.a = "M/yyyy";
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    public CalenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
        arrayList = new ArrayList();
        this.m = new int[]{2, 2, 3, 3, 3, 0, 0, 0, 1, 1, 1, 2};
        this.p = 0;
        a(context, attributeSet);
    }

    public void a() {
        this.b.set(5, Calendar.getInstance().get(5));
        this.b.set(2, Calendar.getInstance().get(2));
        this.b.set(1, Calendar.getInstance().get(1));
        b();
    }

    public void a(HashSet<Date> hashSet, int i) {
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;
        w = 0;
        x = 0;
        y = 0;
        z = 0;
        A = 0;
        B = 0;
        C = 0;
        D = i;
        this.l.clear();
        ArrayList arrayList = new ArrayList();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) this.b.clone();
        gregorianCalendar.set(5, 1);
        gregorianCalendar.add(5, -(gregorianCalendar.get(7) - 1));
        this.k.clear();
        while (arrayList.size() < 42) {
            arrayList.add(gregorianCalendar.getTime());
            this.k.add(Integer.valueOf(gregorianCalendar.get(2)));
            gregorianCalendar.add(5, 1);
        }
        for (i = 0; i < this.k.size(); i++) {
            a(((Integer) this.k.get(i)).intValue());
        }
        this.h.setAdapter(new e(getContext(), arrayList, hashSet, D));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.a);
        this.g.setText(String.format("THÁNG %d NĂM %d", new Object[]{Integer.valueOf(this.b.get(2) + 1), Integer.valueOf(this.b.get(1))}));
        int i2 = this.j[this.m[this.b.get(2)]];
    }

    public CalenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ArrayList arrayList = new ArrayList();
        arrayList = new ArrayList();
        this.m = new int[]{2, 2, 3, 3, 3, 0, 0, 0, 1, 1, 1, 2};
        this.p = 0;
        a(context, attributeSet);
    }

    public void a(int i) {
        switch (i) {
            case 0:
                r++;
                if (!this.l.contains(Integer.valueOf(0))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 1:
                s++;
                if (!this.l.contains(Integer.valueOf(1))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 2:
                t++;
                if (!this.l.contains(Integer.valueOf(2))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 3:
                u++;
                if (!this.l.contains(Integer.valueOf(3))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 4:
                v++;
                if (!this.l.contains(Integer.valueOf(4))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 5:
                w++;
                if (!this.l.contains(Integer.valueOf(5))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 6:
                x++;
                if (!this.l.contains(Integer.valueOf(6))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 7:
                y++;
                if (!this.l.contains(Integer.valueOf(7))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 8:
                z++;
                if (!this.l.contains(Integer.valueOf(8))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 9:
                A++;
                if (!this.l.contains(Integer.valueOf(9))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 10:
                B++;
                if (!this.l.contains(Integer.valueOf(10))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            case 11:
                C++;
                if (!this.l.contains(Integer.valueOf(11))) {
                    this.l.add(Integer.valueOf(i));
                    return;
                }
                return;
            default:
                return;
        }
    }

    private boolean a(float f, float f2, float f3, float f4) {
        int i = 0;
        this.p = 0;
        int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        f2 = Math.abs(f2);
        f4 = Math.abs(f4);
        float f5 = (float) minimumFlingVelocity;
        if (f2 > f5 || f4 > f5) {
            Object obj = f4 >= f2 ? 1 : null;
            if (obj != 1 ? f >= this.n : f3 >= this.o) {
                i = 1;
            }
            int i2 = -1;
            Calendar calendar;
            if (obj == 1) {
                calendar = this.b;
                if (i != 0) {
                    i2 = 1;
                }
                calendar.add(1, i2);
                this.p = i != 0 ? 4 : 8;
            } else {
                calendar = this.b;
                if (i != 0) {
                    i2 = 1;
                }
                int i3 = 2;
                calendar.add(2, i2);
                if (i != 0) {
                    i3 = 1;
                }
                this.p = i3;
            }
            b();
        }
        return true;
    }
}
