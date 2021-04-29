package com.eastflag.restjpasecurity.repository;

import com.eastflag.restjpasecurity.models.ERole;
import com.eastflag.restjpasecurity.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
