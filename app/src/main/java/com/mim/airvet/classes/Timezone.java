
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Timezone implements Parcelable
{

    @SerializedName("offset")
    @Expose
    private Object offset;
    @SerializedName("description")
    @Expose
    private Object description;
    public final static Creator<Timezone> CREATOR = new Creator<Timezone>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Timezone createFromParcel(android.os.Parcel in) {
            return new Timezone(in);
        }

        public Timezone[] newArray(int size) {
            return (new Timezone[size]);
        }

    }
    ;

    protected Timezone(android.os.Parcel in) {
        this.offset = ((Object) in.readValue((Object.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Timezone() {
    }

    public Object getOffset() {
        return offset;
    }

    public void setOffset(Object offset) {
        this.offset = offset;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(offset);
        dest.writeValue(description);
    }

    public int describeContents() {
        return  0;
    }

}
