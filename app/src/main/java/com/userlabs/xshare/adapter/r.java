package com.userlabs.xshare.adapter;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface r<Data> {
    void convertHeader(s0 s0Var, Data data);

    void convertHeader(s0 s0Var, Data data, List<Object> list);

    void initHeaderTheme(s0 s0Var, int i);

    boolean isHeader(Data data);

    void onHeaderCheck(int i);

    void onHeaderClick();

    void setHeaderListener(ViewGroup viewGroup, s0 s0Var, int i);

    void updateHeaderItemCheckbox(s0 s0Var, boolean z);
}
