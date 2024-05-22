package com.pokemonreview.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemonreview.api.models.Role;
import com.pokemonreview.api.repository.RoleRepository;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	@Autowired
	private RoleRepository roleRepository;
	 @PostMapping("save/{roleName}")
	    public ResponseEntity<String> create(@PathVariable String roleName) {
	        
	        Role role = new Role();
	        role.setName(roleName);
	        roleRepository.save(role);
	        return new ResponseEntity<>("User roles success!", HttpStatus.OK);
	 }
}
