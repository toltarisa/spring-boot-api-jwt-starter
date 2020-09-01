package com.springbootjwtstarter.repository;

import com.springbootjwtstarter.model.Role;
import com.springbootjwtstarter.model.RoleTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleTypes name);
}
