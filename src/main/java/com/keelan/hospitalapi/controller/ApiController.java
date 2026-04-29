package com.keelan.hospitalapi.controller;

import com.keelan.hospitalapi.client.HospitalApiClient;
import com.keelan.hospitalapi.model.Admission;
import com.keelan.hospitalapi.model.Patient;
import com.keelan.hospitalapi.model.RoomAllocation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final HospitalApiClient client;

    public ApiController(HospitalApiClient client) {
        this.client = client;
    }

    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return client.getPatients();
    }

    @GetMapping("/admissions")
    public List<Admission> getAdmissions() {
        return client.getAdmissions();
    }

    @GetMapping("/room-allocations")
    public List<RoomAllocation> getRoomAllocations() {
        return client.getRoomAllocations();
    }

}