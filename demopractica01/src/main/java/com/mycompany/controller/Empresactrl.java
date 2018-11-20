package com.mycompany.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.modell.Empresa;
import com.mycompany.service.EmpresaService;

@RestController
@RequestMapping(value="/api/emp")


public class Empresactrl {
	
	@Autowired
	
	EmpresaService empService;
	
	@GetMapping(value="/all")
 protected List<Empresa> allEmp(){
	 return empService.findAllEmps();
 } 
	@PostMapping("/ifexist")
 protected boolean isExistEmp(@RequestBody Empresa emp){
	 return empService.isEmpExist(emp);
 }
	
	@PostMapping(value="/save")
 protected void save(@RequestBody Empresa emp){
		
		if(empService.isEmpExist(emp)) {
			empService.updateEmp(emp);
			System.out.println("la empresa ha sido actualizado");
			
		}else {
			empService.saveEmp(emp);
			System.out.println("la empresa ha sido creado");
		}
		empService.saveEmp(emp);
	 
 }
	@GetMapping(value="/update")
 protected String update(){
	 return "Welcome a spring boot";
 }	
	@GetMapping(value="/delete")
 protected String delete(){
	 return "Welcome a spring boot";
 }	
}

