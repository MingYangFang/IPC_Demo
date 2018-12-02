package com.ryg.aidl.chapter_2.ipc_demo;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {

    private int bookID;
    private String bookName;


    public Book(int bookID, String bookName) {
        this.bookID = bookID;
        this.bookName = bookName;
    }

    protected Book(Parcel in) {

        bookID= in.readInt();
        bookName=in.readString();
    }





    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(bookID);
        parcel.writeString(bookName);


    }
}
