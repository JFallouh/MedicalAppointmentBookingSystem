/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.repository;

import com.jamesFallouh.MAS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
