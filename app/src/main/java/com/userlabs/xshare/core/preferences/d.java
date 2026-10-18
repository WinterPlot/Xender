package com.userlabs.xshare.core.preferences;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    private static LinkedBlockingQueue<a> a = new LinkedBlockingQueue<>();
    private static b b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private String a;
        private Object b;
        private int c;
        private SharedPreferences d;

        private static a of(String str, Object obj, int i, SharedPreferences sharedPreferences) {
            a aVar = new a();
            aVar.a = str;
            aVar.b = obj;
            aVar.c = i;
            aVar.d = sharedPreferences;
            return aVar;
        }

        public static a ofBoolean(String str, boolean z, SharedPreferences sharedPreferences) {
            return of(str, Boolean.valueOf(z), 4, sharedPreferences);
        }

        public static a ofFloat(String str, float f, SharedPreferences sharedPreferences) {
            return of(str, Float.valueOf(f), 3, sharedPreferences);
        }

        public static a ofInt(String str, int i, SharedPreferences sharedPreferences) {
            return of(str, Integer.valueOf(i), 1, sharedPreferences);
        }

        public static a ofLong(String str, long j, SharedPreferences sharedPreferences) {
            return of(str, Long.valueOf(j), 2, sharedPreferences);
        }

        public static a ofString(String str, String str2, SharedPreferences sharedPreferences) {
            return of(str, str2, 0, sharedPreferences);
        }

        public static a ofStringSet(String str, Set<String> set, SharedPreferences sharedPreferences) {
            return of(str, set, 5, sharedPreferences);
        }

        public SharedPreferences getSharedPreferences() {
            return this.d;
        }

        public void modify(SharedPreferences.Editor editor) {
            if (this.c == 0) {
                Object obj = this.b;
                String str = this.a;
                if (obj == null) {
                    editor.remove(str);
                } else {
                    editor.putString(str, (String) obj);
                }
            }
            if (this.c == 1) {
                editor.putInt(this.a, ((Integer) this.b).intValue());
            }
            if (this.c == 2) {
                editor.putLong(this.a, ((Long) this.b).longValue());
            }
            if (this.c == 3) {
                editor.putFloat(this.a, ((Float) this.b).floatValue());
            }
            if (this.c == 4) {
                editor.putBoolean(this.a, ((Boolean) this.b).booleanValue());
            }
            if (this.c == 5) {
                editor.putStringSet(this.a, (Set) this.b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b extends Thread {
        private LinkedBlockingQueue<a> a;

        public b(LinkedBlockingQueue<a> linkedBlockingQueue) {
            super("ModifierThread");
            this.a = linkedBlockingQueue;
        }

        private HashMap<SharedPreferences, ArrayList<a>> group(ArrayList<a> arrayList) {
            HashMap<SharedPreferences, ArrayList<a>> map = new HashMap<>();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                a aVar2 = aVar;
                ArrayList<a> arrayList2 = map.get(aVar2.getSharedPreferences());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    map.put(aVar2.getSharedPreferences(), arrayList2);
                }
                arrayList2.add(aVar2);
            }
            return map;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ArrayList<a> arrayList = new ArrayList<>();
                    arrayList.add(this.a.take());
                    this.a.drainTo(arrayList);
                    Iterator<SharedPreferences> it = group(arrayList).keySet().iterator();
                    while (it.hasNext()) {
                        SharedPreferences.Editor editorEdit = it.next().edit();
                        for (int i = 0; i < arrayList.size(); i++) {
                            arrayList.get(i).modify(editorEdit);
                        }
                        editorEdit.commit();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        b bVar = new b(a);
        b = bVar;
        bVar.start();
    }

    public static void submitModification(a aVar) {
        a.add(aVar);
    }
}
