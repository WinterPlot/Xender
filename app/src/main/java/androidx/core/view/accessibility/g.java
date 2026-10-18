package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface g {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        Bundle a;

        public void setBundle(Bundle bundle) {
            this.a = bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends a {
        public boolean getExtendSelection() {
            return this.a.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        }

        public int getGranularity() {
            return this.a.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c extends a {
        public String getHTMLElement() {
            return this.a.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d extends a {
        public int getX() {
            return this.a.getInt("ACTION_ARGUMENT_MOVE_WINDOW_X");
        }

        public int getY() {
            return this.a.getInt("ACTION_ARGUMENT_MOVE_WINDOW_Y");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class e extends a {
        public int getColumn() {
            return this.a.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT");
        }

        public int getRow() {
            return this.a.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class f extends a {
        public float getProgress() {
            return this.a.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0130g extends a {
        public int getEnd() {
            return this.a.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
        }

        public int getStart() {
            return this.a.getInt("ACTION_ARGUMENT_SELECTION_START_INT");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class h extends a {
        public CharSequence getText() {
            return this.a.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        }
    }

    boolean perform(View view, a aVar);
}
