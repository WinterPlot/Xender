package com.bumptech.glide.manager;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class d implements b {
    private final Context a;
    final b.a b;

    public d(Context context, b.a aVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
    }

    private void register() {
        r.get(this.a).register(this.b);
    }

    private void unregister() {
        r.get(this.a).unregister(this.b);
    }

    @Override // com.bumptech.glide.manager.b, com.bumptech.glide.manager.l
    public void onStart() {
        register();
    }

    @Override // com.bumptech.glide.manager.b, com.bumptech.glide.manager.l
    public void onStop() {
        unregister();
    }

    @Override // com.bumptech.glide.manager.b, com.bumptech.glide.manager.l
    public void onDestroy() {
    }
}
