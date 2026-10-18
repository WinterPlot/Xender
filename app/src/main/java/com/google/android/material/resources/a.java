package com.google.android.material.resources;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends f {
    private final Typeface a;
    private final InterfaceC0579a b;
    private boolean c;

    /* JADX INFO: renamed from: com.google.android.material.resources.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface InterfaceC0579a {
        void apply(Typeface typeface);
    }

    public a(InterfaceC0579a interfaceC0579a, Typeface typeface) {
        this.a = typeface;
        this.b = interfaceC0579a;
    }

    private void updateIfNotCancelled(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.apply(typeface);
    }

    public void cancel() {
        this.c = true;
    }

    @Override // com.google.android.material.resources.f
    public void onFontRetrievalFailed(int i) {
        updateIfNotCancelled(this.a);
    }

    @Override // com.google.android.material.resources.f
    public void onFontRetrieved(Typeface typeface, boolean z) {
        updateIfNotCancelled(typeface);
    }
}
