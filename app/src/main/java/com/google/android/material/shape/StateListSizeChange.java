package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.material.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class StateListSizeChange {
    int a;
    private a b;
    int[][] c = new int[10][];
    a[] d = new a[10];

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum SizeChangeType {
        PERCENT,
        PIXELS
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        SizeChangeType a;
        float b;

        public b(SizeChangeType sizeChangeType, float f) {
            this.a = sizeChangeType;
            this.b = f;
        }

        public int getChange(int i) {
            float f;
            SizeChangeType sizeChangeType = this.a;
            if (sizeChangeType == SizeChangeType.PERCENT) {
                f = this.b * i;
            } else {
                if (sizeChangeType != SizeChangeType.PIXELS) {
                    return 0;
                }
                f = this.b;
            }
            return (int) f;
        }
    }

    private void addStateSizeChange(int[] iArr, a aVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = aVar;
        }
        if (i >= this.c.length) {
            growArray(i, i + 10);
        }
        int[][] iArr2 = this.c;
        int i2 = this.a;
        iArr2[i2] = iArr;
        this.d[i2] = aVar;
        this.a = i2 + 1;
    }

    public static StateListSizeChange create(Context context, TypedArray typedArray, int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListSizeChange stateListSizeChange = new StateListSizeChange();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    stateListSizeChange.loadSizeChangeFromItems(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListSizeChange;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    private b getSizeChangeAmount(TypedArray typedArray, int i, b bVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new b(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new b(SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    private void growArray(int i, int i2) {
        int[][] iArr = new int[i2][];
        System.arraycopy(this.c, 0, iArr, 0, i);
        this.c = iArr;
        a[] aVarArr = new a[i2];
        System.arraycopy(this.d, 0, aVarArr, 0, i);
        this.d = aVarArr;
    }

    private int indexOfStateSet(int[] iArr) {
        int[][] iArr2 = this.c;
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    private void loadSizeChangeFromItems(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, R.styleable.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, R.styleable.StateListSizeChange, 0, 0);
                b sizeChangeAmount = getSizeChangeAmount(typedArrayObtainAttributes, R.styleable.StateListSizeChange_widthChange, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.widthChange) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                addStateSizeChange(StateSet.trimStateSet(iArr, i), new a(sizeChangeAmount));
            }
        }
    }

    public a getDefaultSizeChange() {
        return this.b;
    }

    public int getMaxWidthChange(int i) {
        float fMax;
        int i2 = -i;
        for (int i3 = 0; i3 < this.a; i3++) {
            b bVar = this.d[i3].a;
            SizeChangeType sizeChangeType = bVar.a;
            if (sizeChangeType == SizeChangeType.PIXELS) {
                fMax = Math.max(i2, bVar.b);
            } else {
                if (sizeChangeType == SizeChangeType.PERCENT) {
                    fMax = Math.max(i2, i * bVar.b);
                }
            }
            i2 = (int) fMax;
        }
        return i2;
    }

    public a getSizeChangeForState(int[] iArr) {
        int iIndexOfStateSet = indexOfStateSet(iArr);
        if (iIndexOfStateSet < 0) {
            iIndexOfStateSet = indexOfStateSet(StateSet.WILD_CARD);
        }
        return iIndexOfStateSet < 0 ? this.b : this.d[iIndexOfStateSet];
    }

    public boolean isStateful() {
        return this.a > 1;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        public b a;

        public a(a aVar) {
            b bVar = aVar.a;
            this.a = new b(bVar.a, bVar.b);
        }

        public a(b bVar) {
            this.a = bVar;
        }
    }
}
