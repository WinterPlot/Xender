package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {
    private final EventType a;
    private final l0 b;
    private final b c;

    public f0(EventType eventType, l0 l0Var, b bVar) {
        eventType.getClass();
        l0Var.getClass();
        bVar.getClass();
        this.a = eventType;
        this.b = l0Var;
        this.c = bVar;
    }

    public static /* synthetic */ f0 copy$default(f0 f0Var, EventType eventType, l0 l0Var, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = f0Var.a;
        }
        if ((i & 2) != 0) {
            l0Var = f0Var.b;
        }
        if ((i & 4) != 0) {
            bVar = f0Var.c;
        }
        return f0Var.copy(eventType, l0Var, bVar);
    }

    public final EventType component1() {
        return this.a;
    }

    public final l0 component2() {
        return this.b;
    }

    public final b component3() {
        return this.c;
    }

    public final f0 copy(EventType eventType, l0 l0Var, b bVar) {
        eventType.getClass();
        l0Var.getClass();
        bVar.getClass();
        return new f0(eventType, l0Var, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && kotlin.jvm.internal.y.areEqual(this.b, f0Var.b) && kotlin.jvm.internal.y.areEqual(this.c, f0Var.c);
    }

    public final b getApplicationInfo() {
        return this.c;
    }

    public final EventType getEventType() {
        return this.a;
    }

    public final l0 getSessionData() {
        return this.b;
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.a + ", sessionData=" + this.b + ", applicationInfo=" + this.c + ')';
    }
}
