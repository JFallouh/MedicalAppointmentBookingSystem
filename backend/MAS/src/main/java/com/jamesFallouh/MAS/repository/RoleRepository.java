/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.repository;

import com.jamesFallouh.MAS.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
