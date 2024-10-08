/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    private String username;

    private String password;

    private boolean enabled;
}
