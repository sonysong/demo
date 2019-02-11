/**
 * 
 */
package com.alliance.entitlements.swagger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entitlements.swagger.entities.StatusModel;

/**
 * @author hongyi.a.song
 *
 */
@RestController
public class StatusModelController {

	@RequestMapping(value = "getStatusModel")
	public ResponseEntity<?> getStatusModel(){
		
		StatusModel model = new StatusModel();
		
		return ResponseEntity.ok(model);
	}
}
