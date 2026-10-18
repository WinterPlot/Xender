package com.userlabs.xshare.audioplayer.manager;

import android.media.audiofx.BassBoost;
import android.media.audiofx.Equalizer;
import android.media.audiofx.PresetReverb;
import android.media.audiofx.Virtualizer;
import android.util.Log;
import com.userlabs.xshare.audioplayer.settings.d;
import com.userlabs.xshare.core.log.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static String h = "Custom";
    private Equalizer a;
    private BassBoost b;
    private Virtualizer c;
    private PresetReverb d;
    List<Short> e = new ArrayList();
    List<String> f = new ArrayList();
    private final String g = "XEqualizerManager";

    public a(int i) {
        createNewEqualizer(i);
    }

    private void initBassBoost(int i) {
        try {
            BassBoost bassBoost = new BassBoost(0, i);
            this.b = bassBoost;
            bassBoost.setStrength((short) d.getBassBootPos());
        } catch (Throwable unused) {
        }
    }

    private void initEqualizer(int i) {
        try {
            this.a = new Equalizer(0, i);
        } catch (Throwable unused) {
        }
    }

    private void initPresetReverb(int i) {
        try {
            PresetReverb presetReverb = new PresetReverb(0, i);
            this.d = presetReverb;
            presetReverb.setPreset((short) d.getReverbPos());
        } catch (Throwable unused) {
        }
    }

    private void initVirtualizer(int i) {
        try {
            Virtualizer virtualizer = new Virtualizer(0, i);
            this.c = virtualizer;
            virtualizer.setStrength((short) d.getVirtuzlizerIndex());
        } catch (Throwable unused) {
        }
    }

    public void createNewEqualizer(int i) {
        try {
            if (h.a) {
                Log.d("XEqualizerManager", "initEqualizer sessionId=" + i);
            }
            initEqualizer(i);
            initBassBoost(i);
            initVirtualizer(i);
            initPresetReverb(i);
            this.e.add((short) -1);
            this.f.add(h);
            if (this.a != null) {
                for (short s = 0; s < this.a.getNumberOfPresets(); s = (short) (s + 1)) {
                    this.e.add(Short.valueOf(s));
                    this.f.add(this.a.getPresetName(s));
                }
                try {
                    String presetsPos = d.getPresetsPos();
                    if (h.a) {
                        Log.d("XEqualizerManager", "onItemSelected presets_pos=" + presetsPos + "，indexOf=" + this.f.indexOf(presetsPos) + "，getPresetNames=" + this.e.get(this.f.indexOf(presetsPos)));
                    }
                    this.a.usePreset(this.e.get(this.f.indexOf(presetsPos)).shortValue());
                } catch (Throwable th) {
                    if (h.a) {
                        Log.e("XEqualizerManager", "usePreset error", th);
                    }
                }
            }
            for (short s2 = 0; s2 < 5; s2 = (short) (s2 + 1)) {
                if (h.a) {
                    Log.e("XEqualizerManager", "usePreset level=" + d.getBrandLevel(s2));
                }
                setEqualizerBandLevel(s2, (short) d.getBrandLevel(s2));
            }
        } catch (Throwable th2) {
            if (h.a) {
                Log.e("XEqualizerManager", "createNewEqualizer error", th2);
            }
        }
    }

    public List<Short> getPresetNames() {
        return this.e;
    }

    public List<String> getPresetVals() {
        return this.f;
    }

    public Equalizer getmEqualizer() {
        return this.a;
    }

    public void releaseEqualizer() {
        try {
            Equalizer equalizer = this.a;
            if (equalizer != null) {
                equalizer.release();
                this.a = null;
            }
            BassBoost bassBoost = this.b;
            if (bassBoost != null) {
                bassBoost.release();
                this.b = null;
            }
            Virtualizer virtualizer = this.c;
            if (virtualizer != null) {
                virtualizer.release();
                this.c = null;
            }
            PresetReverb presetReverb = this.d;
            if (presetReverb != null) {
                presetReverb.release();
                this.d = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setBassBoostStrength(short s) {
        try {
            this.b.setStrength(s);
        } catch (Throwable unused) {
        }
    }

    public void setEqualizerBandLevel(short s, short s2) {
        try {
            this.a.setBandLevel(s, s2);
        } catch (Throwable th) {
            if (h.a) {
                Log.e("XEqualizerManager", "setBandLevel error", th);
            }
        }
    }

    public void setEqualizerEnabled() {
        boolean zIsEqualizerEnabled = d.isEqualizerEnabled();
        try {
            Equalizer equalizer = this.a;
            if (equalizer != null) {
                equalizer.setEnabled(zIsEqualizerEnabled);
            }
            PresetReverb presetReverb = this.d;
            if (presetReverb != null) {
                presetReverb.setEnabled(zIsEqualizerEnabled);
            }
            BassBoost bassBoost = this.b;
            if (bassBoost != null) {
                bassBoost.setEnabled(zIsEqualizerEnabled);
            }
            Virtualizer virtualizer = this.c;
            if (virtualizer != null) {
                virtualizer.setEnabled(zIsEqualizerEnabled);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setPresetReverbPreset(short s) {
        try {
            this.d.setPreset(s);
        } catch (Throwable unused) {
        }
    }

    public void setVirtualizerStrength(short s) {
        try {
            this.c.setStrength(s);
        } catch (Throwable unused) {
        }
    }
}
