/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.repository;

import com.jamesFallouh.MAS.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
