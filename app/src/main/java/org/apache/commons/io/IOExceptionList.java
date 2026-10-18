package org.apache.commons.io;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class IOExceptionList extends IOException implements Iterable<Throwable> {
    private static final long serialVersionUID = 1;
    private final List<? extends Throwable> causeList;

    public IOExceptionList(String str, List<? extends Throwable> list) {
        super(str == null ? toMessage(list) : str, isEmpty(list) ? null : list.get(0));
        this.causeList = list == null ? Collections.EMPTY_LIST : list;
    }

    public static void checkEmpty(List<? extends Throwable> list, Object obj) throws IOExceptionList {
        if (!isEmpty(list)) {
            throw new IOExceptionList(Objects.toString(obj, null), list);
        }
    }

    private static boolean isEmpty(List<? extends Throwable> list) {
        return size(list) == 0;
    }

    private static int size(List<? extends Throwable> list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private static String toMessage(List<? extends Throwable> list) {
        return String.format("%,d exception(s): %s", Integer.valueOf(size(list)), list);
    }

    public <T extends Throwable> T getCause(int i, Class<T> cls) {
        return cls.cast(getCause(i));
    }

    public <T extends Throwable> List<T> getCauseList() {
        return new ArrayList(this.causeList);
    }

    @Override // java.lang.Iterable
    public Iterator<Throwable> iterator() {
        return getCauseList().iterator();
    }

    public <T extends Throwable> List<T> getCauseList(Class<T> cls) {
        return new ArrayList(this.causeList);
    }

    public <T extends Throwable> T getCause(int i) {
        return (T) this.causeList.get(i);
    }

    public IOExceptionList(List<? extends Throwable> list) {
        this(toMessage(list), list);
    }
}
