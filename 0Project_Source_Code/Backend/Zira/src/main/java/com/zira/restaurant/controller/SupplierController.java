package com.zira.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zira.restaurant.model.Supplier;
import com.zira.restaurant.repository.SupplierRepository;
import com.zira.restaurant.service.SupplierService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	@PostMapping("/registerSupplier")
	public void registerSupplier(@RequestBody Supplier supplier) {
		supplierService.registerSupplier(supplier);
	}

	@GetMapping("/getSuppliers")
	public List<Supplier> getSupplier() {
		return supplierService.getSupplier();
	}

	@DeleteMapping("/deleteSupplier")
	public void deleteSupplier(@RequestParam Long supplierId) {
		supplierService.deleteSupplier(supplierId);
	}

	@PutMapping("/updateSupplier")
	public Supplier updateSupplier(@RequestBody Supplier supplier) {
		return supplierService.updateSupplier(supplier);
	}

}
