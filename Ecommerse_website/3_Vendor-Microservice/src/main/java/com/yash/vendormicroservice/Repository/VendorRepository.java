package com.yash.vendormicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.vendormicroservice.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer>{

}
