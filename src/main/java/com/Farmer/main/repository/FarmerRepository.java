package com.Farmer.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Farmer.main.model.Farmer;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long>{

}
