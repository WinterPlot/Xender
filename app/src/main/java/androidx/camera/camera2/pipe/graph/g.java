package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.d1;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean isNullOrIn(T t, Collection<? extends T> collection) {
        if (t != null) {
            return collection.contains(t);
        }
        return true;
    }

    /* JADX INFO: renamed from: shouldUnlockAe-t6FjEyI, reason: not valid java name */
    public static final boolean m434shouldUnlockAet6FjEyI(d1 d1Var) {
        int iM391getAFTER_NEW_SCANhRqSH3k = d1.b.m391getAFTER_NEW_SCANhRqSH3k();
        if (d1Var == null) {
            return false;
        }
        return d1.m386equalsimpl0(d1Var.m389unboximpl(), iM391getAFTER_NEW_SCANhRqSH3k);
    }

    /* JADX INFO: renamed from: shouldUnlockAf-t6FjEyI, reason: not valid java name */
    public static final boolean m435shouldUnlockAft6FjEyI(d1 d1Var) {
        int iM391getAFTER_NEW_SCANhRqSH3k = d1.b.m391getAFTER_NEW_SCANhRqSH3k();
        if (d1Var == null) {
            return false;
        }
        return d1.m386equalsimpl0(d1Var.m389unboximpl(), iM391getAFTER_NEW_SCANhRqSH3k);
    }

    /* JADX INFO: renamed from: shouldUnlockAwb-t6FjEyI, reason: not valid java name */
    public static final boolean m436shouldUnlockAwbt6FjEyI(d1 d1Var) {
        int iM391getAFTER_NEW_SCANhRqSH3k = d1.b.m391getAFTER_NEW_SCANhRqSH3k();
        if (d1Var == null) {
            return false;
        }
        return d1.m386equalsimpl0(d1Var.m389unboximpl(), iM391getAFTER_NEW_SCANhRqSH3k);
    }

    /* JADX INFO: renamed from: shouldWaitForAeToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m437shouldWaitForAeToConverget6FjEyI(d1 d1Var) {
        if (d1Var != null) {
            return !d1.m386equalsimpl0(d1Var.m389unboximpl(), d1.b.m392getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    /* JADX INFO: renamed from: shouldWaitForAfToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m438shouldWaitForAfToConverget6FjEyI(d1 d1Var) {
        if (d1Var != null) {
            return !d1.m386equalsimpl0(d1Var.m389unboximpl(), d1.b.m392getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    /* JADX INFO: renamed from: shouldWaitForAwbToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m439shouldWaitForAwbToConverget6FjEyI(d1 d1Var) {
        if (d1Var != null) {
            return !d1.m386equalsimpl0(d1Var.m389unboximpl(), d1.b.m392getIMMEDIATEhRqSH3k());
        }
        return false;
    }
}
