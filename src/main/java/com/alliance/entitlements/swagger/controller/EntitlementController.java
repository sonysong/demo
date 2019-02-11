package com.alliance.entitlements.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entitlements.swagger.entities.Entitlement;
import com.alliance.entitlements.swagger.repository.EntitlementRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(description = "Entitlement Class API")
@RequestMapping("/api/v1/entitlement")
public class EntitlementController {
	
	@Autowired
	EntitlementRepository repository;

	@ApiOperation(value = "get entitlement list for current login user", notes = "pay attention to the paramenters")
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public List<Entitlement> getEntitlements(
			@ApiParam(name = "userId", value = "id", required = true) @PathVariable("userId") String userId) {

		Entitlement entilement = new Entitlement();
		entilement.setEntitlementDocumentNumber(100L);

		List<Entitlement> list = new ArrayList<>();
		list.add(entilement);

	
		return list;
	}

//	@GetMapping(value = "/{userId}")
//	public List<Entitlement> getEntitlements(
//			@ApiParam(name = "pageNo", value = "pageNo", required = true) @RequestParam("pageNo") int pageNo,
//			@ApiParam(name = "pageSize", value = "pageSize", required = true) @RequestParam("pageSize") int pageSize,
//			@ApiParam(name = "userId", value = "id", required = true) @PathVariable("userId") String userId) {
//
//		Entitlement entilement = new Entitlement();
//		entilement.setEntitlementDocumentNumber(100L);
//
//		List<Entitlement> list = new ArrayList<>();
//		list.add(entilement);
//
//		return repository.findAll();
//	}

	@RequestMapping(value = "/demo1", method = RequestMethod.POST)
	@ApiOperation(value = "getDemo", notes = "user name has to be input", code = 200, produces = "application/json")
	public ModelMap getDemo(@RequestParam("userName") String userName) {
		ModelMap map = new ModelMap();
		map.addAttribute("userName", userName);
		return map;
	}

}
