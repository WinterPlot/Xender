package com.userlabs.xshare.views.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.userlabs.xshare.core.R;
import com.userlabs.xshare.core.log.h;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class SelectActionLinear extends BaseBottomBarLinear {
    private TextView f;

    public SelectActionLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.drawable.bg_window_1_color_with_line);
    }

    private void initSendBtnIfNeed(View view) {
        if (view.getId() == com.userlabs.xshare.R.id.select_action_button_send) {
            this.f = (TextView) view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCancelBtnClickListener$0(View.OnClickListener onClickListener, View view) {
        dismissWithAnim();
        onClickListener.onClick(view);
    }

    @Override // com.userlabs.xshare.views.bottombar.BaseBottomBarLinear, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (h.a) {
            h.d("SelectActionLinear", "add view, child:" + view + ",id:" + view.getId());
        }
        initSendBtnIfNeed(view);
    }

    public boolean hasCancelBtnClickListener() {
        View viewFindViewById = findViewById(com.userlabs.xshare.R.id.select_action_button_cancel);
        return viewFindViewById != null && viewFindViewById.hasOnClickListeners();
    }

    public boolean hasDeleteBtnClickListener() {
        View viewFindViewById = findViewById(com.userlabs.xshare.R.id.select_action_button_delete);
        return viewFindViewById != null && viewFindViewById.hasOnClickListeners();
    }

    public boolean hasSendBtnClickListener() {
        TextView textView = this.f;
        return textView != null && textView.hasOnClickListeners();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCancelBtnClickListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(com.userlabs.xshare.R.id.select_action_button_cancel);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new com.userlabs.xshare.ad.icon.viewholder.a(this, onClickListener, 22));
        }
    }

    public void setCount(int i, boolean z) {
        this.f.setText(String.format(Locale.getDefault(), "%s (%d)", getContext().getString(com.userlabs.xshare.R.string.messenger_send), Integer.valueOf(i)));
        if (i > 0) {
            findViewById(com.userlabs.xshare.R.id.select_action_button_delete).setVisibility(z ? 0 : 4);
        }
        if (i > 0) {
            showWithAnim();
        } else {
            dismissWithAnim();
        }
    }

    public void setDeleteBtnClickListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(com.userlabs.xshare.R.id.select_action_button_delete);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(onClickListener);
        }
    }

    public void setSendBtnClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }
}
