
package com.mim.airvet.classes;

import java.util.List;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Details implements Parcelable
{

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("info")
    @Expose
    private Info info;
    public final static Creator<Details> CREATOR = new Creator<Details>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Details createFromParcel(android.os.Parcel in) {
            return new Details(in);
        }

        public Details[] newArray(int size) {
            return (new Details[size]);
        }

    }
    ;

    protected Details(android.os.Parcel in) {
        in.readList(this.results, (Result.class.getClassLoader()));
        this.info = ((Info) in.readValue((Info.class.getClassLoader())));
    }

    public Details() {
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(results);
        dest.writeValue(info);
    }

    public int describeContents() {
        return  0;
    }

}
