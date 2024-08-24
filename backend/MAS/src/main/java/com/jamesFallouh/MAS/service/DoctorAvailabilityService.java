/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.service;

import com.jamesFallouh.MAS.exception.MASException;
import com.jamesFallouh.MAS.model.DoctorAvailability;
import com.jamesFallouh.MAS.repository.DoctorAvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorAvailabilityService {

    private final DoctorAvailabilityRepository doctorAvailabilityRepository;

    @Autowired
    public DoctorAvailabilityService(DoctorAvailabilityRepository doctorAvailabilityRepository) {
        this.doctorAvailabilityRepository = doctorAvailabilityRepository;
    }

    public List<DoctorAvailability> getAvailabilitiesByDoctorId(Long doctorId) {
        return doctorAvailabilityRepository.findByDoctorId(doctorId);
    }

    public DoctorAvailability addAvailability(DoctorAvailability doctorAvailability) {
        return doctorAvailabilityRepository.save(doctorAvailability);
    }

    public DoctorAvailability updateAvailability(Long id, String newTime) {
        DoctorAvailability availability = doctorAvailabilityRepository.findById(id)
                .orElseThrow(() -> new MASException("Availability not found for id " + id));
        availability.setAvailabilityTime(newTime);
        return doctorAvailabilityRepository.save(availability);
    }

    public void deleteAvailability(Long id) {
        doctorAvailabilityRepository.deleteById(id);
    }

    public List<DoctorAvailability> getAvailableSlots(Long doctorId) {
        return doctorAvailabilityRepository.findByDoctorId(doctorId);
    }
}
