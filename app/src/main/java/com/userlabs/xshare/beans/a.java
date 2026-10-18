package com.userlabs.xshare.beans;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Cloneable {
    private boolean checked;
    private String createDate;

    public static boolean isApp(a aVar) {
        return (aVar instanceof com.userlabs.xshare.arch.db.entity.b) || (aVar instanceof com.userlabs.xshare.arch.db.entity.d);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public a cloneMyself() {
        try {
            return (a) clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z) {
        this.checked = z;
    }

    public void setCreateDate(String str) {
        this.createDate = str;
    }
}
