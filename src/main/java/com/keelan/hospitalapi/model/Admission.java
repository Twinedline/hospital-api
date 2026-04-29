package com.keelan.hospitalapi.model;

public class Admission {

    private int id;
    private String admissionDate;
    private String dischargeDate;
    private int patientID;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAdmissionDate() { return admissionDate; }
    public void setAdmissionDate(String admissionDate) { this.admissionDate = admissionDate; }

    public String getDischargeDate() { return dischargeDate; }
    public void setDischargeDate(String dischargeDate) { this.dischargeDate = dischargeDate; }

    public int getPatientID() { return patientID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }
}