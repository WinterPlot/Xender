package com.userlabs.xshare.utils;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class v implements SensorEventListener {
    private SensorManager a;
    private long e;
    private long g;
    private long h;
    private Runnable i;
    private float b = -1.0f;
    private float c = -1.0f;
    private float d = -1.0f;
    private int f = 0;

    public v(Runnable runnable) {
        this.i = runnable;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.h > 500) {
            this.f = 0;
        }
        long j = this.e;
        if (jCurrentTimeMillis - j > 100) {
            float[] fArr = sensorEvent.values;
            if ((Math.abs(((((fArr[0] + fArr[1]) + fArr[2]) - this.b) - this.c) - this.d) / (jCurrentTimeMillis - j)) * 10000.0f > 350.0f) {
                int i = this.f + 1;
                this.f = i;
                if (i >= 3 && jCurrentTimeMillis - this.g > 1000) {
                    this.g = jCurrentTimeMillis;
                    this.f = 0;
                    Runnable runnable = this.i;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                this.h = jCurrentTimeMillis;
            }
            this.e = jCurrentTimeMillis;
            float[] fArr2 = sensorEvent.values;
            this.b = fArr2[0];
            this.c = fArr2[1];
            this.d = fArr2[2];
        }
    }

    public void pause() {
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.a = null;
        }
    }

    public void resume() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            sensorManager = (SensorManager) com.userlabs.xshare.core.c.getInstance().getSystemService("sensor");
            this.a = sensorManager;
        }
        if (sensorManager == null || sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 1)) {
            return;
        }
        this.a.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
