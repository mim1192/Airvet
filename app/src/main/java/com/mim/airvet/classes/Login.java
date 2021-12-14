
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Login implements Parcelable
{

    @SerializedName("uuid")
    @Expose
    private Object uuid;
    @SerializedName("username")
    @Expose
    private Object username;
    @SerializedName("password")
    @Expose
    private Object password;
    @SerializedName("salt")
    @Expose
    private Object salt;
    @SerializedName("md5")
    @Expose
    private Object md5;
    @SerializedName("sha1")
    @Expose
    private Object sha1;
    @SerializedName("sha256")
    @Expose
    private Object sha256;
    public final static Creator<Login> CREATOR = new Creator<Login>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Login createFromParcel(android.os.Parcel in) {
            return new Login(in);
        }

        public Login[] newArray(int size) {
            return (new Login[size]);
        }

    }
    ;

    protected Login(android.os.Parcel in) {
        this.uuid = ((Object) in.readValue((Object.class.getClassLoader())));
        this.username = ((Object) in.readValue((Object.class.getClassLoader())));
        this.password = ((Object) in.readValue((Object.class.getClassLoader())));
        this.salt = ((Object) in.readValue((Object.class.getClassLoader())));
        this.md5 = ((Object) in.readValue((Object.class.getClassLoader())));
        this.sha1 = ((Object) in.readValue((Object.class.getClassLoader())));
        this.sha256 = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Login() {
    }

    public Object getUuid() {
        return uuid;
    }

    public void setUuid(Object uuid) {
        this.uuid = uuid;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getSalt() {
        return salt;
    }

    public void setSalt(Object salt) {
        this.salt = salt;
    }

    public Object getMd5() {
        return md5;
    }

    public void setMd5(Object md5) {
        this.md5 = md5;
    }

    public Object getSha1() {
        return sha1;
    }

    public void setSha1(Object sha1) {
        this.sha1 = sha1;
    }

    public Object getSha256() {
        return sha256;
    }

    public void setSha256(Object sha256) {
        this.sha256 = sha256;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(uuid);
        dest.writeValue(username);
        dest.writeValue(password);
        dest.writeValue(salt);
        dest.writeValue(md5);
        dest.writeValue(sha1);
        dest.writeValue(sha256);
    }

    public int describeContents() {
        return  0;
    }

}
