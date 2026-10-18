package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class e {
    int a = -1;
    int b = -1;
    int c = -1;
    private SparseArray<a> d = new SparseArray<>();
    private c e = null;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        int a;
        ArrayList<b> b = new ArrayList<>();
        int c;
        boolean d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            this.d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == R.styleable.State_constraints) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        this.d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void add(b bVar) {
            this.b.add(bVar);
        }

        public int findMatch(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).match(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        float a;
        float b;
        float c;
        float d;
        int e;
        boolean f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            this.f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean match(float f, float f2) {
            if (!Float.isNaN(this.a) && f < this.a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f2 < this.b) {
                return false;
            }
            if (Float.isNaN(this.c) || f <= this.c) {
                return Float.isNaN(this.d) || f2 <= this.d;
            }
            return false;
        }
    }

    public e(Context context, XmlPullParser xmlPullParser) {
        load(context, xmlPullParser);
    }

    private void load(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.StateSet_defaultState) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xmlPullParser);
                                this.d.put(aVar.a, aVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.add(bVar);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    public int convertToConstraintSet(int i, int i2, float f, float f2) {
        a aVar = this.d.get(i2);
        if (aVar == null) {
            return i2;
        }
        int i3 = 0;
        if (f != -1.0f && f2 != -1.0f) {
            ArrayList<b> arrayList = aVar.b;
            int size = arrayList.size();
            b bVar = null;
            while (i3 < size) {
                b bVar2 = arrayList.get(i3);
                i3++;
                b bVar3 = bVar2;
                if (bVar3.match(f, f2)) {
                    if (i != bVar3.e) {
                        bVar = bVar3;
                    }
                }
            }
            return bVar != null ? bVar.e : aVar.c;
        }
        if (aVar.c != i) {
            ArrayList<b> arrayList2 = aVar.b;
            int size2 = arrayList2.size();
            while (i3 < size2) {
                b bVar4 = arrayList2.get(i3);
                i3++;
                if (i == bVar4.e) {
                }
            }
            return aVar.c;
        }
        return i;
    }

    public boolean needsToChange(int i, float f, float f2) {
        int i2 = this.b;
        if (i2 != i) {
            return true;
        }
        SparseArray<a> sparseArray = this.d;
        a aVarValueAt = i == -1 ? sparseArray.valueAt(0) : sparseArray.get(i2);
        int i3 = this.c;
        return (i3 == -1 || !aVarValueAt.b.get(i3).match(f, f2)) && this.c != aVarValueAt.findMatch(f, f2);
    }

    public void setOnConstraintsChanged(c cVar) {
        this.e = cVar;
    }

    public int stateGetConstraintID(int i, int i2, int i3) {
        return updateConstraints(-1, i, i2, i3);
    }

    public int updateConstraints(int i, int i2, float f, float f2) {
        int iFindMatch;
        if (i != i2) {
            a aVar = this.d.get(i2);
            if (aVar == null) {
                return -1;
            }
            int iFindMatch2 = aVar.findMatch(f, f2);
            return iFindMatch2 == -1 ? aVar.c : aVar.b.get(iFindMatch2).e;
        }
        SparseArray<a> sparseArray = this.d;
        a aVarValueAt = i2 == -1 ? sparseArray.valueAt(0) : sparseArray.get(this.b);
        if (aVarValueAt == null) {
            return -1;
        }
        if ((this.c == -1 || !aVarValueAt.b.get(i).match(f, f2)) && i != (iFindMatch = aVarValueAt.findMatch(f, f2))) {
            return iFindMatch == -1 ? aVarValueAt.c : aVarValueAt.b.get(iFindMatch).e;
        }
        return i;
    }
}
