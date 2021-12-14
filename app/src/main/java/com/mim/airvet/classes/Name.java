
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Name implements Parcelable
{

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("last")
    @Expose
    private String last;
    public final static Creator<Name> CREATOR = new Creator<Name>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Name createFromParcel(android.os.Parcel in) {
            return new Name(in);
        }

        public Name[] newArray(int size) {
            return (new Name[size]);
        }

    }
    ;

    protected Name(android.os.Parcel in) {
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.first = ((String) in.readValue((String.class.getClassLoader())));
        this.last = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Name() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeValue(first);
        dest.writeValue(last);
    }

    public int describeContents() {
        return  0;
    }

}
