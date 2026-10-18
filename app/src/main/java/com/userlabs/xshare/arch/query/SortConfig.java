package com.userlabs.xshare.arch.query;

import java.util.regex.Pattern;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TITLE_ASC' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class SortConfig {
    public static final SortConfig ARTIST_ASC;
    public static final SortConfig ARTIST_DESC;
    public static final SortConfig DATE_ASC;
    public static final SortConfig DATE_DESC;
    public static final SortConfig DURATION_ASC;
    public static final SortConfig DURATION_DESC;
    public static final String KEY_0_100KB = "0-100KB";
    public static final String KEY_100KB_1MB = "100KB-1MB";
    public static final String KEY_10MB_PLUS = "10MB+";
    public static final String KEY_1MB_5MB = "1MB-5MB";
    public static final String KEY_5MB_10MB = "5MB-10MB";
    public static final SortConfig SIZE_ASC;
    public static final SortConfig SIZE_DESC;
    public static final String THIS_MONTH = "THIS_MONTH";
    public static final String THIS_WEEK = "THIS_WEEK";
    public static final SortConfig TITLE_ASC;
    public static final SortConfig TITLE_DESC;
    public static final String TODAY = "TODAY";
    public static final Pattern YEAR_MONTH_PATTERN;
    private static final /* synthetic */ SortConfig[] a;
    private final SortMode mode;
    private SortConfig opposite;
    private final SortOrder order;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum SortMode {
        TITLE,
        DATE,
        SIZE,
        DURATION,
        ARTIST
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum SortOrder {
        ASCENDING,
        DESCENDING
    }

    private static /* synthetic */ SortConfig[] $values() {
        return new SortConfig[]{TITLE_ASC, TITLE_DESC, DATE_ASC, DATE_DESC, SIZE_ASC, SIZE_DESC, DURATION_ASC, DURATION_DESC, ARTIST_ASC, ARTIST_DESC};
    }

    static {
        SortMode sortMode = SortMode.TITLE;
        SortOrder sortOrder = SortOrder.ASCENDING;
        SortConfig sortConfig = new SortConfig("TITLE_ASC", 0, sortMode, sortOrder);
        TITLE_ASC = sortConfig;
        SortOrder sortOrder2 = SortOrder.DESCENDING;
        SortConfig sortConfig2 = new SortConfig("TITLE_DESC", 1, sortMode, sortOrder2);
        TITLE_DESC = sortConfig2;
        SortMode sortMode2 = SortMode.DATE;
        SortConfig sortConfig3 = new SortConfig("DATE_ASC", 2, sortMode2, sortOrder);
        DATE_ASC = sortConfig3;
        SortConfig sortConfig4 = new SortConfig("DATE_DESC", 3, sortMode2, sortOrder2);
        DATE_DESC = sortConfig4;
        SortMode sortMode3 = SortMode.SIZE;
        SortConfig sortConfig5 = new SortConfig("SIZE_ASC", 4, sortMode3, sortOrder);
        SIZE_ASC = sortConfig5;
        SortConfig sortConfig6 = new SortConfig("SIZE_DESC", 5, sortMode3, sortOrder2);
        SIZE_DESC = sortConfig6;
        SortMode sortMode4 = SortMode.DURATION;
        SortConfig sortConfig7 = new SortConfig("DURATION_ASC", 6, sortMode4, sortOrder);
        DURATION_ASC = sortConfig7;
        SortConfig sortConfig8 = new SortConfig("DURATION_DESC", 7, sortMode4, sortOrder2);
        DURATION_DESC = sortConfig8;
        SortMode sortMode5 = SortMode.ARTIST;
        SortConfig sortConfig9 = new SortConfig("ARTIST_ASC", 8, sortMode5, sortOrder);
        ARTIST_ASC = sortConfig9;
        SortConfig sortConfig10 = new SortConfig("ARTIST_DESC", 9, sortMode5, sortOrder2);
        ARTIST_DESC = sortConfig10;
        a = $values();
        sortConfig.opposite = sortConfig2;
        sortConfig2.opposite = sortConfig;
        sortConfig3.opposite = sortConfig4;
        sortConfig4.opposite = sortConfig3;
        sortConfig5.opposite = sortConfig6;
        sortConfig6.opposite = sortConfig5;
        sortConfig7.opposite = sortConfig8;
        sortConfig8.opposite = sortConfig7;
        sortConfig9.opposite = sortConfig10;
        sortConfig10.opposite = sortConfig9;
        YEAR_MONTH_PATTERN = Pattern.compile("^\\d{4}_\\d{2}$");
    }

    private SortConfig(String str, int i, SortMode sortMode, SortOrder sortOrder) {
        super(str, i);
        this.mode = sortMode;
        this.order = sortOrder;
    }

    public static SortConfig valueOf(String str) {
        return (SortConfig) Enum.valueOf(SortConfig.class, str);
    }

    public static SortConfig[] values() {
        return (SortConfig[]) a.clone();
    }

    public SortMode getMode() {
        return this.mode;
    }

    public SortOrder getOrder() {
        return this.order;
    }

    public SortConfig toggle() {
        return this.opposite;
    }
}
