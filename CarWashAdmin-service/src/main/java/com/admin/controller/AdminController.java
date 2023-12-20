package com.admin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.exceptions.WashPackNotFoundException;
import com.admin.models.WashPacks;
import com.admin.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	IAdminService adminService;

	@PostMapping("/add-washpack")
	public ResponseEntity<Object> bookWashPack(@RequestBody WashPacks packs) {
	    WashPacks packs2 = adminService.addWashPack(packs);
	    
	    return new ResponseEntity<>(packs2, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<WashPacks>> getAllWashpacks(){
	List<WashPacks> list = adminService.findAllWashPacks();
	return new ResponseEntity<>(list,HttpStatus.OK);
	}                                                                  

	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateWashPack(@PathVariable Integer id,@RequestBody WashPacks packs) throws WashPackNotFoundException{
		Object pack2=adminService.updateWashPack(id,packs);
		return new ResponseEntity<Object>(pack2,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteWashPack(@PathVariable Integer id) {
		boolean delete=adminService.deleteWashPack(id) != null;
		
		if(delete) {
			return new ResponseEntity<String>("Deleted",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("WashPack with "+id+" not found ",HttpStatus.OK);
		}
	}
	
}
