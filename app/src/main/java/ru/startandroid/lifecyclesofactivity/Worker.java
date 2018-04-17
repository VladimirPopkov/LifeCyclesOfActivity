package ru.startandroid.lifecyclesofactivity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by v.popkov on 17.04.2018.
 */
public class Worker implements Parcelable {

    private String mName;
    private String mPosition;

    public Worker(String name, String position){
        mName = name;
        mPosition = position;
    }

    public String getName() {
        return mName;
    }

    public String getPosition() {
        return mPosition;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName);
        parcel.writeString(mPosition);
    }

    public static final Parcelable.Creator<Worker> CREATOR = new Parcelable.Creator<Worker>() {
        // распаковываем объект из Parcel
        public Worker createFromParcel(Parcel in) {
            return new Worker(in);
        }

        public Worker[] newArray(int size) {
            return new Worker[size];
        }
    };

    private Worker(Parcel parcel) {
        mName = parcel.readString();
        mPosition = parcel.readString();
    }
}
