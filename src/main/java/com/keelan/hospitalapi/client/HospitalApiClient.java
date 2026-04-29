package com.keelan.hospitalapi.client;

import com.keelan.hospitalapi.model.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Component
public class HospitalApiClient {

    private final String BASE_URL =
            "https://web.socem.plymouth.ac.uk/COMP2005/api/";

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Patient> getPatients() {
        Patient[] response = restTemplate.getForObject(BASE_URL + "Patients", Patient[].class);
        return Arrays.asList(response);
    }

    public List<Admission> getAdmissions() {
        Admission[] response =
                restTemplate.getForObject(BASE_URL + "Admissions", Admission[].class);

        return Arrays.asList(response);
    }

    public List<RoomAllocation> getRoomAllocations() {
        RoomAllocation[] response =
                restTemplate.getForObject(BASE_URL + "RoomAllocations", RoomAllocation[].class);

        return Arrays.asList(response);
    }
}