package com.userlabs.xshare.social.fragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, String str) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((SocialParserViewModel) obj).lambda$loadShareSheetLink$1(str);
                break;
            default:
                ((XSocialMainFragment) obj).lambda$onResumeFirstTimeThisLifecycle$6(str);
                break;
        }
    }
}
