package kotlin.coroutines;

import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface g {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public static g plus(g gVar, g gVar2) {
            gVar2.getClass();
            return gVar2 == EmptyCoroutineContext.INSTANCE ? gVar : (g) gVar2.fold(gVar, new com.userlabs.xshare.playlist.fragment.viewmodel.c(2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static g plus$lambda$0(g gVar, b bVar) {
            gVar.getClass();
            bVar.getClass();
            g gVarMinusKey = gVar.minusKey(bVar.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (gVarMinusKey == emptyCoroutineContext) {
                return bVar;
            }
            e.b bVar2 = e.j0;
            e eVar = (e) gVarMinusKey.get(bVar2);
            if (eVar == null) {
                return new CombinedContext(gVarMinusKey, bVar);
            }
            g gVarMinusKey2 = gVarMinusKey.minusKey(bVar2);
            return gVarMinusKey2 == emptyCoroutineContext ? new CombinedContext(bVar, eVar) : new CombinedContext(new CombinedContext(gVarMinusKey2, bVar), eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b extends g {

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class a {
            public static <R> R fold(b bVar, R r, p<? super R, ? super b, ? extends R> pVar) {
                pVar.getClass();
                return pVar.invoke(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E get(b bVar, c<E> cVar) {
                cVar.getClass();
                if (y.areEqual(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static g minusKey(b bVar, c<?> cVar) {
                cVar.getClass();
                return y.areEqual(bVar.getKey(), cVar) ? EmptyCoroutineContext.INSTANCE : bVar;
            }

            public static g plus(b bVar, g gVar) {
                gVar.getClass();
                return a.plus(bVar, gVar);
            }
        }

        @Override // kotlin.coroutines.g
        <R> R fold(R r, p<? super R, ? super b, ? extends R> pVar);

        @Override // kotlin.coroutines.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();

        @Override // kotlin.coroutines.g
        g minusKey(c<?> cVar);

        @Override // kotlin.coroutines.g
        /* synthetic */ g plus(g gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c<E extends b> {
    }

    <R> R fold(R r, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
