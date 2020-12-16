package com.ias.workhours.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ias.workhours.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, String> {

}
