package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class AbstractC0544a {
        public abstract a build();

        public abstract AbstractC0544a setApplicationBuild(String str);

        public abstract AbstractC0544a setCountry(String str);

        public abstract AbstractC0544a setDevice(String str);

        public abstract AbstractC0544a setFingerprint(String str);

        public abstract AbstractC0544a setHardware(String str);

        public abstract AbstractC0544a setLocale(String str);

        public abstract AbstractC0544a setManufacturer(String str);

        public abstract AbstractC0544a setMccMnc(String str);

        public abstract AbstractC0544a setModel(String str);

        public abstract AbstractC0544a setOsBuild(String str);

        public abstract AbstractC0544a setProduct(String str);

        public abstract AbstractC0544a setSdkVersion(Integer num);
    }

    public static AbstractC0544a builder() {
        return new c.b();
    }

    public abstract String getApplicationBuild();

    public abstract String getCountry();

    public abstract String getDevice();

    public abstract String getFingerprint();

    public abstract String getHardware();

    public abstract String getLocale();

    public abstract String getManufacturer();

    public abstract String getMccMnc();

    public abstract String getModel();

    public abstract String getOsBuild();

    public abstract String getProduct();

    public abstract Integer getSdkVersion();
}
