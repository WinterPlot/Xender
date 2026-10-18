package com.userlabs.xshare.ui.fragment.res;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsFragment b;

    public /* synthetic */ k(ContactsFragment contactsFragment, int i) {
        this.a = i;
        this.b = contactsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ContactsFragment contactsFragment = this.b;
        switch (i) {
            case 0:
                contactsFragment.lambda$addAllContactsLayer$6(view);
                break;
            default:
                contactsFragment.lambda$showNotAllowPermissionLayer$5(view);
                break;
        }
    }
}
