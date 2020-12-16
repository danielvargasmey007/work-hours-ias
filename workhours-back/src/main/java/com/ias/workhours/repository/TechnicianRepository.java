package com.ias.workhours.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ias.workhours.model.Technician;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, String> {

}
