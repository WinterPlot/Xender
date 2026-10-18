package com.userlabs.xshare.fastdownloader.model;

import android.text.TextUtils;
import android.util.Pair;
import androidx.camera.core.impl.f2;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private volatile long g;
    private long h;
    private volatile boolean i;
    private volatile ArrayList<a> j;
    private List<Pair<String, String>> k;
    private long l;
    private long m;
    private boolean n;
    private boolean o;
    private int p;
    private String q;

    public b(b bVar) {
        this.a = bVar.a;
        this.b = bVar.getDownloadUrl();
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        if (bVar.getHeaders() != null) {
            this.k = new ArrayList();
            for (int i = 0; i < bVar.getHeaders().size(); i++) {
                Pair<String, String> pair = bVar.getHeaders().get(i);
                this.k.add(new Pair<>((String) pair.first, (String) pair.second));
            }
        }
        this.f = bVar.f;
        if (bVar.j != null) {
            this.j = new ArrayList<>();
            for (int i2 = 0; i2 < bVar.j.size(); i2++) {
                this.j.add(new a(bVar.j.get(i2)));
            }
        }
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.isRebuilding();
        this.p = bVar.getRebuildingPercentage();
        this.q = bVar.geteTag();
    }

    public static String getSHA256Hash(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest.digest()) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$addAllChunks$1(a aVar, a aVar2) {
        if (aVar.getStartByteIndex() > aVar2.getStartByteIndex()) {
            return 1;
        }
        return aVar.getStartByteIndex() < aVar2.getStartByteIndex() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$addChunk$0(a aVar, a aVar2) {
        if (aVar.getStartByteIndex() > aVar2.getStartByteIndex()) {
            return 1;
        }
        return aVar.getStartByteIndex() < aVar2.getStartByteIndex() ? -1 : 0;
    }

    public static String nullToEmpty(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public void CalCurrentSize() {
        long currentByteIndex;
        if (this.j == null || this.j.isEmpty()) {
            currentByteIndex = this.h;
        } else {
            ArrayList<a> arrayList = this.j;
            int size = arrayList.size();
            currentByteIndex = 0;
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                a aVar2 = aVar;
                currentByteIndex += (aVar2.getCurrentByteIndex() + 1) - aVar2.getStartByteIndex();
            }
        }
        this.h = currentByteIndex;
    }

    public void addAllChunks(List<a> list) {
        if (list != null) {
            this.j = new ArrayList<>();
            this.j.addAll(list);
            Collections.sort(list, new f2(14));
        }
    }

    public void addChunk(a aVar) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(aVar);
        Collections.sort(this.j, new f2(15));
    }

    public a getChunk(String str) {
        ArrayList<a> arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            a aVar = arrayList.get(i);
            i++;
            a aVar2 = aVar;
            if (aVar2.getId().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    public ArrayList<a> getChunks() {
        return this.j;
    }

    public long getCurrentDownloadSpeed() {
        return this.l;
    }

    public long getCurrentSize() {
        return this.h;
    }

    public String getDownloadLocation() {
        return this.e;
    }

    public String getDownloadUrl() {
        return this.b;
    }

    public String getExtension() {
        return this.d;
    }

    public File getFile() {
        String str = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(TextUtils.isEmpty(this.d) ? "" : this.d);
        return new File(str, sb.toString());
    }

    public String getFileName() {
        return this.c;
    }

    public List<Pair<String, String>> getHeaders() {
        return this.k;
    }

    public int getMaxChunksCount() {
        return this.f;
    }

    public int getRebuildingPercentage() {
        return this.p;
    }

    public boolean getResumable() {
        return this.i;
    }

    public long getSize() {
        return this.g;
    }

    public String getUniqueFileIdentifier() {
        return this.a;
    }

    public long getUpTimeMillis() {
        return this.m;
    }

    public String geteTag() {
        return this.q;
    }

    public boolean isNotEmpty() {
        return this.g > 0;
    }

    public boolean isRandomAccessBased() {
        return this.n;
    }

    public boolean isRebuilding() {
        return this.o;
    }

    public void setCurrentDownloadSpeed(long j) {
        this.l = j;
    }

    public void setCurrentSize(long j) {
        this.h = j;
    }

    public void setRandomAccessBased(boolean z) {
        this.n = z;
    }

    public void setRebuilding(boolean z) {
        this.o = z;
    }

    public void setRebuildingPercentage(int i) {
        this.p = i;
    }

    public void setResumable(boolean z) {
        this.i = z;
    }

    public void setSize(long j) {
        this.g = j;
    }

    public void setUpTimeMillis(long j) {
        this.m = j;
    }

    public void seteTag(String str) {
        this.q = str;
    }

    public b(String str, List<Pair<String, String>> list, String str2, String str3, String str4, String str5, boolean z, int i) {
        this.b = str;
        this.e = str2;
        this.k = list;
        this.c = str3;
        this.d = TextUtils.isEmpty(str4) ? "" : str4;
        this.f = Math.max(1, i);
        this.n = z;
        if (TextUtils.isEmpty(str5)) {
            this.a = getSHA256Hash(str + str2 + str3 + nullToEmpty(str4));
            return;
        }
        this.a = str5;
    }
}
