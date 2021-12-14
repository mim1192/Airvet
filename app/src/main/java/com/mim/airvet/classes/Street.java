
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Street implements Parcelable
{

    @SerializedName("number")
    @Expose
    private Object number;
    @SerializedName("name")
    @Expose
    private Object name;
    public final static Creator<Street> CREATOR = new Creator<Street>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Street createFromParcel(android.os.Parcel in) {
            return new Street(in);
        }

        public Street[] newArray(int size) {
            return (new Street[size]);
        }

    }
    ;

    protected Street(android.os.Parcel in) {
        this.number = ((Object) in.readValue((Object.class.getClassLoader())));
        this.name = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Street() {
    }

    public Object getNumber() {
        return number;
    }

    public void setNumber(Object number) {
        this.number = number;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(number);
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
