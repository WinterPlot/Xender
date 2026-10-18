package com.userlabs.xshare.adapter;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface z<Data> {
    void convertDataItem(s0 s0Var, Data data);

    void convertDataItem(s0 s0Var, Data data, List<Object> list);

    void initDataItemTheme(s0 s0Var, int i);

    void onDataItemCheck(int i);

    void onDataItemClick(Data data, int i);

    void onDataItemLongClick(Data data);

    void setItemListener(ViewGroup viewGroup, s0 s0Var, int i);

    void updateDataItemCheckbox(s0 s0Var, boolean z);
}
