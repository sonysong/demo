package com.alliance.entitlements.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alliance.entitlements.swagger.entities.StatusModel;

@Repository
public interface StatusModleRepository extends JpaRepository<StatusModel, String> {

	// public StatusModel findCustomerById(int id);
	//
	// @Query(value = "SELECT c.name, a.country FROM entitlement.customer_tb c,
	// entitlement.address1_tb a WHERE c.address1_id=a.id and c.id = ?1",
	// nativeQuery = true)
	// public StatusModel findOneById(int id);
	//
	// public Collection<StatusModel> findAllDtoedBy();
	//
	// @Query("select new
	// com.sample.sapUI.odata.domain.CustomerAddress1Dto(c.name) from Customer c
	// where c.id = ?1")
	// public Collection<StatusModel> getDtosBy(Integer id);

	// @Query("select new
	// com.sample.sapUI.odata.domain.CustomerAddress1Dto(c.name, a.country) from
	// Customer c, IN (c.address1) a ")
	// public List<CustomerAddress1Dto> getDtos();

	// @Query(value = "SELECT c.name, a.country FROM entitlement.customer_tb c,
	// entitlement.address1_tb a WHERE c.address1_id=a.id", nativeQuery = true)
	// public List<CustomerAddress1Dto> getDtos();

}
