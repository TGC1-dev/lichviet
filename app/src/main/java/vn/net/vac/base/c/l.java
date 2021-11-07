package vn.net.vac.base.c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: ShakeListener */
public class l implements SensorEventListener {
    private SensorManager a;
    private Sensor b;
    private a c;
    private Context d;
    private float e;
    private float f;
    private float g;
    private long h;

    /* compiled from: ShakeListener */
    public interface a {
        void a();
    }

    public l(Context context) {
        this.d = context;
        a();
    }

    public void a() {
        this.a = (SensorManager) this.d.getSystemService("sensor");
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(1);
        }
        Sensor sensor = this.b;
        if (sensor != null) {
            this.a.registerListener(this, sensor, 1);
        }
    }

    public void b() {
        this.a.unregisterListener(this);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.h;
        if (j >= 60) {
            this.h = currentTimeMillis;
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            f -= this.e;
            f2 -= this.f;
            float f3 = fArr[2] - this.g;
            double sqrt = Math.sqrt((double) (((f * f) + (f2 * f2)) + (f3 * f3)));
            double d = (double) j;
            Double.isNaN(d);
            if ((sqrt / d) * 10000.0d >= 3000.0d) {
                this.c.a();
            }
        }
    }

    public void a(a aVar) {
        this.c = aVar;
    }
}
