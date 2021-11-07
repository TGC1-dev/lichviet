package vn.net.vac.base.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.h2team.android.lichvannien.R;

public class ClearableEditText extends EditText implements OnTouchListener, OnFocusChangeListener {
    private Drawable a;
    private a b;
    private Boolean c = Boolean.valueOf(false);
    private OnTouchListener d;
    private OnFocusChangeListener e;

    public interface a {
        void a();
    }

    public ClearableEditText(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.a = getCompoundDrawables()[2];
        if (this.a == null) {
            this.a = getResources().getDrawable(R.drawable.ic_close);
        }
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
        setClearIconVisible(false);
        super.setOnTouchListener(this);
        super.setOnFocusChangeListener(this);
    }

    public void onFocusChange(View view, boolean z) {
        if ((!z || getText().toString().equals("")) && !this.c.booleanValue()) {
            setClearIconVisible(false);
        } else {
            setClearIconVisible(true);
        }
        OnFocusChangeListener onFocusChangeListener = this.e;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (isFocused() && !this.c.booleanValue()) {
            setClearIconVisible(getText().toString().equals("") ^ 1);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getCompoundDrawables()[2] != null) {
            if ((motionEvent.getX() > ((float) ((getWidth() - getPaddingRight()) - this.a.getIntrinsicWidth())) ? 1 : null) != null) {
                if (motionEvent.getAction() == 1) {
                    setText("");
                    a aVar = this.b;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
                return true;
            }
        }
        OnTouchListener onTouchListener = this.d;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void setClearIconVisible(boolean z) {
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], z ? this.a : null, getCompoundDrawables()[3]);
    }

    public void setIconAlwaysVisible(Boolean bool) {
        this.c = bool;
        if (bool.booleanValue()) {
            setClearIconVisible(true);
        }
    }

    public void setListener(a aVar) {
        this.b = aVar;
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.e = onFocusChangeListener;
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.d = onTouchListener;
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
