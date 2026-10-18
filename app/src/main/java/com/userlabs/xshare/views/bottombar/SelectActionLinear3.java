package com.userlabs.xshare.views.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.userlabs.xshare.core.R;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class SelectActionLinear3 extends BaseBottomBarLinear {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onAddToBtnClick(View view);

        void onCancelBtnClick(View view);

        void onDeleteBtnClick(View view);
    }

    public SelectActionLinear3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.drawable.bg_window_1_color_with_line);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCancelBtnClickListener$0(a aVar, View view) {
        dismissWithAnim();
        aVar.onCancelBtnClick(view);
    }

    private void setAddToBtnClickListener(a aVar) {
        View viewFindViewById = findViewById(com.userlabs.xshare.R.id.select_action2_count);
        if (viewFindViewById != null) {
            Objects.requireNonNull(aVar);
            viewFindViewById.setOnClickListener(new d(0, aVar));
        }
    }

    private void setCancelBtnClickListener(a aVar) {
        View viewFindViewById = findViewById(com.userlabs.xshare.R.id.select_action2_button_cancel);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new com.userlabs.xshare.ad.icon.viewholder.a(this, aVar, 24));
        }
    }

    private void setDeleteBtnClickListener(a aVar) {
        View viewFindViewById = findViewById(com.userlabs.xshare.R.id.select_action2_button_delete);
        if (viewFindViewById != null) {
            Objects.requireNonNull(aVar);
            viewFindViewById.setOnClickListener(new d(1, aVar));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view.getId() == com.userlabs.xshare.R.id.select_action2_count) {
            view.setBackgroundResource(R.drawable.btn_primary_round_corner);
        }
    }

    public void setCount(int i) {
        TextView textView = (TextView) findViewById(com.userlabs.xshare.R.id.select_action2_count);
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%s (%d)", getContext().getString(com.userlabs.xshare.R.string.x_add_to), Integer.valueOf(i)));
        }
        if (i > 0) {
            showWithAnim();
        } else {
            dismissWithAnim();
        }
    }

    public void setOnItemClickListener(a aVar) {
        setDeleteBtnClickListener(aVar);
        setCancelBtnClickListener(aVar);
        setAddToBtnClickListener(aVar);
    }
}
