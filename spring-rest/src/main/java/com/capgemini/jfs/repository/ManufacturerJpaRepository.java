package com.capgemini.jfs.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jfs.model.Manufacturer;

@Repository
public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {
	List<Manufacturer> findByFoundedDateBefore(Date date);

	List<Manufacturer> findByActiveTrue();

	List<Manufacturer> findByActiveFalse();

	List<Manufacturer> getAllThatSellAcoustics(String name);
}
