package androidx.transition;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface p {
    void addOnProgressChangedListener(androidx.core.util.b<p> bVar);

    void addOnReadyListener(androidx.core.util.b<p> bVar);

    void animateToEnd();

    void animateToStart(Runnable runnable);

    float getCurrentFraction();

    long getCurrentPlayTimeMillis();

    long getDurationMillis();

    boolean isReady();

    void removeOnProgressChangedListener(androidx.core.util.b<p> bVar);

    void removeOnReadyListener(androidx.core.util.b<p> bVar);

    void setCurrentFraction(float f);

    void setCurrentPlayTimeMillis(long j);
}
