
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
    private Object title;
    @SerializedName("first")
    @Expose
    private Object first;
    @SerializedName("last")
    @Expose
    private Object last;
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
        this.title = ((Object) in.readValue((Object.class.getClassLoader())));
        this.first = ((Object) in.readValue((Object.class.getClassLoader())));
        this.last = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Name() {
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getLast() {
        return last;
    }

    public void setLast(Object last) {
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
