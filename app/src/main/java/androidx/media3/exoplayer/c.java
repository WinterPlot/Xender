package androidx.media3.exoplayer;

import android.media.MediaFormat;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c b = new b().build();
    private final Map<String, Object> a;

    private c(Map<String, Object> map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }

    public static b createFrom(MediaFormat mediaFormat, Set<String> set) {
        b bVar = new b();
        for (String str : set) {
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                if (valueTypeForKey == 1) {
                    bVar.setInteger(str, mediaFormat.getInteger(str));
                } else if (valueTypeForKey == 2) {
                    bVar.setLong(str, mediaFormat.getLong(str));
                } else if (valueTypeForKey == 3) {
                    bVar.setFloat(str, mediaFormat.getFloat(str));
                } else if (valueTypeForKey == 4) {
                    bVar.setString(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    bVar.setByteBuffer(str, mediaFormat.getByteBuffer(str));
                }
            }
        }
        return bVar;
    }

    public void applyTo(MediaFormat mediaFormat) {
        for (Map.Entry<String, Object> entry : this.a.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(key, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(key, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(key, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(key, (ByteBuffer) value);
            }
        }
    }

    public b buildUpon() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.a.equals(((c) obj).a);
        }
        return false;
    }

    public Object get(String str) {
        return this.a.get(str);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Set<String> keySet() {
        return this.a.keySet();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : this.a.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    bundle.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    bundle.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    bundle.putString(key, (String) value);
                } else if (value instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) value;
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.duplicate().get(bArr);
                    bundle.putByteArray(key, bArr);
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private final Map<String, Object> a;

        private b(c cVar) {
            this.a = new HashMap(cVar.a);
        }

        public c build() {
            return new c(this.a);
        }

        public b remove(String str) {
            this.a.remove(str);
            return this;
        }

        public b setByteBuffer(String str, ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                this.a.put(str, null);
                return this;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            byteBufferAllocate.put(byteBuffer.duplicate());
            byteBufferAllocate.flip();
            this.a.put(str, byteBufferAllocate);
            return this;
        }

        public b setFloat(String str, float f) {
            this.a.put(str, Float.valueOf(f));
            return this;
        }

        public b setInteger(String str, int i) {
            this.a.put(str, Integer.valueOf(i));
            return this;
        }

        public b setLong(String str, long j) {
            this.a.put(str, Long.valueOf(j));
            return this;
        }

        public b setString(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }

        public b() {
            this.a = new HashMap();
        }
    }
}
