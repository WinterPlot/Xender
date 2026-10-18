package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class j {
    private final Path a;
    private final Object b;
    private final j c;
    private Iterator<j> d;

    public j(Path path, Object obj, j jVar) {
        path.getClass();
        this.a = path;
        this.b = obj;
        this.c = jVar;
    }

    public final Iterator<j> getContentIterator() {
        return this.d;
    }

    public final Object getKey() {
        return this.b;
    }

    public final j getParent() {
        return this.c;
    }

    public final Path getPath() {
        return this.a;
    }

    public final void setContentIterator(Iterator<j> it) {
        this.d = it;
    }
}
