/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.repository;

import com.jamesFallouh.MAS.model.DoctorAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DoctorAvailabilityRepository extends JpaRepository<DoctorAvailability, Long> {
    List<DoctorAvailability> findByDoctorId(Long doctorId);
}
