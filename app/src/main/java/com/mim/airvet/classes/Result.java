
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Result implements Parcelable
{

    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("login")
    @Expose
    private Login login;
    @SerializedName("dob")
    @Expose
    private Dob dob;
    @SerializedName("registered")
    @Expose
    private Registered registered;
    @SerializedName("phone")
    @Expose
    private Object phone;
    @SerializedName("cell")
    @Expose
    private Object cell;
    @SerializedName("id")
    @Expose
    private Id id;
    @SerializedName("picture")
    @Expose
    private Picture picture;
    @SerializedName("nat")
    @Expose
    private Object nat;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(android.os.Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;

    protected Result(android.os.Parcel in) {
        this.gender = ((Object) in.readValue((Object.class.getClassLoader())));
        this.name = ((Name) in.readValue((Name.class.getClassLoader())));
        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
        this.email = ((Object) in.readValue((Object.class.getClassLoader())));
        this.login = ((Login) in.readValue((Login.class.getClassLoader())));
        this.dob = ((Dob) in.readValue((Dob.class.getClassLoader())));
        this.registered = ((Registered) in.readValue((Registered.class.getClassLoader())));
        this.phone = ((Object) in.readValue((Object.class.getClassLoader())));
        this.cell = ((Object) in.readValue((Object.class.getClassLoader())));
        this.id = ((Id) in.readValue((Id.class.getClassLoader())));
        this.picture = ((Picture) in.readValue((Picture.class.getClassLoader())));
        this.nat = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Result() {
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public Registered getRegistered() {
        return registered;
    }

    public void setRegistered(Registered registered) {
        this.registered = registered;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getCell() {
        return cell;
    }

    public void setCell(Object cell) {
        this.cell = cell;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Object getNat() {
        return nat;
    }

    public void setNat(Object nat) {
        this.nat = nat;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(gender);
        dest.writeValue(name);
        dest.writeValue(location);
        dest.writeValue(email);
        dest.writeValue(login);
        dest.writeValue(dob);
        dest.writeValue(registered);
        dest.writeValue(phone);
        dest.writeValue(cell);
        dest.writeValue(id);
        dest.writeValue(picture);
        dest.writeValue(nat);
    }

    public int describeContents() {
        return  0;
    }

}
