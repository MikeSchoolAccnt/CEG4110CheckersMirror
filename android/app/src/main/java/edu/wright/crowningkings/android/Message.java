package edu.wright.crowningkings.android;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by eric on 11/13/15. Modified by csmith on 11/17/16 for CrowningKings
 */
public class Message implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Message createFromParcel(Parcel in) {
            return new Message(in);
        }

        public Message[] newArray(int size) {
            return new Message[size];
        }
    };
    public String text;
    public long date;
    public String id;
    public String handleID;
    public long cROWID;
    MessageType messageType;
    MessageStatus messageStatus;

    public Message(String text) {
        this(text, MessageType.RECEIVED, MessageStatus.UNSUCCESSFUL, "unknown", -1);
    }

    public Message(String text, MessageType messageType, MessageStatus messageStatus, String handleID) {
        this(text, messageType, messageStatus, handleID, -1);
    }

    public Message(String text, MessageType messageType, MessageStatus messageStatus, String handleID, long date) {
        this.text = text;
        this.messageType = messageType;
        this.messageStatus = messageStatus;
        this.handleID = handleID;
        this.date = date;
    }

    public Message(Parcel in) {
        this.text = in.readString();
        this.date = in.readLong();
        this.id = in.readString();
        this.handleID = in.readString();
        this.cROWID = in.readLong();
        this.messageType = in.readParcelable(getClass().getClassLoader());
        this.messageStatus = in.readParcelable(getClass().getClassLoader());
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setHandleID(String handleID) {
        this.handleID = handleID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return "from:" + handleID + "||" + text;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text);
        parcel.writeLong(date);
        parcel.writeString(id);
        parcel.writeString(handleID);
        parcel.writeLong(cROWID);
        parcel.writeParcelable(messageType, i);
        parcel.writeParcelable(messageStatus, i);
    }
}
