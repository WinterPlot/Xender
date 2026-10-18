package com.userlabs.xshare.views.piechart;

import android.graphics.Color;
import com.userlabs.xshare.views.piechart.d;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T extends d> {
    protected ArrayList<Integer> a;
    protected ArrayList<T> b;
    protected float c = 0.0f;
    protected float d = 0.0f;
    private float e = 0.0f;

    public b(ArrayList<T> arrayList) {
        this.a = null;
        this.b = arrayList;
        if (arrayList == null) {
            this.b = new ArrayList<>();
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        this.a = arrayList2;
        arrayList2.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        calcMinMax();
        calcYValueSum();
    }

    private void calcYValueSum() {
        this.e = 0.0f;
        for (int i = 0; i < this.b.size(); i++) {
            T t = this.b.get(i);
            if (t != null) {
                this.e = Math.abs(t.getVal()) + this.e;
            }
        }
    }

    public void calcMinMax() {
        if (this.b.size() == 0) {
            return;
        }
        this.d = this.b.get(0).getVal();
        this.c = this.b.get(0).getVal();
        for (int i = 0; i < this.b.size(); i++) {
            T t = this.b.get(i);
            if (t != null) {
                if (t.getVal() < this.d) {
                    this.d = t.getVal();
                }
                if (t.getVal() > this.c) {
                    this.c = t.getVal();
                }
            }
        }
    }

    public int getColor(int i) {
        ArrayList<Integer> arrayList = this.a;
        return arrayList.get(i % arrayList.size()).intValue();
    }

    public int getEntryCount() {
        return this.b.size();
    }

    public float getYMax() {
        return this.c;
    }

    public float getYMin() {
        return this.d;
    }

    public ArrayList<T> getYVals() {
        return this.b;
    }

    public float getYValueSum() {
        return this.e;
    }

    public void setColors(ArrayList<Integer> arrayList) {
        this.a = arrayList;
    }

    public String toSimpleString() {
        return "DataSet, label: , entries: " + this.b.size() + "\n";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(toSimpleString());
        for (int i = 0; i < this.b.size(); i++) {
            stringBuffer.append(this.b.get(i).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
