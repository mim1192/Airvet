
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Picture implements Parcelable
{

    @SerializedName("large")
    @Expose
    private Object large;
    @SerializedName("medium")
    @Expose
    private Object medium;
    @SerializedName("thumbnail")
    @Expose
    private Object thumbnail;
    public final static Creator<Picture> CREATOR = new Creator<Picture>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Picture createFromParcel(android.os.Parcel in) {
            return new Picture(in);
        }

        public Picture[] newArray(int size) {
            return (new Picture[size]);
        }

    }
    ;

    protected Picture(android.os.Parcel in) {
        this.large = ((Object) in.readValue((Object.class.getClassLoader())));
        this.medium = ((Object) in.readValue((Object.class.getClassLoader())));
        this.thumbnail = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Picture() {
    }

    public Object getLarge() {
        return large;
    }

    public void setLarge(Object large) {
        this.large = large;
    }

    public Object getMedium() {
        return medium;
    }

    public void setMedium(Object medium) {
        this.medium = medium;
    }

    public Object getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Object thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(large);
        dest.writeValue(medium);
        dest.writeValue(thumbnail);
    }

    public int describeContents() {
        return  0;
    }

}
