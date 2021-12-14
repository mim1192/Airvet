
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Info implements Parcelable
{

    @SerializedName("seed")
    @Expose
    private Object seed;
    @SerializedName("results")
    @Expose
    private Object results;
    @SerializedName("page")
    @Expose
    private Object page;
    @SerializedName("version")
    @Expose
    private Object version;
    public final static Creator<Info> CREATOR = new Creator<Info>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Info createFromParcel(android.os.Parcel in) {
            return new Info(in);
        }

        public Info[] newArray(int size) {
            return (new Info[size]);
        }

    }
    ;

    protected Info(android.os.Parcel in) {
        this.seed = ((Object) in.readValue((Object.class.getClassLoader())));
        this.results = ((Object) in.readValue((Object.class.getClassLoader())));
        this.page = ((Object) in.readValue((Object.class.getClassLoader())));
        this.version = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Info() {
    }

    public Object getSeed() {
        return seed;
    }

    public void setSeed(Object seed) {
        this.seed = seed;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }

    public Object getPage() {
        return page;
    }

    public void setPage(Object page) {
        this.page = page;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(seed);
        dest.writeValue(results);
        dest.writeValue(page);
        dest.writeValue(version);
    }

    public int describeContents() {
        return  0;
    }

}
