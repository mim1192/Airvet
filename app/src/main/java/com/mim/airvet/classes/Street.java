
package com.mim.airvet.classes;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Street implements Parcelable {

    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("name")
    @Expose
    private String name;

    protected Street(Parcel in) {
        if (in.readByte() == 0) {
            number = null;
        } else {
            number = in.readInt();
        }
        name = in.readString();
    }

    public static final Creator<Street> CREATOR = new Creator<Street>() {
        @Override
        public Street createFromParcel(Parcel in) {
            return new Street(in);
        }

        @Override
        public Street[] newArray(int size) {
            return new Street[size];
        }
    };

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (number == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(number);
        }
        dest.writeString(name);
    }
}
