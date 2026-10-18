package com.userlabs.xshare.audioplayer.settings;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static int getBassBootPos() {
        return com.userlabs.xshare.core.preferences.a.getInt("bass_boot_pos", 0);
    }

    public static int getBrandLevel(int i) {
        return com.userlabs.xshare.core.preferences.a.getInt("eq_" + i, 0);
    }

    public static String getPresetsPos() {
        return com.userlabs.xshare.core.preferences.a.getString("presets_pos", "Normal");
    }

    public static int getReverbPos() {
        return com.userlabs.xshare.core.preferences.a.getInt("reverb_pos", 0);
    }

    public static float getSelectPitch() {
        return com.userlabs.xshare.core.preferences.a.getFloat("x_pitch_select_player", 1.0f);
    }

    public static float getSelectSpeed() {
        return com.userlabs.xshare.core.preferences.a.getFloat("x_speed_select_player", 1.0f);
    }

    public static int getVirtuzlizerIndex() {
        return com.userlabs.xshare.core.preferences.a.getInt("virtuzlizer_index", 0);
    }

    public static boolean isEqualizerEnabled() {
        return com.userlabs.xshare.core.preferences.a.getBoolean("equalizer_open", false);
    }

    public static boolean isHeadphoneOutContinue() {
        return com.userlabs.xshare.core.preferences.a.getBoolean("headphone_out_continue", false);
    }

    public static boolean isIgnoreAudioFocus() {
        return com.userlabs.xshare.core.preferences.a.getBoolean("ignore_audio_focus", false);
    }

    public static void putSelectPitch(float f) {
        com.userlabs.xshare.core.preferences.a.putFloat("x_pitch_select_player", f);
    }

    public static void putSelectSpeed(float f) {
        com.userlabs.xshare.core.preferences.a.putFloat("x_speed_select_player", f);
    }

    public static void setBassBootPos(int i) {
        com.userlabs.xshare.core.preferences.a.putInt("bass_boot_pos", i);
    }

    public static void setBrandLevel(int i, int i2) {
        com.userlabs.xshare.core.preferences.a.putInt("eq_" + i, i2);
    }

    public static void setEqualizerEnabled(boolean z) {
        com.userlabs.xshare.core.preferences.a.putBoolean("equalizer_open", Boolean.valueOf(z));
    }

    public static void setHeadphoneOutContinue(boolean z) {
        com.userlabs.xshare.core.preferences.a.putBoolean("headphone_out_continue", Boolean.valueOf(z));
    }

    public static void setIgnoreAudioFocus(boolean z) {
        com.userlabs.xshare.core.preferences.a.putBoolean("ignore_audio_focus", Boolean.valueOf(z));
    }

    public static void setPresetsPos(String str) {
        com.userlabs.xshare.core.preferences.a.putString("presets_pos", str);
    }

    public static void setReverbPos(int i) {
        com.userlabs.xshare.core.preferences.a.putInt("reverb_pos", i);
    }

    public static void setVirtuzlizerIndex(int i) {
        com.userlabs.xshare.core.preferences.a.putInt("virtuzlizer_index", i);
    }
}
