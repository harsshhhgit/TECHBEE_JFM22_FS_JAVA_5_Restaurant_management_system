package com.zira.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zira.restaurant.model.Supplier;
import com.zira.restaurant.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	public Supplier registerSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
	}

	public List<Supplier> getSupplier() {
		return (List<Supplier>) supplierRepository.findAll();
	}

	public void deleteSupplier(Long supplierId) {
		supplierRepository.deleteById(supplierId);
	}
	
	public Supplier updateSupplier(Supplier supplier) {
		Long id = supplier.getSupplierId();
		Supplier sutd = supplierRepository.findById(id).get();
		sutd.setFirstName(supplier.getFirstName());
		sutd.setLastName(supplier.getLastName());
		sutd.setCity(supplier.getCity());
		sutd.setEmailId(supplier.getEmailId());
		sutd.setPhoneNumber(supplier.getPhoneNumber());
		return supplierRepository.save(sutd);
	}

}



