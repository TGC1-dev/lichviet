package vn.net.vac.base.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.l;
import vn.net.vac.base.c.m;
import vn.net.vac.base.dbmanager.model.Que;

public class GieoQueActivity extends BaseActivity {
    private l n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private TextView r;
    private Que s;
    private MediaPlayer t;
    private boolean u = false;

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            GieoQueActivity.this.q();
        }
    }

    class c implements Runnable {

        class a implements Runnable {

            class a implements OnClickListener {
                a() {
                }

                public void onClick(View view) {
                    Intent intent = new Intent(GieoQueActivity.this, GieoQueDetailActivity.class);
                    intent.putExtra("EXTRA_QUE", GieoQueActivity.this.s);
                    GieoQueActivity.this.startActivity(intent);
                }
            }

            a() {
            }

            public void run() {
                GieoQueActivity gieoQueActivity = GieoQueActivity.this;
                gieoQueActivity.u = gieoQueActivity.u ^ 1;
                GieoQueActivity.this.p.setVisibility(8);
                GieoQueActivity.this.r.setVisibility(0);
                GieoQueActivity.this.q.setVisibility(0);
                ((AnimationDrawable) GieoQueActivity.this.r.getBackground()).start();
                GieoQueActivity.this.r.setOnClickListener(new a());
            }
        }

        c() {
        }

        public void run() {
            GieoQueActivity.this.p.setVisibility(0);
            GieoQueActivity.this.p.startAnimation(AnimationUtils.loadAnimation(GieoQueActivity.this.getApplicationContext(), R.anim.animation_que));
            GieoQueActivity.this.s = vn.net.vac.base.b.a.h();
            GieoQueActivity.this.r.setText(GieoQueActivity.this.s.a);
            GieoQueActivity.this.t.pause();
            GieoQueActivity.this.t.seekTo(0);
            new Handler().postDelayed(new a(), 1350);
        }
    }

    class a implements vn.net.vac.base.c.l.a {

        class a implements Runnable {
            a() {
            }

            public void run() {
                GieoQueActivity.this.n.a();
            }
        }

        a() {
        }

        public void a() {
            GieoQueActivity.this.n.b();
            GieoQueActivity.this.q();
            new Handler().postDelayed(new a(), 2000);
        }
    }

    private void q() {
        boolean z = this.u;
        if (!z) {
            this.u = z ^ 1;
            this.t.start();
            this.r.setVisibility(8);
            this.q.setVisibility(8);
            this.o.setBackgroundResource(R.drawable.animation_gieo_que);
            AnimationDrawable animationDrawable = (AnimationDrawable) this.o.getBackground();
            animationDrawable.setOneShot(true);
            animationDrawable.setVisible(false, true);
            animationDrawable.start();
            new Handler().postDelayed(new c(), 2700);
        }
    }

    private void r() {
        this.r.setOnClickListener(new b());
    }

    private void s() {
    }

    private void t() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
        g.a((Context) this, 17, (TextView) findViewById(R.id.textViewGieoQue));
    }

    private void u() {
        a(R.drawable.btn_back_2, "GIEO QUẺ", R.drawable.facebook_share);
        this.o = (ImageView) findViewById(R.id.imageViewGieoQue);
        this.p = (ImageView) findViewById(R.id.imageViewQue);
        this.r = (TextView) findViewById(R.id.textViewGieoQue);
        this.q = (ImageView) findViewById(R.id.imageRight);
        this.q.setVisibility(8);
    }

    /* Access modifiers changed, original: protected */
    public void k() {
        new m(this).a();
    }

    public void onBackPressed() {
        l lVar = this.n;
        if (lVar != null) {
            lVar.b();
        }
        MediaPlayer mediaPlayer = this.t;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        super.onBackPressed();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_gieo_que);
        u();
        s();
        r();
        t();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        l lVar = this.n;
        if (lVar != null) {
            lVar.b();
        }
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        l lVar = this.n;
        if (lVar != null) {
            lVar.b();
        }
        MediaPlayer mediaPlayer = this.t;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        super.onPause();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        this.n = new l(this);
        this.n.a(new a());
        this.t = MediaPlayer.create(this, R.raw.gieo_que);
        super.onResume();
    }
}
