package com.keelan.hospitalapi.model;

public class RoomAllocation {

    private int id;
    private int admissionID;
    private int roomID;
    private String timeIn;
    private String timeOut;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getAdmissionID() { return admissionID; }
    public void setAdmissionID(int admissionID) { this.admissionID = admissionID; }

    public int getRoomID() { return roomID; }
    public void setRoomID(int roomID) { this.roomID = roomID; }

    public String getTimeIn() { return timeIn; }
    public void setTimeIn(String timeIn) { this.timeIn = timeIn; }

    public String getTimeOut() { return timeOut; }
    public void setTimeOut(String timeOut) { this.timeOut = timeOut; }
}