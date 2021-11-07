package vn.net.vac.base.view.alphabet_list.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.SectionIndexer;

/* compiled from: IndexScroller */
public class a {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private int g = 0;
    private int h;
    private int i;
    private int j = -1;
    private boolean k = false;
    private ListView l = null;
    private SectionIndexer m = null;
    private String[] n = null;
    private RectF o;
    private Handler p = new a();

    /* compiled from: IndexScroller */
    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int a = a.this.g;
            a aVar;
            if (a == 1) {
                aVar = a.this;
                double b = (double) aVar.f;
                double b2 = (double) (1.0f - a.this.f);
                Double.isNaN(b2);
                b2 *= 0.2d;
                Double.isNaN(b);
                aVar.f = (float) (b + b2);
                if (((double) a.this.f) > 0.9d) {
                    a.this.f = 1.0f;
                    a.this.a(2);
                }
                a.this.l.invalidate();
                a.this.a(10);
            } else if (a == 2) {
                a.this.a(3);
            } else if (a == 3) {
                aVar = a.this;
                double b3 = (double) aVar.f;
                double b4 = (double) a.this.f;
                Double.isNaN(b4);
                b4 *= 0.2d;
                Double.isNaN(b3);
                aVar.f = (float) (b3 - b4);
                if (((double) a.this.f) < 0.1d) {
                    a.this.f = 0.0f;
                    a.this.a(0);
                }
                a.this.l.invalidate();
                a.this.a(10);
            }
        }
    }

    public a(Context context, ListView listView) {
        this.d = context.getResources().getDisplayMetrics().density;
        this.e = context.getResources().getDisplayMetrics().scaledDensity;
        this.l = listView;
        a(this.l.getAdapter());
        float f = this.d;
        this.a = 20.0f * f;
        this.b = 10.0f * f;
        this.c = f * 5.0f;
    }

    public void b() {
        int i = this.g;
        if (i == 0) {
            a(1);
        } else if (i == 3) {
            a(3);
        }
    }

    public void a(Canvas canvas) {
        if (this.g != 0) {
            Paint paint = new Paint();
            paint.setColor(-16777216);
            paint.setAlpha((int) (this.f * 64.0f));
            paint.setAntiAlias(true);
            RectF rectF = this.o;
            float f = this.d;
            canvas.drawRoundRect(rectF, f * 5.0f, f * 5.0f, paint);
            String[] strArr = this.n;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                if (this.j >= 0) {
                    paint = new Paint();
                    paint.setColor(-16777216);
                    paint.setAlpha(96);
                    paint.setAntiAlias(true);
                    paint.setShadowLayer(3.0f, 0.0f, 0.0f, Color.argb(64, 0, 0, 0));
                    Paint paint2 = new Paint();
                    paint2.setColor(-1);
                    paint2.setAntiAlias(true);
                    paint2.setTextSize(this.e * 50.0f);
                    float measureText = paint2.measureText(this.n[this.j]);
                    float descent = ((this.c * 2.0f) + paint2.descent()) - paint2.ascent();
                    int i2 = this.h;
                    float f2 = (((float) i2) - descent) / 2.0f;
                    int i3 = this.i;
                    RectF rectF2 = new RectF(f2, (((float) i3) - descent) / 2.0f, ((((float) i2) - descent) / 2.0f) + descent, ((((float) i3) - descent) / 2.0f) + descent);
                    float f3 = this.d;
                    canvas.drawRoundRect(rectF2, f3 * 5.0f, f3 * 5.0f, paint);
                    canvas.drawText(this.n[this.j], (rectF2.left + ((descent - measureText) / 2.0f)) - 1.0f, ((rectF2.top + this.c) - paint2.ascent()) + 1.0f, paint2);
                }
                paint = new Paint();
                paint.setColor(-1);
                paint.setAlpha((int) (this.f * 255.0f));
                paint.setAntiAlias(true);
                paint.setTextSize(this.e * 12.0f);
                float height = (this.o.height() - (this.b * 2.0f)) / ((float) this.n.length);
                float descent2 = (height - (paint.descent() - paint.ascent())) / 2.0f;
                while (true) {
                    String[] strArr2 = this.n;
                    if (i >= strArr2.length) {
                        break;
                    }
                    float measureText2 = (this.a - paint.measureText(strArr2[i])) / 2.0f;
                    String str = this.n[i];
                    RectF rectF3 = this.o;
                    canvas.drawText(str, rectF3.left + measureText2, (((rectF3.top + this.b) + (((float) i) * height)) + descent2) - paint.ascent(), paint);
                    i++;
                }
            }
        }
    }

    public boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.k) {
                    this.k = false;
                    this.j = -1;
                }
                if (this.g == 2) {
                    a(3);
                }
            } else if (action == 2 && this.k) {
                if (a(motionEvent.getX(), motionEvent.getY())) {
                    this.j = a(motionEvent.getY());
                    this.l.setSelection(this.m.getPositionForSection(this.j));
                }
                return true;
            }
        } else if (this.g != 0 && a(motionEvent.getX(), motionEvent.getY())) {
            a(2);
            this.k = true;
            this.j = a(motionEvent.getY());
            this.l.setSelection(this.m.getPositionForSection(this.j));
            return true;
        }
        return false;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.h = i;
        this.i = i2;
        float f = (float) i;
        float f2 = this.b;
        this.o = new RectF((f - f2) - this.a, f2, f - f2, ((float) i2) - f2);
    }

    public void a() {
        if (this.g == 2) {
            a(3);
        }
    }

    public void a(Adapter adapter) {
        if (adapter instanceof SectionIndexer) {
            this.m = (SectionIndexer) adapter;
            this.n = (String[]) this.m.getSections();
        }
    }

    private void a(int i) {
        if (i >= 0 && i <= 3) {
            this.g = i;
            i = this.g;
            if (i == 0) {
                this.p.removeMessages(0);
            } else if (i == 1) {
                this.f = 0.0f;
                a(0);
            } else if (i == 2) {
                this.p.removeMessages(0);
            } else if (i == 3) {
                this.f = 1.0f;
                a(3000);
            }
        }
    }

    public boolean a(float f, float f2) {
        RectF rectF = this.o;
        if (f >= rectF.left) {
            f = rectF.top;
            if (f2 >= f && f2 <= f + rectF.height()) {
                return true;
            }
        }
        return false;
    }

    private int a(float f) {
        String[] strArr = this.n;
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        RectF rectF = this.o;
        float f2 = rectF.top;
        if (f < this.b + f2) {
            return 0;
        }
        f2 += rectF.height();
        float f3 = this.b;
        if (f >= f2 - f3) {
            return this.n.length - 1;
        }
        RectF rectF2 = this.o;
        return (int) (((f - rectF2.top) - f3) / ((rectF2.height() - (this.b * 2.0f)) / ((float) this.n.length)));
    }

    private void a(long j) {
        this.p.removeMessages(0);
        this.p.sendEmptyMessageAtTime(0, SystemClock.uptimeMillis() + j);
    }
}
