
package com.mim.airvet.classes;


import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Location implements Parcelable
{

    @SerializedName("street")
    @Expose
    private Street street;
    @SerializedName("city")
    @Expose
    private Object city;
    @SerializedName("state")
    @Expose
    private Object state;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("postcode")
    @Expose
    private Object postcode;
    @SerializedName("coordinates")
    @Expose
    private Coordinates coordinates;
    @SerializedName("timezone")
    @Expose
    private Timezone timezone;
    public final static Creator<Location> CREATOR = new Creator<Location>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Location createFromParcel(android.os.Parcel in) {
            return new Location(in);
        }

        public Location[] newArray(int size) {
            return (new Location[size]);
        }

    }
    ;

    protected Location(android.os.Parcel in) {
        this.street = ((Street) in.readValue((Street.class.getClassLoader())));
        this.city = ((Object) in.readValue((Object.class.getClassLoader())));
        this.state = ((Object) in.readValue((Object.class.getClassLoader())));
        this.country = ((Object) in.readValue((Object.class.getClassLoader())));
        this.postcode = ((Object) in.readValue((Object.class.getClassLoader())));
        this.coordinates = ((Coordinates) in.readValue((Coordinates.class.getClassLoader())));
        this.timezone = ((Timezone) in.readValue((Timezone.class.getClassLoader())));
    }

    public Location() {
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getPostcode() {
        return postcode;
    }

    public void setPostcode(Object postcode) {
        this.postcode = postcode;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(street);
        dest.writeValue(city);
        dest.writeValue(state);
        dest.writeValue(country);
        dest.writeValue(postcode);
        dest.writeValue(coordinates);
        dest.writeValue(timezone);
    }

    public int describeContents() {
        return  0;
    }

}
