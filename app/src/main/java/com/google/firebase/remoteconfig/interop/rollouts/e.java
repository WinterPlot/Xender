package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static e create(Set<d> set) {
        return new c(set);
    }

    public abstract Set<d> getRolloutAssignments();
}
