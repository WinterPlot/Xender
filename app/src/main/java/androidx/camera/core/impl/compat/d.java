package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import androidx.camera.core.impl.i1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class d {
    private d() {
    }

    public static i1 from(CamcorderProfile camcorderProfile) {
        return i1.b.create(camcorderProfile.duration, camcorderProfile.fileFormat, toAudioProfiles(camcorderProfile), toVideoProfiles(camcorderProfile));
    }

    private static List<i1.a> toAudioProfiles(CamcorderProfile camcorderProfile) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = camcorderProfile.audioCodec;
        switch (i2) {
            case 1:
                str = "audio/3gpp";
                break;
            case 2:
                str = "audio/amr-wb";
                break;
            case 3:
            case 4:
            case 5:
                str = "audio/mp4a-latm";
                break;
            case 6:
                str = "audio/vorbis";
                break;
            case 7:
                str = "audio/opus";
                break;
            default:
                str = "audio/none";
                break;
        }
        int i3 = camcorderProfile.audioBitRate;
        int i4 = camcorderProfile.audioSampleRate;
        int i5 = camcorderProfile.audioChannels;
        if (i2 != 3) {
            i = 5;
            if (i2 != 4) {
                i = i2 != 5 ? -1 : 39;
            }
        } else {
            i = 2;
        }
        arrayList.add(i1.a.create(i2, str, i3, i4, i5, i));
        return arrayList;
    }

    private static List<i1.c> toVideoProfiles(CamcorderProfile camcorderProfile) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.videoCodec;
        switch (i) {
            case 1:
                str = "video/3gpp";
                break;
            case 2:
                str = "video/avc";
                break;
            case 3:
                str = "video/mp4v-es";
                break;
            case 4:
                str = "video/x-vnd.on2.vp8";
                break;
            case 5:
                str = "video/hevc";
                break;
            case 6:
                str = "video/x-vnd.on2.vp9";
                break;
            case 7:
                str = "video/dolby-vision";
                break;
            case 8:
                str = "video/av01";
                break;
            default:
                str = "video/none";
                break;
        }
        arrayList.add(i1.c.create(i, str, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
