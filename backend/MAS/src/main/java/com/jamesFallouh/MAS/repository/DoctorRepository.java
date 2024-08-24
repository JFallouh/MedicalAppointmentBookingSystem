/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.repository;

import com.jamesFallouh.MAS.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}