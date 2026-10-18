package com.google.android.datatransport.cct.internal;

import androidx.camera.camera2.pipe.w;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class c extends com.google.android.datatransport.cct.internal.a {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends com.google.android.datatransport.cct.internal.a.AbstractC0544a {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a build() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setApplicationBuild(String str) {
            this.l = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setCountry(String str) {
            this.j = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setDevice(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setFingerprint(String str) {
            this.h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setHardware(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setLocale(String str) {
            this.i = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setManufacturer(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setMccMnc(String str) {
            this.k = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setModel(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setOsBuild(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setProduct(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0544a
        public com.google.android.datatransport.cct.internal.a.AbstractC0544a setSdkVersion(Integer num) {
            this.a = num;
            return this;
        }
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.datatransport.cct.internal.a) {
            com.google.android.datatransport.cct.internal.a aVar = (com.google.android.datatransport.cct.internal.a) obj;
            Integer num = this.a;
            if (num != null ? num.equals(aVar.getSdkVersion()) : aVar.getSdkVersion() == null) {
                String str = this.b;
                if (str != null ? str.equals(aVar.getModel()) : aVar.getModel() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(aVar.getHardware()) : aVar.getHardware() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(aVar.getDevice()) : aVar.getDevice() == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(aVar.getProduct()) : aVar.getProduct() == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(aVar.getOsBuild()) : aVar.getOsBuild() == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(aVar.getManufacturer()) : aVar.getManufacturer() == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(aVar.getFingerprint()) : aVar.getFingerprint() == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(aVar.getLocale()) : aVar.getLocale() == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(aVar.getCountry()) : aVar.getCountry() == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(aVar.getMccMnc()) : aVar.getMccMnc() == null) {
                                                        String str11 = this.l;
                                                        if (str11 != null ? str11.equals(aVar.getApplicationBuild()) : aVar.getApplicationBuild() == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getApplicationBuild() {
        return this.l;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getCountry() {
        return this.j;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getDevice() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getFingerprint() {
        return this.h;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getHardware() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getLocale() {
        return this.i;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getManufacturer() {
        return this.g;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getMccMnc() {
        return this.k;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getModel() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getOsBuild() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String getProduct() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public Integer getSdkVersion() {
        return this.a;
    }

    public int hashCode() {
        Integer num = this.a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return w.t(sb, this.l, "}");
    }
}
