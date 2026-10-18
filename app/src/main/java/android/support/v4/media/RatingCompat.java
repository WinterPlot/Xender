package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    private final int a;
    private final float b;
    private Object c;

    public RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
            }
            ratingCompatNewUnratedRating.c = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public static RatingCompat newHeartRating(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat newStarRating(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat newThumbRating(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.a;
    }

    public float getPercentRating() {
        if (this.a == 6 && isRated()) {
            return this.b;
        }
        return -1.0f;
    }

    public Object getRating() {
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        boolean zIsRated = isRated();
        int i = this.a;
        if (!zIsRated) {
            Rating ratingNewUnratedRating = Rating.newUnratedRating(i);
            this.c = ratingNewUnratedRating;
            return ratingNewUnratedRating;
        }
        switch (i) {
            case 1:
                Rating ratingNewHeartRating = Rating.newHeartRating(hasHeart());
                this.c = ratingNewHeartRating;
                return ratingNewHeartRating;
            case 2:
                Rating ratingNewThumbRating = Rating.newThumbRating(isThumbUp());
                this.c = ratingNewThumbRating;
                return ratingNewThumbRating;
            case 3:
            case 4:
            case 5:
                Rating ratingNewStarRating = Rating.newStarRating(i, getStarRating());
                this.c = ratingNewStarRating;
                return ratingNewStarRating;
            case 6:
                Rating ratingNewPercentageRating = Rating.newPercentageRating(getPercentRating());
                this.c = ratingNewPercentageRating;
                return ratingNewPercentageRating;
            default:
                return null;
        }
    }

    public int getRatingStyle() {
        return this.a;
    }

    public float getStarRating() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && isRated()) {
            return this.b;
        }
        return -1.0f;
    }

    public boolean hasHeart() {
        return this.a == 1 && this.b == 1.0f;
    }

    public boolean isRated() {
        return this.b >= 0.0f;
    }

    public boolean isThumbUp() {
        return this.a == 2 && this.b == 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Parcelable.Creator<RatingCompat> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }
}
