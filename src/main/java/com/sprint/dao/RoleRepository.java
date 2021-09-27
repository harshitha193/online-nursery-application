package com.sprint.dao;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint.entities.Roles;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	Optional<Role> findByRoleName(Roles role);
}
