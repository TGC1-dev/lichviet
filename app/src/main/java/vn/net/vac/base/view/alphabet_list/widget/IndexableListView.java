package vn.net.vac.base.view.alphabet_list.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class IndexableListView extends ListView {
    private boolean a = false;
    private a b = null;
    private GestureDetector c = null;

    class a extends SimpleOnGestureListener {
        a() {
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (IndexableListView.this.b != null) {
                IndexableListView.this.b.b();
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    public IndexableListView(Context context) {
        super(context);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(canvas);
        }
    }

    public boolean isFastScrollEnabled() {
        return this.a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b.a(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(i, i2, i3, i4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar = this.b;
        if (aVar != null && aVar.a(motionEvent)) {
            return true;
        }
        if (this.c == null) {
            this.c = new GestureDetector(getContext(), new a());
        }
        this.c.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setFastScrollEnabled(boolean z) {
        this.a = z;
        if (!this.a) {
            a aVar = this.b;
            if (aVar != null) {
                aVar.a();
                this.b = null;
            }
        } else if (this.b == null) {
            this.b = new a(getContext(), this);
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a((Adapter) listAdapter);
        }
    }

    public IndexableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IndexableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
