/**
 * 
 */
package com.alliance.entitlements.swagger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entitlements.swagger.entities.Status;

/**
 * @author hongyi.a.song
 *
 */
@RestController
public class StatusController {

	@RequestMapping(value = "getStatus")
	public ResponseEntity<?> getStatusModel(){
		
		Status model = new Status();
		
		return ResponseEntity.ok(model);
	}
}
