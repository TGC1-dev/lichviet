package vn.net.vac.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.h2team.android.lichvannien.R;

public class AmduongNguhanhView extends RelativeLayout {
    private ImageView a;
    private ImageView b;
    private float c = 0.55f;

    class a implements Runnable {
        a() {
        }

        public void run() {
            AmduongNguhanhView.this.a.getLayoutParams().height = (int) (((float) AmduongNguhanhView.this.b.getHeight()) * AmduongNguhanhView.this.c);
            AmduongNguhanhView.this.a.getLayoutParams().width = (int) (((float) AmduongNguhanhView.this.b.getWidth()) * AmduongNguhanhView.this.c);
        }
    }

    public AmduongNguhanhView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
        b();
    }

    private void b() {
        this.a = (ImageView) findViewById(R.id.imgAmDuong);
        this.b = (ImageView) findViewById(R.id.imgNguHanh);
        this.b.post(new a());
        float f = this.c;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 2, f / 2.0f, 2, f / 2.0f);
        rotateAnimation.setDuration(10000);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.a.startAnimation(rotateAnimation);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_amduong_nguhanh, this, true);
    }
}
