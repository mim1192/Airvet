
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Dob implements Parcelable
{

    @SerializedName("date")
    @Expose
    private Object date;
    @SerializedName("age")
    @Expose
    private Object age;
    public final static Creator<Dob> CREATOR = new Creator<Dob>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Dob createFromParcel(android.os.Parcel in) {
            return new Dob(in);
        }

        public Dob[] newArray(int size) {
            return (new Dob[size]);
        }

    }
    ;

    protected Dob(android.os.Parcel in) {
        this.date = ((Object) in.readValue((Object.class.getClassLoader())));
        this.age = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Dob() {
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(date);
        dest.writeValue(age);
    }

    public int describeContents() {
        return  0;
    }

}
