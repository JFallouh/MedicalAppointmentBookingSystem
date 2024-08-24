/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.controller;

import com.jamesFallouh.MAS.model.DoctorAvailability;
import com.jamesFallouh.MAS.service.DoctorAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor-availability")
public class DoctorAvailabilityController {

    private final DoctorAvailabilityService doctorAvailabilityService;

    @Autowired
    public DoctorAvailabilityController(DoctorAvailabilityService doctorAvailabilityService) {
        this.doctorAvailabilityService = doctorAvailabilityService;
    }

    @GetMapping("/doctor/{doctorId}")
    public List<DoctorAvailability> getAvailabilitiesByDoctorId(@PathVariable Long doctorId) {
        return doctorAvailabilityService.getAvailabilitiesByDoctorId(doctorId);
    }

    @PostMapping
    public DoctorAvailability addAvailability(@RequestBody DoctorAvailability doctorAvailability) {
        return doctorAvailabilityService.addAvailability(doctorAvailability);
    }

    @PutMapping("/{id}")
    public DoctorAvailability updateAvailability(@PathVariable Long id, @RequestBody String newTime) {
        return doctorAvailabilityService.updateAvailability(id, newTime);
    }

    @DeleteMapping("/{id}")
    public void deleteAvailability(@PathVariable Long id) {
        doctorAvailabilityService.deleteAvailability(id);
    }

    @GetMapping("/slots/{doctorId}")
    public List<DoctorAvailability> getAvailableSlots(@PathVariable Long doctorId) {
        return doctorAvailabilityService.getAvailableSlots(doctorId);
    }
}
