package com.alliance.entitlements.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alliance.entitlements.swagger.entities.Entitlement;

@Repository
public interface EntitlementRepository extends JpaRepository<Entitlement, Long> {
	
}
