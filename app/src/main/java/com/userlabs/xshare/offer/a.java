package com.userlabs.xshare.offer;

import com.userlabs.xshare.core.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static List<Integer> getRandomAvatars() {
        Integer[] numArr = {Integer.valueOf(R.drawable.recommend_photo_1), Integer.valueOf(R.drawable.recommend_photo_2), Integer.valueOf(R.drawable.recommend_photo_3), Integer.valueOf(R.drawable.recommend_photo_4), Integer.valueOf(R.drawable.recommend_photo_5), Integer.valueOf(R.drawable.recommend_photo_6), Integer.valueOf(R.drawable.recommend_photo_7), Integer.valueOf(R.drawable.recommend_photo_8), Integer.valueOf(R.drawable.recommend_photo_9), Integer.valueOf(R.drawable.recommend_photo_10)};
        Random random = new Random();
        HashSet hashSet = new HashSet();
        while (hashSet.size() < 3) {
            hashSet.add(numArr[random.nextInt(10)]);
        }
        return new ArrayList(hashSet);
    }
}
