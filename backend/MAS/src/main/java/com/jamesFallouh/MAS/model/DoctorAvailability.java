/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "doctor_availability")
@Data
public class DoctorAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @Column(name = "availability_date")
    private String availabilityDate;

    @Column(name = "availability_time")
    private String availabilityTime;
}
